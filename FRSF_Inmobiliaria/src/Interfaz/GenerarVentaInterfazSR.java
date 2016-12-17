/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import Clases.Cliente;
import Clases.Inmueble;
import Clases.Vendedor;
import Logica.LogicaReserva;
import Logica.LogicaVenta;
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
public class GenerarVentaInterfazSR extends javax.swing.JPanel {

    /** Creates new form GenerarReservaInterfaz */
    Inmueble inmuebleVendido;
    Vendedor vendedorSeleccionado;
    Cliente clienteReserva;
    Validaciones validaciones = new Validaciones();
    JTextField[] camposObligatorios;
    JLabel[] lblCamposObligatorios;
    
    JTextField[] camposFlotantes;
    JLabel[] labelFlotantes;
    public GenerarVentaInterfazSR() {
        initComponents();
        setSize(648, 510);
    }

    
    GenerarVentaInterfazSR(Inmueble inmSeleccionado) {
       inmuebleVendido=inmSeleccionado;
       initComponents(); 
       validarCargaCliente();
       setSize(648, 510);
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
       lblImporte.setText(String.valueOf(inmSeleccionado.getPrecio()));
       vendedorSeleccionado=Inmobiliaria.getInstance().getVendedorLogueado();
       setVendedor();
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
        lblNombreVendedor = new javax.swing.JLabel();
        lblApellidoVendedor = new javax.swing.JLabel();
        lblNumDocVendedor = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblmontoReserva = new javax.swing.JLabel();
        lblImporte = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabe32 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JLabel();
        lblApellidoCliente = new javax.swing.JLabel();
        lblNumDocCliente = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Generar Venta"));

        BSelecCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search small.png"))); // NOI18N
        BSelecCliente.setText("Seleccionar Cliente");
        BSelecCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSelecCliente.setContentAreaFilled(false);
        BSelecCliente.setFocusPainted(false);
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
                                .addComponent(lblTipoInm, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Vendedor"));

        jLabe28.setText("Nombre:");

        jLabel22.setText("Apellido:");

        jLabel27.setText("N� Documento:");

        lblNombreVendedor.setText("Ninguno");
        lblNombreVendedor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblNombreVendedorPropertyChange(evt);
            }
        });

        lblApellidoVendedor.setText("Ninguno");

        lblNumDocVendedor.setText("Ninguno");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabe28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblApellidoVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNumDocVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(lblNombreVendedor)
                    .addComponent(lblApellidoVendedor)
                    .addComponent(lblNumDocVendedor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Datos de la Venta"));

        lblmontoReserva.setText("Importe");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblmontoReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmontoReserva)
                    .addComponent(lblImporte))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept big2.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setFocusPainted(false);
        btnAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptar.setIconTextGap(0);
        btnAceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept big2 selected.png"))); // NOI18N
        btnAceptar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel2 big.png"))); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel2 big selected.png"))); // NOI18N
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Cliente"));

        jLabe32.setText("Nombre:");

        jLabel26.setText("Apellido:");

        jLabel31.setText("N� Documento:");

        lblNombreCliente.setText("Ninguno");
        lblNombreCliente.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblNombreClientePropertyChange(evt);
            }
        });

        lblApellidoCliente.setText("Ninguno");

        lblNumDocCliente.setText("Ninguno");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabe32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblApellidoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNumDocCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabe32)
                    .addComponent(jLabel26)
                    .addComponent(jLabel31)
                    .addComponent(lblNombreCliente)
                    .addComponent(lblApellidoCliente)
                    .addComponent(lblNumDocCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BSelecCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BSelecCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.getAccessibleContext().setAccessibleName("panelInmueble");
    }// </editor-fold>//GEN-END:initComponents

    private void BSelecClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecClienteActionPerformed
        Inmobiliaria.getInstance().ListarClientes(this);
        
    }//GEN-LAST:event_BSelecClienteActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        LogicaVenta operador = new LogicaVenta();
        
        JOptionPane.showMessageDialog(null, "Despu�s de este mensaje espere a "
                + "la confirmaci�n de la venta","Informaci�n",JOptionPane.INFORMATION_MESSAGE);
        try {
            operador.GenerarVenta(inmuebleVendido,clienteReserva,vendedorSeleccionado);
            } catch (IOException ex) {
                Logger.getLogger(GenerarVentaInterfazSR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DocumentException ex) {
                Logger.getLogger(GenerarVentaInterfazSR.class.getName()).log(Level.SEVERE, null, ex);
            }
        operador.cambiarEstadoInmuebleVendido(inmuebleVendido);
                
        JOptionPane.showMessageDialog(null, "El inmueble ha sido correctamente "
                + "vendido","�xito",JOptionPane.INFORMATION_MESSAGE);
        Inmobiliaria.getInstance().ConsultaInmueble();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Inmobiliaria.getInstance().ConsultaInmueble();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void lblNombreVendedorPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblNombreVendedorPropertyChange
        validarCargaCliente();
    }//GEN-LAST:event_lblNombreVendedorPropertyChange

    private void lblNombreClientePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblNombreClientePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNombreClientePropertyChange

    public void setLblApellido(String lblApellido) {
        this.lblApellidoCliente.setText(lblApellido);
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
        this.lblNombreCliente.setText(capturado);
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


    public void setNumDoc(Integer capturado) {
        this.lblNumDocCliente.setText(String.valueOf(capturado));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BSelecCliente;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabe28;
    private javax.swing.JLabel jLabe32;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel label33;
    private javax.swing.JLabel label34;
    private javax.swing.JLabel label35;
    private javax.swing.JLabel lblApellidoCliente;
    private javax.swing.JLabel lblApellidoVendedor;
    private javax.swing.JLabel lblBarrio;
    private javax.swing.JLabel lblCP;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblDepto;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblLocalidad;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblNombreVendedor;
    private javax.swing.JLabel lblNumDocCliente;
    private javax.swing.JLabel lblNumDocVendedor;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPiso;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblTipoInm;
    private javax.swing.JLabel lblmontoReserva;
    // End of variables declaration//GEN-END:variables

    void setCliente(Cliente clienteRecuperado) {
         clienteReserva=clienteRecuperado;
         setLblNombre(clienteRecuperado.getNombre());
         setLblApellido(clienteRecuperado.getApellido());
         setNumDoc(clienteRecuperado.getNumeroDoc());
         
    }

    private void validarCargaCliente() {
     if(lblNombreCliente.getText().equals("Ninguno")){
            btnAceptar.setEnabled(false);
        }else
            btnAceptar.setEnabled(true);
    }

    private void setVendedor() {
        lblNombreVendedor.setText(vendedorSeleccionado.getNombre());
        lblApellidoVendedor.setText(vendedorSeleccionado.getApellido());
        lblNumDocVendedor.setText(String.valueOf(vendedorSeleccionado.getNumDoc()));
    }

}
