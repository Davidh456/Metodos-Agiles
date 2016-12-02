package Conexion;


public class Hilo extends Thread {
   Thread t;
   private String nombre;
   private String nombreydir;
   private String destino;
   
   public Hilo(String hilo, String archivo, String destinatario) {
      nombre = hilo;
      nombreydir = archivo;
      destino = destinatario;
   }
   
   public void run() {
       if(nombre.equals("email")){
        (new EnvioEmail()).EnvioEmail(nombreydir, destino);
        System.out.println("Saliendo del hilo " + nombre + ".");
       }
   }
   
   public void start () {
      System.out.println("Iniciando hilo " + nombre + ".");
      if (t == null) {
         t = new Thread (this, nombre);
         t.start ();
      }
   }
}
