/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Inmueble;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;


/**
 *
 * @author Gonzo
 */
public class ActualizarPagina {

    public static void actualizar(Inmueble inmueble){
        String direccion = inmueble.getCalle()+" "+String.valueOf(inmueble.getNumero());
        //String tipo = inmueble.getTipoInmueble();
        String antiguedad = String.valueOf(inmueble.getAntiguedad());
        String precio = "$"+String.valueOf(inmueble.getPrecio());
        String barrio = inmueble.getBarrio();
        String provincia = inmueble.getProvinciaNombre();
        String ciudad = inmueble.getLocalidadNombre();
        String supTerreno = String.valueOf(inmueble.getSupTerreno());
        String supInmueble = String.valueOf(inmueble.getSupInmueble());
        String dormitorios = String.valueOf(inmueble.getDormitorio());
        
        Element garage = new Element(Tag.valueOf("p"),"");
        Element patio = new Element(Tag.valueOf("p"),"");
        Element gn = new Element(Tag.valueOf("p"),"");
        Element ac = new Element(Tag.valueOf("p"),"");
        Element telefono = new Element(Tag.valueOf("p"),"");
        Element lavadero = new Element(Tag.valueOf("p"),"");
        Element pavimento = new Element(Tag.valueOf("p"),"");
        Element observaciones = new Element(Tag.valueOf("p"),"");
        
        if(inmueble.getGarage()){
            garage.append("- Garage");
        }
        if(inmueble.getLavadero()){
            lavadero.append("- Lavadero");
        }
        if(inmueble.getGn()){
            gn.append("- GN");
        }
        if(inmueble.getAc()){
            gn.append("- Aire Acondicionado");
        }
        if(inmueble.getTelefono()){
            telefono.append("- Teléfono");
        }
        if(inmueble.getLavadero()){
            lavadero.append("- Lavadero");
        }
        if(inmueble.getPavimento()){
            pavimento.append("- Calle con pavimento");
        }
        if(inmueble.getObservaciones()!= null){
            observaciones.append("Observaciones: <br>"+inmueble.getObservaciones());
        }
        try{
        //Setear los archivos
        File input = new File("D:/Facu/Metodos Agiles/Metodos-Agiles/FRSF_Inmobiliaria/src/Pagina/index.html");
        Document doc = Jsoup.parse(input,"UTF-8");
        
        Element listaCasas = doc.body().getElementById("casas");
        
        //desselecciono el elemento activo de la lista
        Element selected = listaCasas.getElementById("selected");
        if(selected != null){
            Element refactor = new Element(Tag.valueOf("a"),"");
            refactor.attr("href",selected.attr("href")).attr("class","list-group-item");
            refactor.append(selected.html());
            selected.remove();
            listaCasas.append(refactor.toString());
        }
        //creo el nuevo elemento de la lista
        Element nuevaCasa = new Element(Tag.valueOf("a"),"");
        nuevaCasa.attr("id","selected").attr("href","#").attr("class","list-group-item active");
        nuevaCasa.append(direccion);
        //lo agrego a la lista
        listaCasas.append(nuevaCasa.toString());
        
        
        doc.body().getElementById("precio").append(precio);
        doc.body().getElementById("nombre").append("Nombre casa");
        Element aux1 = doc.body().getElementById("precio");
        Element aux2 = doc.body().getElementById("nombre");
        doc.body().getElementById("informacion").empty();
        doc.body().getElementById("informacion").append(aux1.toString());
        doc.body().getElementById("informacion").append(aux2.toString());
        doc.body().getElementById("informacion").append(garage.toString()).
                append(patio.toString()).
                append(gn.toString()).
                append(ac.toString()).
                append(telefono.toString()).
                append(lavadero.toString()).
                append(pavimento.toString()).
                append(observaciones.toString());
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(input))) {
            bw.write(doc.html());
        }
        //Abrir la página
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            URL htmlFile = new URL("file:///D:/Facu/Metodos%20Agiles/Metodos-Agiles/FRSF_Inmobiliaria/src/Pagina/index.html");
            Desktop.getDesktop().browse(htmlFile.toURI());
            //Desktop.getDesktop().open(input);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
