
package Logica;

import Clases.Cliente;
import Clases.Factura;
import Clases.Historiaventa;
import Clases.Inmueble;
import Clases.Vendedor;
import Persistencia.PersistenciaVenta;

public class LogicaVenta {

    public void GenerarVenta(Inmueble inmuebleVendido, Cliente cliente, Vendedor vendedor) {
       PersistenciaVenta operador = new PersistenciaVenta();
       Factura factura = new Factura(inmuebleVendido,cliente);
       Historiaventa historial= new Historiaventa(factura, vendedor);
       operador.GuardarFactura(factura);
       operador.GuardarHistoria(historial);
    }
    
}
