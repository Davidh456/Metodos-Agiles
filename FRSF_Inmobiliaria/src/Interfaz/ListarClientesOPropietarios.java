
package Interfaz;

import Clases.*;
import Logica.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
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
        
        this.tabla = tabla;
        setearTablaPropietarios();
        setearAccionesPropietariosInmueble(aThis);
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
        spLista.setViewportView(tbLista);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spLista, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spLista, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Inmobiliaria.getInstance().MenuPrincipal();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed


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
                if(tbLista.getSelectedRow()>-1){
                    Inmobiliaria.getInstance().BajaCliente(listaClientes.get(tbLista.getSelectedRow()));
                }
                else 
                    JOptionPane.showMessageDialog(null, "Se debe seleccinar un cliente!","¡Cuidado!",JOptionPane.ERROR_MESSAGE);
                    
            }
            
        });
        btnModificar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tbLista.getSelectedRow()>-1){
                    Inmobiliaria.getInstance().ModificacionCliente(listaClientes.get(tbLista.getSelectedRow()));
                }
                else 
                    JOptionPane.showMessageDialog(null, "Se debe seleccinar un cliente!","¡Cuidado!",JOptionPane.ERROR_MESSAGE);
                  
            }
            
        });
        btnAgregar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Inmobiliaria.getInstance().AltaCliente();
            }
            
        });
    }
    private void setearAccionesPropietarios() {
        btnEliminar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tbLista.getSelectedRow()>-1){
                    Inmobiliaria.getInstance().BajaPropietario(listaPropietarios.get(tbLista.getSelectedRow()));
                }
                else 
                    JOptionPane.showMessageDialog(null, "Se debe seleccinar un Propietario!","¡Cuidado!",JOptionPane.ERROR_MESSAGE);     
                }
        });
        btnModificar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tbLista.getSelectedRow()>-1){
                    Inmobiliaria.getInstance().ModificacionPropietario(listaPropietarios.get(tbLista.getSelectedRow()));
                }
                else 
                    JOptionPane.showMessageDialog(null, "Se debe seleccinar un Propietario!","¡Cuidado!",JOptionPane.ERROR_MESSAGE);     
                }
            });
        btnAgregar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Inmobiliaria.getInstance().ListarNoPropietarios();
            }
            
        });
    }

    private void setearAccionesPropietariosInmueble(ABMInmuebleInterfaz aThis) {
         /*
        btnEliminar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tbLista.getSelectedRow()>-1){
                    Inmobiliaria.getInstance().BajaPropietario(listaPropietarios.get(tbLista.getSelectedRow()));
                }
                else 
                    JOptionPane.showMessageDialog(null, "Se debe seleccinar un Propietario!","¡Cuidado!",JOptionPane.ERROR_MESSAGE);     
                }
        });
        */
         btnEliminar.setVisible(false);
        /*
         btnModificar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tbLista.getSelectedRow()>-1){
                    Inmobiliaria.getInstance().ModificacionPropietario(listaPropietarios.get(tbLista.getSelectedRow()));
                }
                else 
                    JOptionPane.showMessageDialog(null, "Se debe seleccinar un Propietario!","¡Cuidado!",JOptionPane.ERROR_MESSAGE);     
                }
            });
            */
        btnModificar.setVisible(false);
        btnAgregar.setText("Seleccionar");
        btnAgregar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Inmobiliaria.getInstance().AltaOModificarInmueble(aThis, listaPropietarios.get(tbLista.getSelectedRow()));
            }
            
        });
        }

  

}
