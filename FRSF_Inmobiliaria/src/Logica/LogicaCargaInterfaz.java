package Logica;

import Clases.*;
import Persistencia.PersistenciaInterfaz;
import java.util.List;

public class LogicaCargaInterfaz {
    public List<Provincia> buscarProvincias(){
        return new PersistenciaInterfaz().getProvincias();        
    }
}
