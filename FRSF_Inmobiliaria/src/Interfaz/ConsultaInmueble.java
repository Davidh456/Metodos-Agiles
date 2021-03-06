/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Cliente;
import Clases.Inmueble;
import Clases.Localidad;
import Clases.Provincia;
import Logica.ABMInmueble;
import Logica.ActualizarPagina;
import Logica.Catalogo;
import Logica.LogicaCargaInterfaz;
import Logica.LogicaReserva;
import Logica.Validaciones;
import com.itextpdf.text.DocumentException;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author maria
 */
public class ConsultaInmueble extends javax.swing.JPanel {
    
    List<Provincia> provincias;
    Set<Localidad> localidades;
    Validaciones validaciones = new Validaciones();
    List<Inmueble> resultado;
    DefaultTableModel tabla;
    
    private String getApellido() {
        return Apellido.getText();
    }
    private String getBarrioNombre() {
        return BarrioText.getText();
    }
    private int getCantDormitorios() {
        return ((Integer) CantDormitorios.getValue());
    }
    private String getCorreo() {
        return Correo.getText();
    }
    private String getLocalidadNombre() {
        return ((String) cbLocalidad.getSelectedItem());
    }
    private String getNombre() {
        return Nombre.getText();
    }
    private int getNroDoc() {
        if(NroDoc.getText().equals("")){
            return -1;
        }
        return Integer.parseInt(NroDoc.getText());
    }
    private double getPrecioDesde() {
        if(PrecioDesde.getText().equals("")){
            return 0;
        }
        return Double.parseDouble(PrecioDesde.getText());
    }
    private double getPrecioHasta() {
        double a=999999999999d;
        if(PrecioHasta.getText().equals("")){
            return (a);
        }
        return Double.parseDouble(PrecioHasta.getText());
    }
    private int getTipoDoc() {
        return TipoDoc.getSelectedIndex();
    }
    private int getTipoInmueble() {
        return TipoInmueble.getSelectedIndex();
    }
    private int getProvinciaIndice() {
        return cbProvincia.getSelectedIndex();
    }

    private void setScrollResultados(JScrollPane ScrollResultados) {
        this.ScrollResultados = ScrollResultados;
    }
    private void setTablaResultados(JTable TablaResultados) {
        this.TablaResultados = TablaResultados;
    }
    
