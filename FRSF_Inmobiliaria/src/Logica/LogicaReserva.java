/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Cliente;
import Clases.Inmueble;
import Clases.Reserva;
import Persistencia.PersistenciaInmueble;
import java.util.Date;

/**
 *
 * @author maria
 */
public class LogicaReserva {
    PersistenciaInmueble BDInmueble = new PersistenciaInmueble();

    public void GenerarReserva(Inmueble inmuebleReservado, Cliente clienteReserva, Float montoReserva, Date tiempoValidez) {
       //TODO validar todo respecto a reservas duplicadas y demas
       Reserva nuevaReserva= new Reserva(clienteReserva,inmuebleReservado,tiempoValidez,montoReserva);
       BDInmueble.guardarReserva(nuevaReserva);
    }
    
    
}
