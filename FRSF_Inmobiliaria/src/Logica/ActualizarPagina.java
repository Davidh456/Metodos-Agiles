/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Foto;
import Clases.Inmueble;
import Persistencia.PersistenciaInmueble;
import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;


public class ActualizarPagina {
    public static void actializarPaginas(ArrayList<Inmueble> listaInmuebles){
        for(Inmueble i : listaInmuebles){
            actualizar(i);
        }
    }
    public static void actualizar(Inmueble inmueble){
        String direccion = inmueble.getCalle()+" "+String.valueOf(inmueble.getNumero());
        String tipo = "";
        switch(inmueble.getTipoInmueble()){
            case 0:
                tipo = "Casa";
                break;
            case 1:
                tipo = "Departament";
                break;
            case 2:
                tipo = "Galpon";
                break;
            case 3:
                tipo = "Local / Oficina";
                break;
            case 4:
                tipo = "Quinta";
                break;
            case 5:
                tipo = "Terreno";
                break;
        }
        List<Foto> fotos = (new PersistenciaInmueble().fotosInmueble(inmueble));
        ArrayList<String> pathFotos = new ArrayList<String>();
        int i = 0;
        for(Foto f: fotos){
            try {
                // convert byte array back to BufferedImage
                InputStream in = new ByteArrayInputStream(f.getImagen());
                BufferedImage bImageFromConvert = ImageIO.read(in);
                String nombre = "casa-"+inmueble.getId().toString()+"-"+i+".jpg";
                String path = "D:/Facu/Metodos Agiles/Metodos-Agiles/FRSF_Inmobiliaria/src/Pagina/Images/"+nombre;
                ImageIO.write(bImageFromConvert, "jpg", new File(
                                path));
                pathFotos.add(path);
                i++;
            } catch (IOException e) {
                
            }
        }
        if(pathFotos.isEmpty()){
            pathFotos.add("D:/Facu/Metodos Agiles/Metodos-Agiles/FRSF_Inmobiliaria/src/Pagina/Images/noImagen.jpg");
        }
        Element slider = new Element(Tag.valueOf("ol"),"");
        slider.attr("id","slider").attr("class","carousel-indicators");
        Element galeria = new Element(Tag.valueOf("div"),"");
        galeria.attr("id","galeria").attr("class","carousel-inner");
        
        int j = 0;
        for(String path : pathFotos){
            Element boton = new Element(Tag.valueOf("li"),"");
            boton.attr("data-target","#carousel").attr("data-slide-to",String.valueOf(j));
            if(j==0){
                boton.attr("class","active");
            }
            Element foto = new Element(Tag.valueOf("img"),"");
            foto.attr("class","slide-image").attr("src",path).attr("alt","");
            Element divFoto = new Element(Tag.valueOf("div"),"");
            if(j==0){
                divFoto.attr("class","item active");
            }
            else{
                divFoto.attr("class","item");
            }
            divFoto.append(foto.toString());
            
            slider.append(boton.toString());
            galeria.append(divFoto.toString());
            j++;
        }
        
        // End fotos
        
        String precio = "$"+String.valueOf(inmueble.getPrecio());
        String barrio = inmueble.getBarrio();
        String provincia = inmueble.getProvinciaNombre();
        String ciudad = inmueble.getLocalidadNombre();
        String supTerreno = String.valueOf(inmueble.getSupTerreno());
        String supInmueble = String.valueOf(inmueble.getSupInmueble());
        String frente = String.valueOf(inmueble.getFrente());
        String dormitorios = String.valueOf(inmueble.getDormitorio());
        String banios = String.valueOf(inmueble.getBano());
        Element descripcion = new Element(Tag.valueOf("p"),"");
        String desc = "Excelente "+tipo+", Se encuentra en "+ciudad+", "+provincia;
        if(barrio.length()>0){
            desc = desc + ", en el barrio "+barrio;
        }
        desc = desc+"<br>Cuenta con un terreno con un frente de "+frente+" m. y una superficie de "+supTerreno+" m2";
        desc = desc+"<br>La construccion es de "+supInmueble+" m2.";
        if(Integer.valueOf(dormitorios)>0){
            desc = desc+"<br>"+dormitorios+" Dormitorios";
        }
        if(Integer.valueOf(banios)>0){
            desc = desc+"<br>"+banios+" Banos";
        }
        descripcion.append(desc);
        
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
        if(inmueble.getGn()){
            gn.append("- Gas Natural");
        }
        if(inmueble.getAc()){
            ac.append("- Aire Acondicionado");
        }
        if(inmueble.getTelefono()){
            telefono.append("- Telefono");
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
        
        //Saco el elemento informacion para luego volver a cargarlo "limpio"
        
        doc.body().getElementById("informacion").remove();
        
        doc.body().getElementById("galeria").remove();
        doc.body().getElementById("slider").remove();
        doc.body().getElementById("btnright").remove();
        doc.body().getElementById("btnleft").remove();
        
        Element btnLeft = new Element(Tag.valueOf("a"),"");
        btnLeft.attr("id","btnleft").
                attr("class","left carousel-control").
                attr("href","#carousel").
                attr("data-slide","prev");
        Element btnLeftDraw = new Element(Tag.valueOf("span"),"");
        btnLeftDraw.attr("class","glyphicon glyphicon-chevron-left");
        btnLeft.append(btnLeftDraw.toString());
        
        Element btnRight = new Element(Tag.valueOf("a"),"");
        btnRight.attr("id","btnright").
                attr("class","right carousel-control").
                attr("href","#carousel").
                attr("data-slide","next");
        Element btnRightDraw = new Element(Tag.valueOf("span"),"");
        btnRightDraw.attr("class","glyphicon glyphicon-chevron-right");
        btnRight.append(btnRightDraw.toString());
        
        doc.body().getElementById("carousel").append(slider.toString());
        doc.body().getElementById("carousel").append(galeria.toString());
        doc.body().getElementById("carousel").append(btnLeft.toString());
        doc.body().getElementById("carousel").append(btnRight.toString());
        
        Element precioElement = new Element(Tag.valueOf("h4"),"");
        precioElement.attr("id","precio").attr("class","pull-right").append(precio);
        Element nombreElement = new Element(Tag.valueOf("h4"),"").append(
        new Element(Tag.valueOf("a"),"").attr("id","nombre").attr("href","#").append(tipo).toString());
        
        Element info = new Element(Tag.valueOf("div"),"");
        Element previo = new Element(Tag.valueOf("p"),"").append("Cuenta con:");
        info.attr("id","informacion").attr("class","caption-full").
                append(precioElement.toString()).
                append(nombreElement.toString()).
                append(previo.toString()).
                append(descripcion.toString()).
                append(garage.toString()).
                append(patio.toString()).
                append(gn.toString()).
                append(ac.toString()).
                append(telefono.toString()).
                append(lavadero.toString()).
                append(pavimento.toString()).
                append(observaciones.toString());
        doc.body().getElementById("informationConteiner").append(info.toString());
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(input))) {
            bw.write(doc.html());
        }
        //Abrir la página
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            URL htmlFile = new URL("file:///D:/Facu/Metodos%20Agiles/Metodos-Agiles/FRSF_Inmobiliaria/src/Pagina/index.html");
            Desktop.getDesktop().browse(htmlFile.toURI());
            
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }   
}
