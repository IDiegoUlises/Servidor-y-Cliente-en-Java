import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class JavaApplication1 {

    public static void main(String[] args) throws IOException {
   
        //Crea un socket con el puerto 60
         ServerSocket serverSocket = new ServerSocket(60);
         System.out.println("servidor esta esperando un cliente");
         
         //El cliente ha acceptado socket
         Socket socket = serverSocket.accept();
         System.out.println("un cliente se a conectado");
         
        //Objeto que recibe datos
        DataInputStream input = new DataInputStream(socket.getInputStream());
        
        //Objeto que envia datos
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        
        //Espera hasta que el cliente envie un mensaje
        String mensaje = input.readUTF();
        System.out.println("Cliente: " + mensaje);
        
        //Realiza una comparacion para que el servidor responda con los datos 
        //recibos por el cliente puede ser una peticion del cliente
        String comparar = "devolver";
        if(mensaje.equals(comparar))
        {
           //Envia los datos
           output.writeUTF("devolviendo datos");
           System.out.println("mensaje es igual a devolver");
        }
        
        //Cierra el socket
        socket.close();
        System.out.println("socket cerrado");
          
    }
    
}
