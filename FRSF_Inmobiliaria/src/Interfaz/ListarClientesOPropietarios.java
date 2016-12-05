
package Interfaz;

import Clases.*;
import Logica.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class ListarClientesOPropietarios extends javax.swing.JPanel {
    
    List<Cliente> listaClientes;
    List<Cliente> listaPropietarios;
    String tabla;
    
    public ListarClientesOPropietarios() {
        initComponents();
        setSize(1000,425);
    }
    
    public ListarClientesOPropietarios(String tabla){
        initComponents();
        setSize(1000,425);
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory
                .createLineBorder(new java.awt.Color(153, 153, 153)), "Buscar "+tabla));
        spLista.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory
                .createLineBorder(new java.awt.Color(153, 153, 153)), tabla+" encontrados"));
        tbLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tbLista.setBackground(new Color(245,245,245));
        this.tabla = tabla;
        switch (tabla){
            case "Clientes":
                setearTablaClientes();
                setearAccionesClientes();
                break;
            case "Propietarios":
                setearTablaPropietarios();
                setearAccionesPropietarios();
                break;
        }
    }

    ListarClientesOPropietarios(String propietario_para_el_Inmueble, ABMInmuebleInterfaz aThis) {
        initComponents();
        setSize(1000,425);
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory
                .createLineBorder(new java.awt.Color(153, 153, 153)), "Buscar "+propietario_para_el_Inmueble));
        spLista.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory
                .createLineBorder(new java.awt.Color(153, 153, 153)), tabla+" encontrados"));
        tbLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tbLista.setBackground(new Color(245,245,245));
        this.tabla = tabla;
        setearTablaPropietarios();
        setearAccionesPropietariosInmueble(aThis);
    }

    ListarClientesOPropietarios(GenerarReservaInterfaz aThis) {
        initComponents();
        setSize(1000,425);
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory
                .createLineBorder(new java.awt.Color(153, 153, 153)), "Buscar "));
        spLista.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory
                .createLineBorder(new java.awt.Color(153, 153, 153)), tabla+" encontrados"));
        tbLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tbLista.setBackground(new Color(245,245,245));
        this.tabla = "Clientes";
        setearTablaClientes();
        setearAccionesClientesReserva(aThis);
    }
    
    ListarClientesOPropietarios(GenerarVentaInterfazSR aThis) {
        initComponents();
        setSize(1000,425);
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory
                .createLineBorder(new java.awt.Color(153, 153, 153)), "Buscar "));
        spLista.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory
                .createLineBorder(new java.awt.Color(153, 153, 153)), tabla+" encontrados"));
        tbLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tbLista.setBackground(new Color(245,245,245));
        this.tabla = "Clientes";
        setearTablaClientes();
        setearAccionesClientesVentaSR(aThis);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spLista = new javax.swing.JScrollPane();
        tbLista = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Buscar clientes"));

        spLista.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Clientes encontrados"));

        tbLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Documento", "Provincia", "Localidad", "Domicilio", "Telefono", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbLista.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tbListaFocusGained(evt);
            }
        });
        spLista.setViewportView(tbLista);

        btnVolver.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back big.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(null);
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setFocusPainted(false);
        btnVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVolver.setIconTextGap(0);
        btnVolver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back big selected.png"))); // NOI18N
        btnVolver.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setEnabled(false);
        btnEliminar.setFocusPainted(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setIconTextGap(0);
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete selected.png"))); // NOI18N
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setFocusPainted(false);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setIconTextGap(0);
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add selected.png"))); // NOI18N
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modify.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(null);
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setEnabled(false);
        btnModificar.setFocusPainted(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setIconTextGap(0);
        btnModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modify selected.png"))); // NOI18N
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spLista, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 292, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spLista, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAgregar)
                        .addComponent(btnModificar)
                        .addComponent(btnEliminar))
                    .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(7, 7, 7))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbListaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbListaFocusGained
        tbLista.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(tbLista.getSelectedRow()>-1){
                    btnEliminar.setEnabled(true);
                    btnModificar.setEnabled(true);
                }
            }
        });
    }//GEN-LAST:event_tbListaFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane spLista;
    private javax.swing.JTable tbLista;
    // End of variables declaration//GEN-END:variables

    private void setearTablaClientes() {
        
        listaClientes = new ABMCliente().listarClientes();
         for(Cliente c: listaClientes){
             DefaultTableModel model = (DefaultTableModel) tbLista.getModel();
             String tipoDoc = "";
             switch (c.getTipoDoc()){
                 case 0:
                     tipoDoc = "DNI";
                     break;
                 case 1:
                     tipoDoc = "PS";
                     break;
                 case 2:
                     tipoDoc = "LC";
                     break;
                 case 3:
                     tipoDoc = "LE";
                     break;
             }
             model.addRow(new Object[]{
                 c.getNombre(), 
                 c.getApellido(), 
                 tipoDoc +" "+c.getNumeroDoc(), 
                 c.getProvincia().getProvincia(), 
                 c.getLocalidad().getLocalidad(), 
                 c.getDomicilio()+" "+c.getAlturaDomicilio(), 
                 c.getTelefono(), 
                 c.getCorreo()});
         }
    }
    private void setearTablaPropietarios(){
        
        listaPropietarios = new ABMCliente().listarPropietarios();
        for(Cliente p: listaPropietarios){
            DefaultTableModel model = (DefaultTableModel) tbLista.getModel();
            String tipoDoc = "";
            switch (p.getTipoDoc()){
                case 0:
                    tipoDoc = "DNI";
                    break;
                case 1:
                    tipoDoc = "PS";
                    break;
                case 2:
                    tipoDoc = "LC";
                    break;
                case 3:
                    tipoDoc = "LE";
                    break;
            }
            model.addRow(new Object[]{
                p.getNombre(), 
                p.getApellido(), 
                tipoDoc +" "+p.getNumeroDoc(), 
                p.getProvincia().getProvincia(), 
                p.getLocalidad().getLocalidad(), 
                p.getDomicilio()+" "+p.getAlturaDomicilio(), 
                p.getTelefono(), 
                p.getCorreo()});
        }
    }

    private void setearAccionesClientes() {
        btnEliminar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ABMCliente operador = new ABMCliente();
                if(!operador.TieneTransacciones(listaClientes.get(tbLista.getSelectedRow()),null ,1))
                   Inmobiliaria.getInstance().BajaCliente(listaClientes.get(tbLista.getSelectedRow()));
                else{
                    JOptionPane.showMessageDialog(null, "No se puede eliminar un cliente que haya realizado una compra, reserva o que sea propietario de un inmueble.","¡Cuidado!",JOptionPane.ERROR_MESSAGE);
                }
                   
            }
            
        });
        btnModificar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Inmobiliaria.getInstance().ModificacionCliente(listaClientes.get(tbLista.getSelectedRow()));
            }
            
        });
        btnAgregar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Inmobiliaria.getInstance().AltaCliente();
            }
            
        });
        btnVolver.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Inmobiliaria.getInstance().MenuPrincipal();
            }
            
        });
    }
    private void setearAccionesPropietarios() {
        btnEliminar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                    ABMCliente operador = new ABMCliente();
                    if(!operador.TieneTransacciones(listaPropietarios.get(tbLista.getSelectedRow()), null,2))
                       Inmobiliaria.getInstance().BajaPropietario(listaPropietarios.get(tbLista.getSelectedRow()));
                    else
                        JOptionPane.showMessageDialog(null, "No se puede eliminar un propietario al cual le pertenezca un inmueble.","¡Cuidado!",JOptionPane.ERROR_MESSAGE);
                }
        });
        btnModificar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                   Inmobiliaria.getInstance().ModificacionPropietario(listaPropietarios.get(tbLista.getSelectedRow()));
                }
            });
        btnAgregar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Inmobiliaria.getInstance().ListarNoPropietarios();
            }
            
        });
        btnVolver.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Inmobiliaria.getInstance().MenuPrincipal();
            }
            
        });
    }

    private void setearAccionesPropietariosInmueble(ABMInmuebleInterfaz aThis) {
        btnEliminar.setVisible(false);
        btnModificar.setVisible(false);
        btnAgregar.setText("Seleccionar");
        btnAgregar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Inmobiliaria.getInstance().AltaOModificarInmueble(aThis, listaPropietarios.get(tbLista.getSelectedRow()));
            } 
        });
         btnVolver.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Inmobiliaria.getInstance().AltaOModificarInmueble(aThis);
            } 
        });
        }
    private void setearAccionesClientesReserva(GenerarReservaInterfaz aThis) {
        btnEliminar.setVisible(false);
        btnModificar.setVisible(false);
        btnAgregar.setText("Seleccionar");
        btnAgregar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Inmobiliaria.getInstance().GenerarReserva(aThis, listaClientes.get(tbLista.getSelectedRow()));
            } 
        });
        btnVolver.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Inmobiliaria.getInstance().GenerarReserva(aThis);
            } 
        });
    }
        private void setearAccionesClientesVentaSR(GenerarVentaInterfazSR aThis) {
        btnEliminar.setVisible(false);
        btnModificar.setVisible(false);
        btnAgregar.setText("Seleccionar");
        btnAgregar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Inmobiliaria.getInstance().GenerarVentaSRes(aThis, listaClientes.get(tbLista.getSelectedRow()));
            } 
        });
        btnVolver.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Inmobiliaria.getInstance().GenerarVentaSRes(aThis);
            } 
        });
    }
  

}
