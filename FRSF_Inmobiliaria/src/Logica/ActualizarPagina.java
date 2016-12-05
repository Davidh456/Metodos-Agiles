/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Inmueble;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author Gonzo
 */
public class ActualizarPagina {

    public static void actualizar(Inmueble inmueble){
        try{
        //Setear los archivos
        
        //File input = new File("/Pagina/index.html");
        //Document doc = Jsoup.parse(input, "UTF-8", "http://frsfinmobiliaria.com.ar/");
        
        
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