    private void cargarCB() {
       LogicaCargaInterfaz carga = new LogicaCargaInterfaz();
       provincias = carga.buscarProvincias();
       for(Provincia p: provincias){
           cbProvincia.addItem(p.getProvincia());
       }
       localidades = provincias.get(0).getLocalidads();
       for(Localidad l: localidades){
            cbLocalidad.addItem(l.getLocalidad());
       }
       cbProvincia.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               cbLocalidad.removeAllItems();
               Provincia provincia = provincias.get(cbProvincia.getSelectedIndex());
               localidades = provincia.getLocalidads();
               for(Localidad l: localidades ){
                   cbLocalidad.addItem(l.getLocalidad());
               }
           }
       });
    }
    
    private void sintaxis(){
        validaciones.CaracteresMaximos(PrecioDesde, 12, "double");
        validaciones.CaracteresMaximos(PrecioHasta,12,"double");
        validaciones.CaracteresMaximos(Apellido, 100, "alfabetico");
        validaciones.CaracteresMaximos(Nombre, 100, "alfabetico");
        validaciones.CaracteresMaximos(NroDoc, 8, "numerico");
        validaciones.CaracteresMaximos(Correo, 50, "alfaNumerico");
    }

    public ConsultaInmueble() {
        initComponents();
        DeshabilitarBotonesInicio();
        setSize(getPreferredSize());
        cargarCB();
        sintaxis();
        setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta Inmueble")); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbLocalidad = new javax.swing.JComboBox<>();
        cbProvincia = new javax.swing.JComboBox<>();
        TipoInmueble = new javax.swing.JComboBox<>();
        CantDormitorios = new javax.swing.JSpinner();
        PrecioDesde = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PrecioHasta = new javax.swing.JTextField();
        BarrioText = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        TipoDoc = new javax.swing.JComboBox<>();
        NroDoc = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        BotonEliminar = new javax.swing.JButton();
        BotonVender = new javax.swing.JButton();
        BotonDetalles = new javax.swing.JButton();
        BotonReserva = new javax.swing.JButton();
        BotonPublicar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        BotonCatalogo = new javax.swing.JButton();
        ScrollResultados = new javax.swing.JScrollPane();
        TablaResultados = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Consulta Inmueble"));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Inmueble"));

        jLabel1.setText("Cantidad de Dormitorios");

        jLabel2.setText("Precio:   Desde");

        jLabel3.setText("Tipo Inmueble");

        jLabel4.setText("Barrio");

        jLabel5.setText("Localidad");

        jLabel6.setText("Provincia");

        cbLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLocalidadActionPerformed(evt);
            }
        });

        TipoInmueble.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Casa", "Departamento", "Galp�n", "Local-Oficina", "Quinta", "Terreno" }));

        CantDormitorios.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        PrecioDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioDesdeActionPerformed(evt);
            }
        });

        jLabel7.setText("Hasta");

        PrecioHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioHastaActionPerformed(evt);
            }
        });

        jLabel13.setText("(0 para cualquier cantidad)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PrecioDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TipoInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbProvincia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BarrioText))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CantDormitorios, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PrecioHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cbLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BarrioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(TipoInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantDormitorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PrecioDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        PrecioDesde.getAccessibleContext().setAccessibleName("");
        PrecioDesde.getAccessibleContext().setAccessibleDescription("sda");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Propietario"));

        jLabel8.setText("Tipo Documento");

        jLabel9.setText("Correo");

        jLabel10.setText("Nro. Documento");

        jLabel11.setText("Apellido");

        jLabel12.setText("Nombre");

        Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoActionPerformed(evt);
            }
        });

        TipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "DNI", "Pasaporte", "LC", "LE" }));

        NroDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NroDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TipoDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NroDoc)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel9)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(TipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Acciones"));

        BotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete2.png"))); // NOI18N
        BotonEliminar.setText("Eliminar");
        BotonEliminar.setBorderPainted(false);
        BotonEliminar.setContentAreaFilled(false);
        BotonEliminar.setFocusPainted(false);
        BotonEliminar.setIconTextGap(18);
        BotonEliminar.setMargin(new java.awt.Insets(2, 5, 2, 5));
        BotonEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete2 selected.png"))); // NOI18N
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sell.png"))); // NOI18N
        BotonVender.setText("Vender");
        BotonVender.setBorderPainted(false);
        BotonVender.setContentAreaFilled(false);
        BotonVender.setFocusPainted(false);
        BotonVender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonVender.setIconTextGap(9);
        BotonVender.setMargin(new java.awt.Insets(2, 5, 2, 5));
        BotonVender.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sell selected.png"))); // NOI18N
        BotonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVenderActionPerformed(evt);
            }
        });

        BotonDetalles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/details.png"))); // NOI18N
        BotonDetalles.setText("Detalles");
        BotonDetalles.setBorderPainted(false);
        BotonDetalles.setContentAreaFilled(false);
        BotonDetalles.setFocusPainted(false);
        BotonDetalles.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonDetalles.setIconTextGap(5);
        BotonDetalles.setMargin(new java.awt.Insets(2, 5, 2, 5));
        BotonDetalles.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/details selected.png"))); // NOI18N
        BotonDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetallesActionPerformed(evt);
            }
        });

        BotonReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book.png"))); // NOI18N
        BotonReserva.setText("Reservar");
        BotonReserva.setBorderPainted(false);
        BotonReserva.setContentAreaFilled(false);
        BotonReserva.setFocusPainted(false);
        BotonReserva.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonReserva.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BotonReserva.setIconTextGap(6);
        BotonReserva.setMargin(new java.awt.Insets(2, 5, 2, 5));
        BotonReserva.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book selected.png"))); // NOI18N
        BotonReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReservaActionPerformed(evt);
            }
        });

        BotonPublicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/upload3.png"))); // NOI18N
        BotonPublicar.setText("Publicar");
        BotonPublicar.setBorderPainted(false);
        BotonPublicar.setContentAreaFilled(false);
        BotonPublicar.setFocusPainted(false);
        BotonPublicar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonPublicar.setIconTextGap(10);
        BotonPublicar.setMargin(new java.awt.Insets(2, 5, 2, 5));
        BotonPublicar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/upload2.png"))); // NOI18N
        BotonPublicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPublicarActionPerformed(evt);
            }
        });

        BotonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modify2.png"))); // NOI18N
        BotonModificar.setText("Modificar");
        BotonModificar.setBorderPainted(false);
        BotonModificar.setContentAreaFilled(false);
        BotonModificar.setFocusPainted(false);
        BotonModificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonModificar.setIconTextGap(7);
        BotonModificar.setMargin(new java.awt.Insets(2, 5, 2, 5));
        BotonModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modify2 selected.png"))); // NOI18N
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        BotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.setBorderPainted(false);
        BotonSalir.setContentAreaFilled(false);
        BotonSalir.setFocusPainted(false);
        BotonSalir.setIconTextGap(20);
        BotonSalir.setMargin(new java.awt.Insets(2, 5, 2, 19));
        BotonSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit selected.png"))); // NOI18N
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        BotonCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/catalogue.png"))); // NOI18N
        BotonCatalogo.setText("<html>Generar<br>Cat�logo</html>");
        BotonCatalogo.setBorderPainted(false);
        BotonCatalogo.setContentAreaFilled(false);
        BotonCatalogo.setFocusPainted(false);
        BotonCatalogo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BotonCatalogo.setIconTextGap(15);
        BotonCatalogo.setMargin(new java.awt.Insets(2, 5, 2, 5));
        BotonCatalogo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/catalogue selected.png"))); // NOI18N
        BotonCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCatalogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonPublicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonCatalogo))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(BotonDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonPublicar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        ScrollResultados.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        ScrollResultados.setMinimumSize(new java.awt.Dimension(230, 50));

        TablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "C�digo", "Estado", "Tipo", "Provincia", "Localidad", "Direcci�n", "Cant Dorm.", "Garaje", "Patio", "Sup. Edificada", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Short.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaResultados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TablaResultados.setSurrendersFocusOnKeystroke(true);
        TablaResultados.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TablaResultadosPropertyChange(evt);
            }
        });
        ScrollResultados.setViewportView(TablaResultados);
        if (TablaResultados.getColumnModel().getColumnCount() > 0) {
            TablaResultados.getColumnModel().getColumn(0).setPreferredWidth(10);
            TablaResultados.getColumnModel().getColumn(1).setPreferredWidth(85);
            TablaResultados.getColumnModel().getColumn(2).setPreferredWidth(60);
            TablaResultados.getColumnModel().getColumn(3).setPreferredWidth(30);
            TablaResultados.getColumnModel().getColumn(4).setPreferredWidth(75);
            TablaResultados.getColumnModel().getColumn(5).setPreferredWidth(75);
            TablaResultados.getColumnModel().getColumn(6).setPreferredWidth(85);
            TablaResultados.getColumnModel().getColumn(7).setPreferredWidth(65);
            TablaResultados.getColumnModel().getColumn(8).setPreferredWidth(45);
            TablaResultados.getColumnModel().getColumn(9).setPreferredWidth(37);
            TablaResultados.getColumnModel().getColumn(10).setPreferredWidth(80);
            TablaResultados.getColumnModel().getColumn(11).setPreferredWidth(85);
        }

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search small.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setFocusPainted(false);
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search small selected.png"))); // NOI18N
        btnBuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search small selected.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ScrollResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ScrollResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
       Inmobiliaria.getInstance().MenuPrincipal();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void PrecioDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioDesdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioDesdeActionPerformed

    private void ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoActionPerformed

    private void NroDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NroDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NroDocActionPerformed

    private void PrecioHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioHastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioHastaActionPerformed
    int entro=0;    
    private void TablaResultadosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TablaResultadosPropertyChange
        int seleccionados=0;
        for (int i = 0; i < TablaResultados.getRowCount(); i++) {
					if((boolean)TablaResultados.getValueAt(i, 0)){
                                            seleccionados++;
                                        }
				}
        if(seleccionados==1) {
            HabilitarBotones();	}
        if(seleccionados==0)
                {  DeshabilitarBotonesInicio();}
        if (seleccionados>1){
            DeshabilitarBotones();}
    }//GEN-LAST:event_TablaResultadosPropertyChange

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String Garage, Patio;
        String resultadoPrecio;
        DefaultTableModel model = (DefaultTableModel) TablaResultados.getModel();
        model.setRowCount(0);
        resultado=null;
        ABMInmueble operador = Inmobiliaria.getinstanciaOperadorInmueble(); // definir donde y cuando se creara el operador
        LogicaReserva operador2 = new LogicaReserva();
        operador2.DescartarReservasViejas();
        resultado = operador.BuscarInmuebles(getApellido(), getBarrioNombre(), getCantDormitorios(), getCorreo(), getLocalidadNombre(), getNombre(), getNroDoc(), getPrecioDesde(), getPrecioHasta(), getTipoDoc(), getTipoInmueble(), getProvinciaIndice());
                    
        for (Iterator<Inmueble> iter = resultado.listIterator(); iter.hasNext(); ) 
            if (iter.next().getEstado().equals("Vendido"))
                iter.remove();
        
        if(!resultado.isEmpty()){
        for(Inmueble c: resultado){   
            if(c.getGarage())
                Garage ="Si";
            else
                Garage="No";
            if(c.getPatio())
                Patio ="Si";
            else
                Patio="No";
            
            if ((c.getPrecio() - (int)c.getPrecio())<0.00)
                resultadoPrecio=String.valueOf((int) c.getPrecio()).replace(',', '.');
            else{
                if(c.getPrecio()<=999999999){
                    resultadoPrecio = String.format("%.2f", c.getPrecio());
                    resultadoPrecio = resultadoPrecio.replace(',', '.');}
                else{
                    resultadoPrecio = String.format("%.1f", c.getPrecio());
                    resultadoPrecio = resultadoPrecio.replace(',', '.');}}
                             
                    model.addRow(new Object[]{
                        false, 
                        c.getIdDescritivo(), 
                        c.getEstado(),
                        c.getTipoInmueble(),
                        c.getProvinciaNombre(),
                        c.getLocalidadNombre(), 
                        String.valueOf(c.getCalle()) + " " + String.valueOf(c.getNumero()), 
                        c.getDormitorio(), Garage, 
                        Patio,
                        c.getSupInmueble(),
                        resultadoPrecio});
        }
        tabla=model;
        }
        else
            JOptionPane.showMessageDialog(null,"No se han encontrado inmuebles con las caracter�sticas deseadas","Atenci�n",JOptionPane.INFORMATION_MESSAGE);       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLocalidadActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        boolean tieneReserva;
        Inmueble inmSeleccionado=null;
        for(int i=0; i<TablaResultados.getRowCount(); i++)
            if ((boolean)tabla.getValueAt(i,0))
                inmSeleccionado = resultado.get(i);
        LogicaReserva operador = new LogicaReserva();
        tieneReserva=operador.ExisteReserva(inmSeleccionado);
        if(!tieneReserva)
            Inmobiliaria.getInstance().EliminarInmueble(inmSeleccionado);
        else
            JOptionPane.showMessageDialog(null, "El Inmueble se encuentra reservado por lo que no se puede eliminar.","Error",JOptionPane.ERROR_MESSAGE);     
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        Inmueble inmSeleccionado=null;
        for(int i=0; i<TablaResultados.getRowCount(); i++)
            if ((boolean)tabla.getValueAt(i,0))
                inmSeleccionado = resultado.get(i);
        Inmobiliaria.getInstance().ModificarInmueble(inmSeleccionado);
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReservaActionPerformed
        Inmueble inmSeleccionado=null;
        boolean tieneReserva;
        for(int i=0; i<TablaResultados.getRowCount(); i++)
            if ((boolean)tabla.getValueAt(i,0))
                inmSeleccionado = resultado.get(i);
        LogicaReserva operador = new LogicaReserva();
        tieneReserva=operador.ExisteReserva(inmSeleccionado);
        if(!tieneReserva){
            Inmobiliaria.getInstance().GenerarReserva(inmSeleccionado);
        }
        else{
            JOptionPane.showMessageDialog(null, "El Inmueble ya se encuentra reservado","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonReservaActionPerformed

    private void BotonDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetallesActionPerformed

        Inmueble inmSeleccionado=null;
        for(int i=0; i<TablaResultados.getRowCount(); i++)
            if ((boolean)tabla.getValueAt(i,0))
                inmSeleccionado = resultado.get(i);
        Inmobiliaria.getInstance().DetallesInmueble(inmSeleccionado);
    }//GEN-LAST:event_BotonDetallesActionPerformed

    private void BotonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVenderActionPerformed
        boolean tieneReserva;
        Inmueble inmSeleccionado=null;
        for(int i=0; i<TablaResultados.getRowCount(); i++)
            if ((boolean)tabla.getValueAt(i,0))
                inmSeleccionado = resultado.get(i);
        LogicaReserva operador = new LogicaReserva();
        tieneReserva=operador.ExisteReserva(inmSeleccionado);
        if(!tieneReserva){
            Inmobiliaria.getInstance().GenerarVentaSRes(inmSeleccionado);
            //venta sin reserva
        }
        else{
            Inmobiliaria.getInstance().GenerarVentaCRes(inmSeleccionado);
            //venta con reserva
        }
    }//GEN-LAST:event_BotonVenderActionPerformed

    private void BotonCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCatalogoActionPerformed
        List<Inmueble> inmueblesSeleccionados = new ArrayList<Inmueble>();
        JOptionPane.showMessageDialog(null, "Despu�s de este mensaje espere que se confirme la correcta "
                + "elaboraci�n del cat�logo","Informaci�n",JOptionPane.INFORMATION_MESSAGE);
        for(int i=0; i<TablaResultados.getRowCount(); i++)
            if ((boolean)tabla.getValueAt(i,0))
                inmueblesSeleccionados.add(resultado.get(i));
        try {
            (new Catalogo()).armarCatalogo(inmueblesSeleccionados);
        } catch (IOException ex) {
            Logger.getLogger(ConsultaInmueble.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(ConsultaInmueble.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonCatalogoActionPerformed

    private void BotonPublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPublicarActionPerformed
        ArrayList<Inmueble> listaInmuebles = new ArrayList<Inmueble>();
        for(int i=0; i<TablaResultados.getRowCount(); i++)
            if ((boolean)tabla.getValueAt(i,0))
                listaInmuebles.add(resultado.get(i));
        ActualizarPagina.actializarPaginas(listaInmuebles);
    }//GEN-LAST:event_BotonPublicarActionPerformed

    private void HabilitarBotones(){
        BotonDetalles.setEnabled(true);
        BotonEliminar.setEnabled(true);
        BotonModificar.setEnabled(true);
        BotonReserva.setEnabled(true);
        BotonVender.setEnabled(true);
        BotonPublicar.setEnabled(true);
        BotonCatalogo.setEnabled(true);
    }
    private void DeshabilitarBotones(){
        BotonDetalles.setEnabled(false);
        BotonEliminar.setEnabled(false);
        BotonModificar.setEnabled(false);
        BotonReserva.setEnabled(false);
        BotonVender.setEnabled(false);
        BotonCatalogo.setEnabled(true);
    }
    private void DeshabilitarBotonesInicio(){
        BotonDetalles.setEnabled(false);
        BotonEliminar.setEnabled(false);
        BotonModificar.setEnabled(false);
        BotonReserva.setEnabled(false);
        BotonVender.setEnabled(false);
        BotonPublicar.setEnabled(false);
        BotonCatalogo.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField BarrioText;
    private javax.swing.JButton BotonCatalogo;
    private javax.swing.JButton BotonDetalles;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonPublicar;
    private javax.swing.JButton BotonReserva;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonVender;
    private javax.swing.JSpinner CantDormitorios;
    private javax.swing.JTextField Correo;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NroDoc;
    private javax.swing.JTextField PrecioDesde;
    private javax.swing.JTextField PrecioHasta;
    private javax.swing.JScrollPane ScrollResultados;
    private javax.swing.JTable TablaResultados;
    private javax.swing.JComboBox<String> TipoDoc;
    private javax.swing.JComboBox<String> TipoInmueble;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cbLocalidad;
    private javax.swing.JComboBox<String> cbProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
