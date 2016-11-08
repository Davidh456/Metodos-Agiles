/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import Clases.Cliente;
import Clases.Inmueble;
import Logica.LogicaReserva;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author maria
 */
public class GenerarReservaInterfaz extends javax.swing.JPanel {

    /** Creates new form GenerarReservaInterfaz */
    Inmueble inmuebleReservado;
    Cliente clienteReserva;
    public GenerarReservaInterfaz() {
        initComponents();
    }

    
    GenerarReservaInterfaz(Inmueble inmSeleccionado) {
       inmuebleReservado=inmSeleccionado;
       initComponents(); 
       setSize(getPreferredSize());
       setLblCP(inmSeleccionado.getCp());
       setLblPiso(inmSeleccionado.getPiso());
       setLblBarrio(inmSeleccionado.getBarrio());
       setLblCalle(inmSeleccionado.getCalle());
       setLblDepto(inmSeleccionado.getDepto());
       setLblNumero(inmSeleccionado.getNumero());
       setLblPrecio(inmSeleccionado.getPrecio());  
       setLblProvincia(inmSeleccionado.getProvinciaNombre());
       setLblLocalidad(inmSeleccionado.getLocalidadNombre());
       setLblTipoInmueble(inmSeleccionado.getTipoInmueble());
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BSelecProp = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        label33 = new javax.swing.JLabel();
        label34 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label35 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblBarrio = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblCalle = new javax.swing.JLabel();
        lblPiso = new javax.swing.JLabel();
        lblDepto = new javax.swing.JLabel();
        lblLocalidad = new javax.swing.JLabel();
        lblProvincia = new javax.swing.JLabel();
        lblTipoInm = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblCP = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabe28 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNumDoc = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabe29 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        montoReserv = new javax.swing.JTextField();
        tiempoValidez = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Generar Reserva"));

        BSelecProp.setText("Seleccionar Cliente");
        BSelecProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecPropActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Inmueble"));
        jPanel1.setToolTipText("");

        label33.setText("Calle:");

        label34.setText("N�:");

        jLabel9.setText("Piso:");

        jLabel10.setText("Depto:");

        jLabel12.setText("Barrio:");

        jLabel2.setText("Provincia:");

        jLabel3.setText("Localidad:");

        label35.setText("Precio de vta (dolares):");

        jLabel14.setText("Tipo de inmueble:");

        jLabel1.setText("C.P:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(label33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(19, 19, 19))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label35)
                                .addGap(14, 14, 14)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(lblTipoInm, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                                .addContainerGap())
                            .addComponent(lblBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(lblLocalidad)
                    .addComponent(lblProvincia)
                    .addComponent(jLabel1)
                    .addComponent(lblCP))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label33)
                    .addComponent(jLabel12)
                    .addComponent(label34)
                    .addComponent(lblBarrio)
                    .addComponent(lblNumero)
                    .addComponent(lblCalle))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(label35)
                    .addComponent(jLabel14)
                    .addComponent(lblPiso)
                    .addComponent(lblDepto)
                    .addComponent(lblTipoInm)
                    .addComponent(lblPrecio))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Cliente"));

        jLabe28.setText("Nombre:");

        jLabel22.setText("Apellido:");

        jLabel27.setText("N� Documento:");

        lblNombre.setText("Ninguno");

        lblApellido.setText("Ninguno");

        lblNumDoc.setText("Ninguno");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabe28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNumDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabe28)
                    .addComponent(jLabel22)
                    .addComponent(jLabel27)
                    .addComponent(lblNombre)
                    .addComponent(lblApellido)
                    .addComponent(lblNumDoc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Datos de la Reserva"));

        jLabe29.setText("Monto de Reserva");

        jLabel23.setText("Tiempo de Validez (dias)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabe29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(montoReserv, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tiempoValidez, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabe29)
                    .addComponent(jLabel23)
                    .addComponent(montoReserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiempoValidez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BSelecProp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BSelecProp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("panelInmueble");
    }// </editor-fold>//GEN-END:initComponents

    private void BSelecPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecPropActionPerformed
        Inmobiliaria.getInstance().ListarClientes(this);
    }//GEN-LAST:event_BSelecPropActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LogicaReserva operador = new LogicaReserva();
        operador.GenerarReserva(inmuebleReservado,clienteReserva, getMontoReserva(),getTiempoValidez());
    }//GEN-LAST:event_jButton2ActionPerformed

    public void setLblApellido(String lblApellido) {
        this.lblApellido.setText(lblApellido);
    }

    public void setLblBarrio(String lblBarrio) {
        if(lblBarrio.equals("")){
            this.lblBarrio.setText("N/A");
        }else
            this.lblBarrio.setText(lblBarrio);
    }

    public void setLblCP(Integer lblCP) {
        this.lblCP.setText(String.valueOf(lblCP));
    }

    public void setLblCalle(String capturado) {
        this.lblCalle.setText(capturado);
    }

    public void setLblDepto(String capturado) {
         if(capturado.equals("")){
            this.lblDepto.setText("N/A");
         }else
            this.lblDepto.setText(capturado);
    }

    public void setLblLocalidad(String capturado) {
        this.lblLocalidad.setText(capturado);
    }

    public void setLblNombre(String capturado) {
        this.lblNombre.setText(capturado);
    }

    public void setLblNumero(Integer capturado) {
        this.lblNumero.setText(String.valueOf(capturado));
    }

    public void setLblPiso(String capturado) {
        System.out.println(capturado + "esto es el piso q me llega");
        if(capturado.equals("")){
            this.lblPiso.setText("N/A");
         }else
            this.lblPiso.setText(capturado);
    }

    public void setLblPrecio(Float capturado) {
        this.lblPrecio.setText(String.valueOf(capturado));
    }

    public void setLblProvincia(String capturado) {
        this.lblProvincia.setText(capturado);
    }

    public void setLblTipoInmueble(Integer capturado) {
       switch (capturado) {
           case 0:
                this.lblTipoInm.setText("Casa");
                break;
           case 1: 
                this.lblTipoInm.setText("Departamento");
                break;
           case 2:    
                this.lblTipoInm.setText("Galp�n");
                break;
           case 3:     
                this.lblTipoInm.setText("Local-Oficina");
                break;
           case 4:     
                this.lblTipoInm.setText("Quinta");
                break;
           case 5:     
                this.lblTipoInm.setText("Terreno");
                break;
       }
    }

    public void setMontoReserv(JTextField montoReserv) {
        this.montoReserv = montoReserv;
    }

    public void setTiempoValidez(JSpinner tiempoValidez) {
        this.tiempoValidez = tiempoValidez;
    }
    public void setNumDoc(Integer capturado) {
        this.lblNumDoc.setText(String.valueOf(capturado));
    }
   
    private Float getMontoReserva(){
        return Float.parseFloat(this.montoReserv.getText());
    }
    private Date getTiempoValidez(){
        int dias;
        Date fechaHoy = new Date();
        dias=(Integer) tiempoValidez.getValue();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaHoy); // Configuramos la fecha que se recibe
        calendar.add(Calendar.DAY_OF_YEAR, dias);  // numero de d�as a a�adir, o restar en caso de d�as<0	
        return calendar.getTime(); // Devuelve el objeto Date con los nuevos d�as a�adidos
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BSelecProp;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabe28;
    private javax.swing.JLabel jLabe29;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel label33;
    private javax.swing.JLabel label34;
    private javax.swing.JLabel label35;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBarrio;
    private javax.swing.JLabel lblCP;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblDepto;
    private javax.swing.JLabel lblLocalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumDoc;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPiso;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblTipoInm;
    private javax.swing.JTextField montoReserv;
    private javax.swing.JSpinner tiempoValidez;
    // End of variables declaration//GEN-END:variables

    void setCliente(Cliente clienteRecuperado) {
         clienteReserva=clienteRecuperado;
         setLblNombre(clienteRecuperado.getNombre());
         setLblApellido(clienteRecuperado.getApellido());
         setNumDoc(clienteRecuperado.getNumeroDoc());
         
    }

}
