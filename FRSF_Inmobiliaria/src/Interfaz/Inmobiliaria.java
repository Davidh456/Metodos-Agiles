package Interfaz;

/*Clase principal*/


import Clases.Cliente;
import Clases.Inmueble;
import Clases.Vendedor;
import Conexion.Conexion;
import Interfaz.*;
import Logica.ABMInmueble;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;

public class Inmobiliaria extends JFrame{
    //Aquï¿½ vamos a declarar todas las sub-pantallas que vamos a usar
    private JPanel contentPane;
    private JLabel fondo;
    //Esta parte de instancia es para hacer la clase Singleton
    
    private static Inmobiliaria instancia = null;
    private static ABMInmueble instanciaOperadorInmueble = null;
    private Vendedor vendedorLogeado;
    JPanel AltaClienteOPropietario;
    public static void main(String[] args) {
        
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    try {
                        javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Inmobiliaria.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        Logger.getLogger(Inmobiliaria.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(Inmobiliaria.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(Inmobiliaria.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
            }
        
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					instancia = new Inmobiliaria();
                                        Conexion.getInstance();
                                        Inmobiliaria.getInstance().inicializarInmobiliaria();
                                        Inmobiliaria.getInstance().IniciarSesion();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
    Inmobiliaria(){
        super();
        instancia = this;
    }
    public static Inmobiliaria getInstance(){
        if (instancia == null){
                instancia = new Inmobiliaria();
        }
        return instancia;
    }
    public static ABMInmueble getinstanciaOperadorInmueble(){
        if (instanciaOperadorInmueble == null){
                instanciaOperadorInmueble = new ABMInmueble();
        }
        return instanciaOperadorInmueble;
    }
    
    public void inicializarInmobiliaria(){
        setVisible(true);
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(Inmobiliaria.class.getResource("/javax/swing/plaf/metal/icons/ocean/menu.gif")));
        //Estas lineas son para crear el Frame Principal donde va a llamar a cada pantalla

        //Aquï¿½ que dan las dimensiones segun la resoluciï¿½n de pantalla
        Toolkit t = Toolkit.getDefaultToolkit();
        java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width/2)-550, ((screenSize.height-48)/2)-364, 1100,728);
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        cerrar();

        //Este contentPane es el JPanel que va a contener a toda la interfaz grï¿½fica
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        contentPane.setBounds(0, 0, 1100, 728);
        contentPane.setBackground(new Color(240,240,240));
        fondo = new JLabel();
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo 33.png"))); // NOI18N
        fondo.setBounds(0,0,1100,700);
        contentPane.add(fondo);
        
    }
    public void cerrar(){
        this.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                        int opcion = JOptionPane.showOptionDialog(null, 
                                        "¿Seguro que quiere salir?", "Cerrar", JOptionPane.YES_NO_OPTION, 2, null, new String[]{"Si","No"}, null);
                        if (opcion == 0){
					System.exit(0);
				}
				
			}
        });
    }
     public void IniciarSesionAdministrador(){
        contentPane.removeAll();
        contentPane.add(fondo);
        AdminLogin login = new AdminLogin();
        login.setBounds((contentPane.getWidth()/2)-(login.getWidth()/2), 
							(contentPane.getHeight()/2)-(login.getHeight()/2), 
							login.getWidth(), 
							login.getHeight());
        contentPane.add(login);
        login.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }
    public void IniciarSesion(){
        contentPane.removeAll();
        contentPane.add(fondo);
        Login login = new Login();
        login.setBounds((contentPane.getWidth()/2)-(login.getWidth()/2), 
							(contentPane.getHeight()/2)-(login.getHeight()/2), 
							login.getWidth(), 
							login.getHeight());
        contentPane.add(login);
        login.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }
    public void AltaPropietario(Cliente nuevoPropietario) {
        contentPane.removeAll();
        contentPane.add(fondo);
        ABMClienteOPropietario pantallaABM = new ABMClienteOPropietario("propietario", "alta", nuevoPropietario);
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }
    public void ModificacionPropietario(Cliente propietario) {
        contentPane.removeAll();
        contentPane.add(fondo);
        ABMClienteOPropietario pantallaABM = new ABMClienteOPropietario("propietario", "modificacion", propietario);
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }
    public void BajaPropietario(Cliente propietario) {
        contentPane.removeAll();
        contentPane.add(fondo);
        ABMClienteOPropietario pantallaABM = new ABMClienteOPropietario("propietario", "baja", propietario);
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }
    public void AltaCliente() {
        contentPane.removeAll();
        contentPane.add(fondo);
        ABMClienteOPropietario pantallaABM = new ABMClienteOPropietario("cliente", "alta", null);
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }
    public void ModificacionCliente(Cliente cliente) {
        contentPane.removeAll();
        contentPane.add(fondo);
        ABMClienteOPropietario pantallaABM = new ABMClienteOPropietario("cliente", "modificacion", cliente);
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
                                                        (contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
                                                        pantallaABM.getWidth(), 
                                                        pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }
    public void BajaCliente(Cliente cliente) {
        contentPane.removeAll();
        contentPane.add(fondo);
        ABMClienteOPropietario pantallaABM = new ABMClienteOPropietario("cliente", "baja", cliente);
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }
    public void AltaInmueble() {
        contentPane.removeAll();
        contentPane.add(fondo);
        ABMInmuebleInterfaz pantallaABM = new ABMInmuebleInterfaz();
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
       
    } 
    public void ListarClientes(){
        contentPane.removeAll();
        contentPane.add(fondo);
        ListarClientesOPropietarios pantallaListar = new ListarClientesOPropietarios("Clientes");
        pantallaListar.setBounds((contentPane.getWidth()/2)-(pantallaListar.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaListar.getHeight()/2), 
							pantallaListar.getWidth(), 
							pantallaListar.getHeight());
        contentPane.add(pantallaListar);
        pantallaListar.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
        
    }
    public void ListarPropietarios(){
        contentPane.removeAll();
        contentPane.add(fondo);
        ListarClientesOPropietarios pantallaListar = new ListarClientesOPropietarios("Propietarios");
        pantallaListar.setBounds((contentPane.getWidth()/2)-(pantallaListar.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaListar.getHeight()/2), 
							pantallaListar.getWidth(), 
							pantallaListar.getHeight());
        contentPane.add(pantallaListar);
        pantallaListar.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
        
    }
    
    public void MenuPrincipal(){
        contentPane.removeAll();
        contentPane.add(fondo);
        MenuPrincipal menu = new MenuPrincipal();
        menu.setBounds( (contentPane.getWidth()/2)-(menu.getWidth()/2), 
                        (contentPane.getHeight()/2)-(menu.getHeight()/2), 
                        menu.getWidth(), 
                        menu.getHeight());
        contentPane.add(menu);
        menu.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();

    }
    
        public void ConsultaInmueble() {
        contentPane.removeAll();
        contentPane.add(fondo);
        ConsultaInmueble pantallaABM = new ConsultaInmueble();
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
        
    } 

    void ModificarInmueble(Inmueble inmSeleccionado) {
         contentPane.removeAll();
         contentPane.add(fondo);
        ABMInmuebleInterfaz pantallaABM = new ABMInmuebleInterfaz(inmSeleccionado);
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }

    void EliminarInmueble(Inmueble inmSeleccionado) {
        contentPane.removeAll();
        contentPane.add(fondo);
        ABMInmuebleInterfaz pantallaABM = new ABMInmuebleInterfaz(inmSeleccionado,"BAJA");
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();}



    void ListarPropietarios(ABMInmuebleInterfaz aThis) {
        contentPane.removeAll();
        contentPane.add(fondo);
        ListarClientesOPropietarios pantallaListar = new ListarClientesOPropietarios("Propietario para el Inmueble", aThis);
        pantallaListar.setBounds((contentPane.getWidth()/2)-(pantallaListar.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaListar.getHeight()/2), 
							pantallaListar.getWidth(), 
							pantallaListar.getHeight());
        contentPane.add(pantallaListar);
        pantallaListar.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }

    void AltaOModificarInmueble(ABMInmuebleInterfaz pantallaABM, Cliente propietarioSelec) { 
        contentPane.removeAll();
        contentPane.add(fondo);
        pantallaABM.setPropietario(propietarioSelec);
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }
    void ListarNoPropietarios(){
        contentPane.removeAll();
        contentPane.add(fondo);
        SeleccionarPropietario pantallaListar = new SeleccionarPropietario();
        pantallaListar.setBounds((contentPane.getWidth()/2)-(pantallaListar.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaListar.getHeight()/2), 
							pantallaListar.getWidth(), 
							pantallaListar.getHeight());
        contentPane.add(pantallaListar);
        pantallaListar.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }

    void ListarClientes(GenerarReservaInterfaz aThis) {
        contentPane.removeAll();
        contentPane.add(fondo);
        ListarClientesOPropietarios pantallaListar = new ListarClientesOPropietarios(aThis);
        pantallaListar.setBounds((contentPane.getWidth()/2)-(pantallaListar.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaListar.getHeight()/2), 
							pantallaListar.getWidth(), 
							pantallaListar.getHeight());
        contentPane.add(pantallaListar);
        pantallaListar.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }
    void ListarClientes(GenerarVentaInterfazSR aThis) {
        contentPane.removeAll();
        contentPane.add(fondo);
        ListarClientesOPropietarios pantallaListar = new ListarClientesOPropietarios(aThis);
        pantallaListar.setBounds((contentPane.getWidth()/2)-(pantallaListar.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaListar.getHeight()/2), 
							pantallaListar.getWidth(), 
							pantallaListar.getHeight());
        contentPane.add(pantallaListar);
        pantallaListar.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }

    void GenerarReserva(Inmueble inmSeleccionado) {
        contentPane.removeAll();
        contentPane.add(fondo);
        GenerarReservaInterfaz pantallaReserva = new GenerarReservaInterfaz(inmSeleccionado);
        pantallaReserva.setBounds((contentPane.getWidth()/2)-(pantallaReserva.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaReserva.getHeight()/2), 
							pantallaReserva.getWidth(), 
							pantallaReserva.getHeight());
        contentPane.add(pantallaReserva);
        pantallaReserva.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }

    void GenerarReserva(GenerarReservaInterfaz pantallaReserva, Cliente clienteRecuperado) {
         contentPane.removeAll();
         contentPane.add(fondo);
         pantallaReserva.setCliente(clienteRecuperado);
        pantallaReserva.setBounds((contentPane.getWidth()/2)-(pantallaReserva.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaReserva.getHeight()/2), 
							pantallaReserva.getWidth(), 
							pantallaReserva.getHeight());
        contentPane.add(pantallaReserva);
        pantallaReserva.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }

    void GenerarReserva(GenerarReservaInterfaz pantallaReserva) {
         contentPane.removeAll();
         contentPane.add(fondo);
        pantallaReserva.setBounds((contentPane.getWidth()/2)-(pantallaReserva.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaReserva.getHeight()/2), 
							pantallaReserva.getWidth(), 
							pantallaReserva.getHeight());
        contentPane.add(pantallaReserva);
        pantallaReserva.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }
    
    void AltaOModificarInmueble(ABMInmuebleInterfaz pantallaABM) {
        contentPane.removeAll();
        contentPane.add(fondo);
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }

    void ConsultaVendedor() {
        contentPane.removeAll();
        contentPane.add(fondo);
        ConsultaVendedor pantallaVendedores = new ConsultaVendedor();
        pantallaVendedores.setBounds((contentPane.getWidth()/2)-(pantallaVendedores.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaVendedores.getHeight()/2), 
							pantallaVendedores.getWidth(), 
							pantallaVendedores.getHeight());
        contentPane.add(pantallaVendedores);
        pantallaVendedores.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }
    
    void altaVendedor() {
        contentPane.removeAll();
        contentPane.add(fondo);
        ABMVendedorInterfaz altaVendedor = new ABMVendedorInterfaz("alta", null);
        altaVendedor.setBounds((contentPane.getWidth()/2)-(altaVendedor.getWidth()/2), 
							(contentPane.getHeight()/2)-(altaVendedor.getHeight()/2), 
							altaVendedor.getWidth(), 
							altaVendedor.getHeight());
        contentPane.add(altaVendedor);
        altaVendedor.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }

    void modificarVendedor(Vendedor vend) {
        contentPane.removeAll();
        contentPane.add(fondo);
        ABMVendedorInterfaz modificarVendedor = new ABMVendedorInterfaz("modificacion", vend);
        modificarVendedor.setBounds((contentPane.getWidth()/2)-(modificarVendedor.getWidth()/2),
                                                    (contentPane.getHeight()/2)-(modificarVendedor.getHeight()/2),
                                                    modificarVendedor.getWidth(), modificarVendedor.getHeight());
        contentPane.add(modificarVendedor);
        modificarVendedor.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }

    void bajaVendedor(Vendedor get) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void DetallesInmueble(Inmueble inmSeleccionado) {
        contentPane.removeAll();
        contentPane.add(fondo);
        ABMInmuebleInterfaz pantallaABM = new ABMInmuebleInterfaz(inmSeleccionado,"DETALLES");
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();}

    void GenerarVentaSRes(Inmueble inmSeleccionado) {
        contentPane.removeAll();
        contentPane.add(fondo);
        GenerarVentaInterfazSR pantallaABM = new GenerarVentaInterfazSR(inmSeleccionado);
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }

        void GenerarVentaSRes(GenerarVentaInterfazSR pantallaReserva, Cliente clienteRecuperado) {
        contentPane.removeAll();
        contentPane.add(fondo);
        pantallaReserva.setCliente(clienteRecuperado);
        pantallaReserva.setBounds((contentPane.getWidth()/2)-(pantallaReserva.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaReserva.getHeight()/2), 
							pantallaReserva.getWidth(), 
							pantallaReserva.getHeight());
        contentPane.add(pantallaReserva);
        pantallaReserva.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }
    

    void GenerarVentaSRes(GenerarVentaInterfazSR pantallaReserva) {
        contentPane.removeAll();
        contentPane.add(fondo);
        pantallaReserva.setBounds((contentPane.getWidth()/2)-(pantallaReserva.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaReserva.getHeight()/2), 
							pantallaReserva.getWidth(), 
							pantallaReserva.getHeight());
        contentPane.add(pantallaReserva);
        pantallaReserva.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }
    
    void GenerarVentaCRes(Inmueble inmSeleccionado) {
        contentPane.removeAll();
        contentPane.add(fondo);
        GenerarVentaInterfaz pantallaABM = new GenerarVentaInterfaz(inmSeleccionado);
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }

    public void setVendedorLogeado(Vendedor vendedor) {
        vendedorLogeado=vendedor;
    }

    Vendedor getVendedorLogueado() {
        return vendedorLogeado;
    }
}