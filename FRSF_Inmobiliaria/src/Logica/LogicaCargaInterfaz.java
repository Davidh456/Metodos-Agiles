package Logica;

import Clases.*;
import Persistencia.PersistenciaInterfaz;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class LogicaCargaInterfaz {
    public List<Provincia> buscarProvincias(){
        return new PersistenciaInterfaz().getProvincias();        
    }
    

    public static String[] ordenarLocalidades(Set<Localidad> localidades){
        String[] nombres = new String[localidades.size()];
        int i=0;
        for(Localidad l: localidades)
        {
            nombres[i]=l.getLocalidad();
            i++;
        }
        Arrays.sort(nombres);
        return nombres;
    }
    
}
