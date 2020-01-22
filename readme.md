# Creacion De Un Cliente y Servidor

### Este servidor y cliente esta diseñado para que cualquier dipositivo que ejecute java pueda realizar una comunicacion socket mediante tcp/ip. Yo diseñe este codigo para que una raspberry pi 3 ejecute el servidor y un televisor ejecute el cliente.

**Funcion Del Codigo:** Inicia una comunicacion socket en la cual se intercambian datos tanto como el servidor y un usuario.

**Aclaracion Sobre Multiprocesos:** Esto recibe y envia datos en una misma conexion, para esto necesitaremos realizar una multiproceso para realizar 2 tareas diferentes que es escuchar datos y enviar datos al mismo tiempo yo diseñe un sencillo **"truco"** para no utilizar el multiproceso y realizar la tarea en un solo proceso.

**Bucle Infinito:** En la comunicacion de redes se utilizara una funcion para la lectura de los datos como por ejemplo Read(); la funcion contiene un bucle infinito el bucle solo puede terminar si recibe un dato para evitar que se cuelge se puede utilizar SeTimeOut(); que significa establecer tiempo de respuesta para terminar la conexion para evitar que se cuelgue.

**App De Android:** Para ejecutarlo en una aplicacion android debe asignar los permisos correspondiende de la aplicacion para el correcto funcionamiento.

**Aplicacion De Escritorio:** Corre en Window, Linux y Raspberry Pi de todos los modelos, es compatible con todos los dispositivos mencionados.

**Implementacion Con Otros Lenguajes:** Principalmente se habia diseñado el servidor en python y el cliente en java usted puede programar el servidor en python o en cualquier otro lenguaje.

**Defecto De Codigo Si Implementa Otra Lenguaje:** La funcion readUTF(); y writeUTF(); no tiene mucha compatibilidad con diferentes lenguajes de programacion, funcionan con el detalle que writeUTF(); manda 2 caracteres inutiles que sirven para establecer la comunicacion con UTF-8 es decir que usted mandara 2 caracteres adicional en su mensaje y cuando utilize readUTF(); los 2 primeros caracteres se eliminaran, tendra estos inconvenientes si utiliza un lenguaje diferente.

**Seguridad:** Los datos que envian no estan cifrado es decir que son vunerable en un **ataque de hombre en el medio** ahi que tener esto en cuenta si se envian datos **sensibles** como por ejemplo **contraseñas**.

**Como Proteger Datos Sensibles**: Se debe implemantar un cifrado asimetrico con firmas certificadas por el algoritmo **RSA** todo esto esto es una parte de **seguridad de la capa de transporte(TLS)**.

**Funcionamiento De Cifrado Asimetrico:** El emisor de la comunicacion genera una clave privada y una publica mediante **numeros primos** el emisor envia la clave publica y el receptor devuelve un mensaje cifrado con la clave publica luego el emisor decifra el mensaje con la clave privada.

**Como Romper El Cifrado Asimetrico:** Se debe realizar una multiplicacion utilizando numeros primos que de el mismo resultado que la clave publica y los numeros primos utilizado en la multiplicacion forman la clave privada.

**Rompiendo El Cifrado Asimetrico:** Mi **clave publica es 33** para poder decifrar se debe realizar multiplicaciones en numeros primos como por ejemplo **2x3=3** el numero 2 y 3 **son numeros primos** ahora multiplicamos **3x11=33** y el resultado es 33 con estos 2 **numeros primos** utilizado para obtener el resultado de **33** se decifra la clave privada.

## ¿Porque Es Imposible Romper Este Cifrado?

Un atacante o un hacker intentara decifrar el mensaje con el metodo anterior, y **si lo va poder decifrar** el inconveniente es que el tiempo que se va demorar en decifrarlo van hacer **60 años o mas**, la seguridad de este cifrado se basa que necesitara una enorme cantidad de computo para poder decifrarlo algo que para la mayoria de dispositivos es imposible.

**Decifrar Con Una Computadora Cuantica:** Cuando los procesadores cuanticos que utilizan quibits para manejar intrucciones lleguen a hacer el estandar del mercado esta cifrado quedara obsoleto ya que los procesadores cuanticos tiene un cantidad de computo exponencial y ya que pueden decifrarlo en solo segundos.

**Decifrar Con Un SuperComputador:** En Suiza existen 2 superordenadores en todo el pais y alemania solo existen 14 superordenadores, en todo el planeta solo estan disponible 495 superordenadores repartidos por todo el mundo con una potencia de calculo aproximado a **148 petaflops** que realizan más de 1000 billones de operaciones por segundo es todo esto suficiente para romper este cifrado en segundos.

**Vunerabilida Por Generar Claves Publicas Repetitivas:** Una persona puede generar numeros aleatorios pero una computadora es imposible que generare un numero aleatorio. Un **ejemplo:** tu computadora genera 3 numeros aleatorios que son **3,6 y 9** luego apagas el computador lo vuelves a encender y vuelves generar numeros aleatorio y estos numeros aleatorios seran **3,6 y 9** es decir siempre va a repetir los mismos numeros para siempre.

**Como Generar Numeros Aleatorios:** Se pueden generar numeros aleatorios basada en la medicion del clima de un lugar ya que la temperatura de por ejemplo en Francia nadie puede predecir exactamente el patron del clima.




## Android TV

<img src="https://github.com/IDiegoUlises/servidor-y-cliente-en-java/blob/master/Imagenes/Android%20TV.jpg" width="1000" height="600" />



## Servidor Desktop

![alt text](https://github.com/IDiegoUlises/servidor-y-cliente-en-java/blob/master/Imagenes/Desktop.png)


