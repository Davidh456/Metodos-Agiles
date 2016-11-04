package Interfaz;

/*Clase principal*/


import Clases.Cliente;
import Clases.Inmueble;
import Clases.Propietario;
import Conexion.Conexion;
import Interfaz.*;
import Logica.ABMInmueble;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Inmobiliaria extends JFrame{
    //Aqu� vamos a declarar todas las sub-pantallas que vamos a usar
    private JPanel contentPane;
    private JPanel fondo;
    
    //Esta parte de instancia es para hacer la clase Singleton
    
    private static Inmobiliaria instancia = null;
    private static ABMInmueble instanciaOperadorInmueble = null;
    
    JPanel AltaClienteOPropietario;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					instancia = new Inmobiliaria();
                                        Conexion.getInstance();
                                        Inmobiliaria.getInstance().inicializarInmobiliaria();
                                        Inmobiliaria.getInstance().MenuPrincipal();
                                        
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

        //Aqu� que dan las dimensiones segun la resoluci�n de pantalla
        Toolkit t = Toolkit.getDefaultToolkit();
        java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, screenSize.height-48);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        cerrar();

        //Este contentPane es el JPanel que va a contener a toda la interfaz gr�fica
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBounds(0, 0, screenSize.width, screenSize.height-48);

        fondo = new JPanel();
        fondo.setBounds(0, (contentPane.getHeight()/2)-(contentPane.getHeight()/4), contentPane.getWidth(), contentPane.getHeight()/2);
        fondo.setBackground(new Color(190,190,250));
        

    }
    public void cerrar(){
        this.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                        int opcion = JOptionPane.showOptionDialog(null, 
                                        "�Seguro que quiere salir?", "Cerrar", JOptionPane.YES_NO_OPTION, 2, null, new String[]{"Si","No"}, null);
                        if (opcion == 0){
					System.exit(0);
				}
				
			}
        });
    }
    public void AltaPropietario() {
        contentPane.removeAll();
        ABMClienteOPropietario pantallaABM = new ABMClienteOPropietario("propietario", "alta", null,null);
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }
    public void ModificacionPropietario(Propietario propietario) {
        contentPane.removeAll();
        ABMClienteOPropietario pantallaABM = new ABMClienteOPropietario("propietario", "modificacion", null,propietario);
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
        contentPane.revalidate();
    }
    public void BajaPropietario(Propietario propietario) {
        contentPane.removeAll();
        ABMClienteOPropietario pantallaABM = new ABMClienteOPropietario("propietario", "baja", null,propietario);
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
        ABMClienteOPropietario pantallaABM = new ABMClienteOPropietario("cliente", "alta", null,null);
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
        ABMClienteOPropietario pantallaABM = new ABMClienteOPropietario("cliente", "modificacion", cliente,null);
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
        ABMClienteOPropietario pantallaABM = new ABMClienteOPropietario("cliente", "baja", cliente,null);
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
        MenuPrincipal menu = new MenuPrincipal();
        menu.setBounds((contentPane.getWidth()/2)-(menu.getWidth()/2), 
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
}
