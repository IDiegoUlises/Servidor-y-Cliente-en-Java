# Creacion De Un Cliente y Servidor

**Funcion:** Realiza una comunicacion socket por el protocolo **TCP/IP** diseñe este codigo para mi **raspberry** pi 3 sea el servidor para que pueda conectase mi **televisor.**

**Multiprocesos:** Necesitaremos utilizar multiprocesos para usar ```read();``` y ```write();``` simultanamente yo diseñe un algoritmo que no utiliza multiproceso porque la comunicacion la realiza en una solo proceso.

**Bucle Infinito:** En la comunicacion utilizara la funcion de lectura como ```Read();``` es un bucle infinito que solo puede salir cuando recibe un dato para evitar esto puede usar ```SeTimeOut();``` que significa establecer tiempo de respuesta para terminar la conexion.

**App De Android:** Para ejecutarlo en una aplicacion android debe asignar los permisos correspondiende de la aplicacion para el correcto funcionamiento.

**Aplicacion De Escritorio:** Corre en Window, Linux y Raspberry Pi de todos los modelos, es compatible con todos los dispositivos mencionados.

**Emigrar el Servidor:** Principalmente se habia diseñado el servidor en python y el cliente en java usted puede emigrar el servidor en python o en cualquier otro lenguaje.

**Compatibilidad al Emigrar:** Cuando utilize ```writeUTF();``` enviara 2 caracteres adicionales cuando utilize ```readUTF();``` los  dos primeros caracteres que obtendra se eliminaran esto en el caso que aplique un lenguaje diferente .

## Seguridad
Los datos que envian no estan cifrado es decir que son vunerable en un **ataque de hombre en el medio** ahi que tener esto en cuenta si se envian datos **sensibles** como por ejemplo **contraseñas**.

**Como Proteger Datos Sensibles**: Se debe implemantar un cifrado asimetrico con firmas certificadas por el algoritmo **RSA** todo esto esto es una parte de **seguridad de la capa de transporte(TLS)**.

**Funcionamiento De Cifrado Asimetrico:** El emisor de la comunicacion genera una clave privada y una publica mediante **numeros primos** el emisor envia la clave publica y el receptor devuelve un mensaje cifrado con la clave publica luego el emisor decifra el mensaje con la clave privada.

**Como Romper El Cifrado Asimetrico:** Se debe realizar una multiplicacion utilizando numeros primos que de el mismo resultado que la clave publica y los numeros primos utilizado en la multiplicacion forman la clave privada.

**Rompiendo El Cifrado Asimetrico:** Mi ```clave publica es 33``` para poder decifrar se debe realizar multiplicaciones en numeros primos como por **ejemplo** ```2x3=3``` el numero ```2``` y ```3``` **son numeros primos** ahora multiplicamos ```3x11=33``` y el resultado es ```33``` con estos 2 **numeros primos** utilizado para obtener el resultado de 33 se decifra la clave privada.

## ¿Porque Es Imposible Romper Este Cifrado?

Un atacante o un hacker intentara decifrar el mensaje con el metodo anterior, y **si lo va poder decifrar** el inconveniente es que el tiempo que se va demorar en decifrarlo van hacer **60 años o mas**, la seguridad de este cifrado se basa que necesitara una enorme cantidad de computo para poder decifrarlo algo que para la mayoria de dispositivos es imposible.

**Decifrar Con Una Computadora Cuantica:** Cuando los procesadores cuanticos que utilizan quibits para manejar intrucciones lleguen a hacer el estandar del mercado esta cifrado quedara obsoleto ya que los procesadores cuanticos tiene un cantidad de computo exponencial, la computadora cuantica de **IBM** puede romper este cifrado en microsegundos.

**Decifrar Con Un SuperComputador:** En Suiza existen 2 superordenadores en todo el pais y alemania solo existen 14 superordenadores, en todo el planeta solo estan disponible 495 superordenadores repartidos por todo el mundo con una potencia de calculo aproximado a **148 petaflops** que realizan más de 1000 billones de operaciones por segundo es todo esto suficiente para romper este cifrado en segundos.

## Vunerabilidad por Generar Claves Repetitivas
Para una computadora es imposible que genere numeros aleatorios. Un **ejemplo** tu computadora generara 3 numeros aleatorios que seran **3,6 y 9** luego apagas el computador lo vuelves a encender vuelves generar numeros aleatorio  estos numeros aleatorios se volveran a repetir **3,6 y 9** es decir siempre va a repetir los mismos numeros para siempre.

**Como Generar Numeros Aleatorios:** Se pueden generar numeros aleatorios basada en la medicion del clima de un lugar ya que la temperatura de por ejemplo en Francia nadie puede predecir exactamente el patron del clima.




# Android TV

<img src="https://github.com/IDiegoUlises/servidor-y-cliente-en-java/blob/master/Imagenes/Android%20TV.jpg" width="1000" height="600" />



# Servidor Desktop

![alt text](https://github.com/IDiegoUlises/servidor-y-cliente-en-java/blob/master/Imagenes/Desktop.png)

## Finished

**Segunda Parte:** [Algoritmos de seguridad de un servidor](https://github.com/IDiegoUlises/Servidor-y-Cliente-En-Python)

<p align="center">
  <img width="150" height="150" src="https://github.com/IDiegoUlises/servidor-y-cliente-en-java/blob/master/Imagenes/Emoji-Positivo.png">
</p>

## Esto me costo mucho tiempo, meses de investigacion y aprendizaje porfavor deja un comentario positivo si tambien te resulto util unos de mis proyectos.
