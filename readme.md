# Creacion De Un Cliente y Servidor

### Este servidor y cliente esta diseñado para que cualquier dipositivo que ejecute java pueda realizar una comunicacion socket mediante tcp/ip. Yo diseñe este codigo para que una raspberry pi 3 ejecute el servidor y un televisor ejecute el cliente.

**Funcion Del Codigo:** Inicia una comunicacion socket en la cual se intercambian datos tanto como el servidor y un usuario.

**Aclaracion Sobre Multiprocesos:** Esto recibe y envia datos en una misma conexion, para esto necesitaremos realizar una multiproceso para realizar 2 tareas diferentes que es escuchar datos y enviar datos al mismo tiempo yo diseñe un sencillo **"truco"** para no utilizar el multiproceso y realizar la tarea en un solo proceso.

**Bucle Infinito:** En la comunicacion de redes se utilizara una funcion para la lectura de los datos como por ejemplo Read(); la funcion contiene un bucle infinito el bucle solo puede terminar si recibe un dato para evitar que se cuelge se puede utilizar SeTimeOut(); que significa establecer tiempo de respuesta para terminar la conexion para evitar que se cuelgue.

**App De Android:** Para ejecutarlo en una aplicacion android debe asignar los permisos correspondiende de la aplicacion para el correcto funcionamiento.

**Aplicacion De Escritorio:** Corre en Window, Linux y Raspberry Pi de todos los modelos, es compatible con todos los dispositivos mencionados.

**Implementacion Con Otros Lenguajes:** Principalmente se habia diseñado el servidor en python y el cliente en java todo funcionaba correctamente, usted puede programar el servidor en python o en cualquier otro lenguaje.

**Defecto De Codigo Si Implementa Otra Lenguaje:** La funcion readUTF(); y writeUTF(); no tiene mucha compatibilidad con diferentes lenguajes de programacion, funcionan con el detalle que writeUTF(); manda 2 caracteres inutiles que sirven para establecer la comunicacion con UTF-8 es decir que usted mandara 2 caracteres adicional en su mensaje y cuando utilize readUTF(); los 2 primeros caracteres se eliminaran, tendra estos inconvenientes si utiliza un lenguaje diferente.




### Android TV

<img src="https://github.com/IDiegoUlises/servidor-y-cliente-en-java/blob/master/Imagenes/Android%20TV.jpg" alt="Your image title" width="1000"/>



### Servidor Desktop

![alt text](https://github.com/IDiegoUlises/servidor-y-cliente-en-java/blob/master/Imagenes/Desktop.png)


