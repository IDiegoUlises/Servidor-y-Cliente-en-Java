# Creacion De Un Cliente y Servidor

**Funcion:** Realiza una comunicacion socket por el protocolo **TCP/IP** diseñe este codigo para mi **raspberry** pi 3 sea el servidor para que pueda conectarse a mi **televisor.**

**Multiprocesos:** Necesitaremos utilizar multiprocesos para usar ```read(); ``` y ```write();``` simultanamente yo diseñe un algoritmo que no utiliza multiproceso porque la comunicacion se realiza en una solo proceso.

**Bucle Infinito:** En la comunicacion utilizara la funcion de lectura como ```Read();``` es un bucle infinito que solo puede salir cuando recibe un dato para evitar esto puede usar ```SeTimeOut();``` que significa establecer tiempo de respuesta para terminar la conexion.

**App De Android:** Para ejecutarlo en una aplicacion android debe asignar los permisos correspondiende de la aplicacion para el correcto funcionamiento.

**Aplicacion De Escritorio:** Corre en Window, Linux y Raspberry Pi de todos los modelos, es compatible con la mayoria de los dispositivos.

**Emigrar el Servidor:** Principalmente se habia diseñado el servidor en **python** y el cliente en **java** usted puede emigrar el servidor en cualquier otro lenguaje.

**Compatibilidad al Emigrar:** Cuando use ```writeUTF();``` enviara 2 caracteres adicionales cuando utilize ```readUTF();``` los dos primeros caracteres recibidos se eliminaran esto en el caso que incorpore con otro lenguaje diferente esto es porque se establece entre el emisor y receptor que es una comunicacion UTF-8.

## Seguridad
Los datos enviados no estan cifrado son vunerable a un **ataque de hombre en el medio** se debe agregar un cifrado cuando los datos enviados son **sensibles** como **contraseñas**.

**Como Proteger Datos Sensibles**: Se implemanta un cifrado asimetrico con firmas certificadas por el algoritmo **RSA** todo esto esto es una parte de **seguridad de la capa de transporte(TLS)**.

**Como Funciona el Cifrado Asimetrico:** El emisor de la comunicacion genera una clave privada y una publica mediante numeros primos el emisor envia la clave publica y el receptor devuelve un mensaje cifrado con la clave publica luego el emisor decifra el mensaje con la clave privada.

## Como Romper Este Cifrado 

Se debe realizar una **multiplicacion** utilizando **numeros primos** que deben dar el resultado la misma clave publica y los numeros primos utilizados en la multiplicacion es la clave privada.

**Decifrar:** Mi clave publica es ```33``` para decifrar la clave privada se realizan multiplicaciones con numeros primos como ```2x3=3``` los numeros multiplicados ```2``` y ```3``` **son numeros primos** ahora multiplicamos ```3x11=33``` y el resultado es ```33``` con los **numeros primos** utilizado para obtener el resultado se obtiene la clave privada.

**Decifrar en una Computadora Cuantica:** Cuando los procesadores cuanticos que utilizan **quibits** para manejar intrucciones lleguen a hacer el estandar del mercado **este cifrado quedara obsoleto** ya que los procesadores cuanticos tiene un cantidad de computo exponencial la computadora cuantica de **IBM** puede romper este cifrado en microsegundos.

**Decifrar en un Superordenador:** En **Suiza** existen 2 superordenadores en todo el pais y **alemania** solo existen 14 supercomputadores, en todo el planeta solo estan disponible 495 **superordenadores** repartidos por todo el mundo con una potencia de calculo aproximado a **148 petaflops** que realizan más de 1000 billones de operaciones por segundo es todo esto suficiente para romper este cifrado en segundos.

## ¿Porque Es Imposible Romper Este Cifrado?

Un **atacante** o un **hacker** intentara decifrar el mensaje con el metodo anterior y lo va **a decifrar** el inconveniente es que el tiempo que se va demorar en decifrarlo van hacer **60 años o mas** la seguridad de este cifrado se basa que necesitara una enorme cantidad de computo para poder decifrarlo algo que para la mayoria de dispositivos es **imposible.**


## Vunerabilidad por Generar Claves Repetitivas
Para una computadora es imposible que genere numeros aleatorios. Un **ejemplo** tu computadora generara 3 numeros aleatorios que seran ```3,6 y 9``` luego apagas el computador lo vuelves a encender vuelves generar numeros aleatorio  estos numeros aleatorios se volveran a repetir ```3,6 y 9``` es decir siempre va a repetir los mismos numeros para siempre.

**Como Generar Numeros Aleatorios:** Se pueden generar numeros aleatorios basada en la **medicion del clima** de un lugar ya que la temperatura de por ejemplo en Francia nadie puede predecir exactamente el patron del clima.




# Android TV

<img src="https://github.com/IDiegoUlises/servidor-y-cliente-en-java/blob/master/Imagenes/Android%20TV.jpg" width="1000" height="600" />



# Servidor Desktop

![alt text](https://github.com/IDiegoUlises/servidor-y-cliente-en-java/blob/master/Imagenes/Desktop.png)

## Finished

**Segunda Parte:** [Crea una base de datos](https://github.com/IDiegoUlises/Crea-una-Base-de-Datos)

**Tercera Parte:** [Algoritmos de seguridad de un servidor](https://github.com/IDiegoUlises/Servidor-y-Cliente-En-Python)
