
package Persistencia;

import Clases.Provincia;
import Conexion.Conexion;
import java.util.List;

public class PersistenciaInterfaz {
    public List<Provincia> getProvincias() {
        return Conexion.getInstance().getSession().createCriteria(Provincia.class).list();
    }
}
