import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {

//Multifuncion es obligatorio declarar para todas las network incluso sino se usa
    Thread enviar = new Thread(new Runnable() {
        @Override
        public void run() {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {

try {

    //Host donde se va a realizar la conexion
    String hostName = "192.168.1.94";
    
    //Puerto por donde se realizara la conexion
    int portNumber = 60;

    DataInputStream input;
    DataOutputStream output;

    //Crea el objeto socket
    Socket socket = new Socket(hostName, portNumber);

    //Esto agregar si usted quiere agregar un tiempo de finalizacion
    //socket.setSoTimeout (10 * 1000);

    //Objetos que envia los datos
    output = new DataOutputStream(socket.getOutputStream());

    //Objetos que recibe lo datos
    input = new DataInputStream(socket.getInputStream());

    //Envia un dato al servidor
    output.writeUTF("devolver");

    //Recibe el dato de respuesta del servidor
    String mensaje = input.readUTF();

    //termina el socket
    socket.close();
}

catch (Exception e)
{
    Log.i("problema", e.toString());
}


                } //termina run
            }); //Cerrar



//Cerrar run
        }
        //Cerrar run

    //Cerrar
    });
    //Cerrar




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        //BUTTON ONCLICK//
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            
                //Esto es obligatorio porque habilita para ejecutar el hilo 
                StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
                StrictMode.setThreadPolicy(policy);
                
                //Ejecuta el hilo
                enviar.start();


            }
        });
        //BUTTON//
    }
}
