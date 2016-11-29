/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import Clases.Cliente;
import Clases.Inmueble;
import Logica.LogicaReserva;
import Logica.Validaciones;
import com.itextpdf.text.DocumentException;
import java.awt.Color;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
    Validaciones validaciones = new Validaciones();
    JTextField[] camposObligatorios;
    JLabel[] lblCamposObligatorios;
    
    JTextField[] camposFlotantes;
    JLabel[] labelFlotantes;
    public GenerarReservaInterfaz() {
        initComponents();
    }

    
    GenerarReservaInterfaz(Inmueble inmSeleccionado) {
       inmuebleReservado=inmSeleccionado;
       initComponents(); 
       sintaxis();
       validarCargaCliente();
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

        BSelecCliente = new javax.swing.JToggleButton();
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
        lblmontoReserva = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        montoReserva = new javax.swing.JTextField();
        tiempoValidez = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Generar Reserva"));

        BSelecCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search small.png"))); // NOI18N
        BSelecCliente.setText("Seleccionar Cliente");
        BSelecCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSelecCliente.setContentAreaFilled(false);
        BSelecCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search small selected.png"))); // NOI18N
        BSelecCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecClienteActionPerformed(evt);
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
                                .addComponent(lblTipoInm, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
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
        lblNombre.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblNombrePropertyChange(evt);
            }
        });

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

        lblmontoReserva.setText("Monto de Reserva");

        jLabel23.setText("Tiempo de Validez (dias)");

        montoReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montoReservaActionPerformed(evt);
            }
        });

        tiempoValidez.setModel(new javax.swing.SpinnerNumberModel(15, 15, 90, 1));

        jLabel4.setText("(El m�nimo aceptado es 15 dias)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblmontoReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(montoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tiempoValidez, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(montoReserva)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(lblmontoReserva)
                        .addComponent(jLabel23)
                        .addComponent(tiempoValidez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept small.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(null);
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept small selected.png"))); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel selected.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BSelecCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BSelecCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("panelInmueble");
    }// </editor-fold>//GEN-END:initComponents

    private void BSelecClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecClienteActionPerformed
        Inmobiliaria.getInstance().ListarClientes(this);
    }//GEN-LAST:event_BSelecClienteActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
       
        if(camposValidos()){
        LogicaReserva operador = new LogicaReserva();
            try {
                JOptionPane.showMessageDialog(null, "Despu�s de este mensaje espere a la confirmaci�n de la reserva","Informaci�n",JOptionPane.INFORMATION_MESSAGE);
                operador.GenerarReserva(inmuebleReservado,clienteReserva, getMontoReserva(),getTiempoValidez());
                JOptionPane.showMessageDialog(null, "El inmueble a sido correctamente reservado","�xito",JOptionPane.INFORMATION_MESSAGE);
                Inmobiliaria.getInstance().ConsultaInmueble();
            } catch (IOException ex) {
                Logger.getLogger(GenerarReservaInterfaz.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DocumentException ex) {
                Logger.getLogger(GenerarReservaInterfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Inmobiliaria.getInstance().ConsultaInmueble();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void montoReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montoReservaActionPerformed

    private void lblNombrePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblNombrePropertyChange
        validarCargaCliente();
    }//GEN-LAST:event_lblNombrePropertyChange

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
        if(capturado.equals("")){
            this.lblPiso.setText("N/A");
         }else
            this.lblPiso.setText(capturado);
    }

    public void setLblPrecio(double capturado) {
        String resultado = String.format("%.2f", capturado);
        if ((capturado - (int)capturado)<0.00)
            this.lblPrecio.setText(String.valueOf((int) capturado).replace(',', '.'));
        else{
            if(capturado<=999999999)
                this.lblPrecio.setText(resultado.replace(',', '.'));
            else{
                resultado = String.format("%.1f", capturado);
                this.lblPrecio.setText(resultado.replace(',', '.'));}}
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
        this.montoReserva = montoReserv;
    }

    public void setTiempoValidez(JSpinner tiempoValidez) {
        this.tiempoValidez = tiempoValidez;
    }
    public void setNumDoc(Integer capturado) {
        this.lblNumDoc.setText(String.valueOf(capturado));
    }
   
    private double getMontoReserva(){
        return Double.parseDouble(this.montoReserva.getText());
    }
    private void sintaxis(){
        validaciones.CaracteresMaximos(montoReserva, 12, "double");
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
    private boolean camposValidos() {
        camposFlotantes = new JTextField[]{montoReserva};
        labelFlotantes = new JLabel[]{lblmontoReserva};
        camposObligatorios = new JTextField[]{montoReserva};
        lblCamposObligatorios = new JLabel[]{lblmontoReserva};
                String mensaje="";
                if(validaciones.CamposVacios(camposObligatorios, null)){
                    mensaje = mensaje + "Hay campos obligatorios que deben ser completados";
                    validaciones.Pintar(camposObligatorios, lblCamposObligatorios);
                }
                if(validaciones.validarPintadorFlotantes(camposFlotantes, labelFlotantes))
                    mensaje = mensaje + "\n" + "Hay campos numericos invalidos";

                if(!mensaje.equals("")){
                    JOptionPane.showMessageDialog(null,mensaje,"�CUIDADO!",JOptionPane.ERROR_MESSAGE);
                    return false;}
    return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BSelecCliente;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabe28;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel lblmontoReserva;
    private javax.swing.JTextField montoReserva;
    private javax.swing.JSpinner tiempoValidez;
    // End of variables declaration//GEN-END:variables

    void setCliente(Cliente clienteRecuperado) {
         clienteReserva=clienteRecuperado;
         setLblNombre(clienteRecuperado.getNombre());
         setLblApellido(clienteRecuperado.getApellido());
         setNumDoc(clienteRecuperado.getNumeroDoc());
         
    }

    private void validarCargaCliente() {
     if(lblNombre.getText().equals("Ninguno")){
            btnAceptar.setEnabled(false);
        }else
            btnAceptar.setEnabled(true);
    }

}
