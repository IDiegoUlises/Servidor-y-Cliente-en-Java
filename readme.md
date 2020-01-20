Este servidor y cliente en java esta diseñado para que cualquier dipositivo que ejecute java como computador, telefono, televisor y en una raspbery pi pueda ser un cliente y un servidor.

Yo diseñe este codigo para que una raspberry ejecute el servidor y un televisor con android pueda ser el cliente. Esto puede servir en cualquier dispositivo que se pueda programar en java, son muchisimas opciones!

Funcion Del Codigo: El servidor permance en la espera hasta que se establezca una conexion... el cliente inicia la conexion con el servidor luego manda un dato al servidor para que el servidor conozca que dato debe entregar luego finaliza la conexion.

Aclaracion de codigo: Esto recibe y envia datos en una misma conexion, para esto necesitaremos realizar una multiproceso para realizar 2 tareas diferentes que es escuchar datos y enviar datos al mismo tiempo yo diseñe un sencillo "truco" para evitar utilizar multiproceso y se pueda realizar la escucha y el envio de datos en un solo proceso.

Bucle Infinito: En la comunicacion de redes se utilizara cualquier tipo de Read(); para leer los datos, aclarar que los Read(); la funcion contiene un bucle infinito es decir si el servidor nunca manda un dato estara para siempre esperando el dato es decir que su softaware se quedara colgado para siempre sin poder realizar ninguna funcion para evitar esto se utiliza la funcion SetTimoOut(); tiempo de espera para terminar la conexion es decir usted define la cantidad de tiempo para terminar la conexion asi poder terminar el bucle infinito.

Implementacion con otros lenguajes: Yo principalmente esto lo habia diseñado el servidor en python y el cliente en java todo funciona correctamente. Usted puede programar el servidor en python o en cualquier otro lenguaje y el cliente en java.

Implementacion con otros lenguajes un detalle en el codigo:
La funcion readUTF(); y writeUTF(); no tiene mucha compatibilidad con otros lenguajes de programacion, si funcionan el detalle que writeUTF(); manda 2 caracteres inutiles que sirven para establecer la comunicacion con UTF-8 es decir que usted mandara 2 caracteres adicional en su mensaje y cuando utilize readUTF(); los 2 primeros caracteres se eliminaran. Funciona bien solo con estos inconvenientes yo recomiendo si diseña un cliente o servidor en un lenguaje diferente a java, debe tomar esto en cuenta.

