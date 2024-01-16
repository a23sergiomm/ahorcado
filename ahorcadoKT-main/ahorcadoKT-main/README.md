# ahorcadoKT


![Alt text](images/image.png)


Nos planteamos dos objetivos
- examinar  la compatibilidad kotlin/java
- escribir código que implique usar  funciones de String de Kotlin para generar código conciso y elegante.

Disponemos de código java ya escrito que queremos reutilizar directamente:
- código del típico dibujo del ahorcado en DibujoAhorcado.java
- código de un reproductor midi casero en ReproductorMidi.java
- el método Thread.sleep() de la biblioteca java 

Escribiremos la lógica del juego en Kotlin usando estos dos recursos. El código lo encontrarás en los correspondientes ficheros de este proyecto.  Antes de escribir la lógica del  juego puedes probar el manejo del código Java que se te facilita como se indica en ficheros anexos a este enunciado.

Observa en el siguiente pantallazo como usamos código java dentro de kotlin:
- invocar código java que está en otros ficheros como el de la clase DibujoAhorcado y ReproductorMidi
-  incluir código java dentro del propio fichero kt “mezclando” sentencias kotlin y java. Por ejemplo podemos usar la función sleep() de java.
![Alt text](images/image-3.png)



## MECÁNICA DEL JUEGO
Establecemos un diccionario de palabras relacionadas. Por ejemplo, una lista de de frutas o lo que se te ocurra.

Aleatoriamente el programa escoge una palabra y el usuario debe adivinarla.

Si el usuario adivina la palabra “gana”. Establecemos un número fallos permitidos, al alcanzarlo se acaba el juego y el usuario “pierde”. Si trabajamos  con el código del dibujo, debido a que queremos respetar y “no tocar” ese código,  el número de fallos permitidos será 7. Al producirse el séptimo fallo el usuario pierde y se acaba la partida

Puedes hacer una primera versión sin música ni dibujo para centrarte en la lógica y una vez que la acabes le añades la capacidad de reproducir una canción e ir dibujando el ahorcado.


## REQUISITOS
Se entrega proyecto que contiene código y un video de ejecución.  


## VIDEO
Puedes descargar el video para ver una posible ejecución del juego. Puedes hacerla más simple o más elaborada. A tu gusto.