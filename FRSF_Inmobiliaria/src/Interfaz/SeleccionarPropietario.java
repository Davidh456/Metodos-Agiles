/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Cliente;
import Logica.ABMCliente;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gonzo
 */
public class SeleccionarPropietario extends javax.swing.JPanel {

    List<Cliente> listaClientes;
            
    public SeleccionarPropietario() {
        initComponents();
        setSize(350,467);
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbLista = new javax.swing.JTable();
        btnSiguiente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Seleccionar el cliente que quiere hacer propietario"));

        tbLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Documento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbLista);

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/next.png"))); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.setBorder(null);
        btnSiguiente.setBorderPainted(false);
        btnSiguiente.setContentAreaFilled(false);
        btnSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSiguiente.setIconTextGap(0);
        btnSiguiente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/next selected.png"))); // NOI18N
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setIconTextGap(0);
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel selected.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSiguiente)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente)
                    .addComponent(btnCancelar))
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if(tbLista.getSelectedRow()>-1){
            Inmobiliaria.getInstance().AltaPropietario(listaClientes.get(tbLista.getSelectedRow()));
        }
        else{
            JOptionPane.showMessageDialog(null, "Se debe seleccionar un Cliente","¡Error!",JOptionPane.ERROR_MESSAGE);
                    
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Inmobiliaria.getInstance().ListarPropietarios();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLista;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        this.listaClientes = ABMCliente.getInstance().listarNoPropietarios();
        tbLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
                        tipoDoc +" "+c.getNumeroDoc()
                    });
                }
    }
}
