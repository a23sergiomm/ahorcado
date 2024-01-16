import kotlin.random.Random

fun main() {
    val rm = ReproductorMidi("pugnodollari.mid")
    println("Cargando juego...")
    Thread.sleep(5000) //la música tarda un ratito y por eso hacemos este sleep....

    var opcion: Int
    do {
            println("________________________________________")
            println("|  ¡Bienvenido al Juego del Ahorcado!  |")
            println("|   Selecciona la tematica del juego   |")
            println("|      1.Marcas de coche               |")
            println("|      2.Frutas                        |")
            println("|      3.Lenguajes de programacion     |")
            println("|      4.Salir                         |")
            println("________________________________________")
            opcion = readLine()?.toIntOrNull() ?: 0
    } while (opcion !in 1..4)

    var palabras = arrayOf("")

    when (opcion) {
            1 -> {
                palabras = arrayOf("bmw", "ford", "kia", "citroen", "renault", "mclaren", "seat", "saab", "mercedes")
            }
            2 -> {
                palabras = arrayOf("pera", "naranja", "manzana", "platano", "sandia", "fresa", "melon", "melocoton", "albaricoque")
            }
            3 -> {
                palabras = arrayOf( "java", "kotlin", "python", "javascript", "html", "css", "c++", "angular", "ionic")
            }
            4 -> {
                rm.cerrar()
            }
    }

    val palabraSeleccionada = palabras[Random.nextInt(palabras.size)]
    val palabraSecreta = palabraSeleccionada.toCharArray()
    val palabraAdivinada = CharArray(palabraSecreta.size) { '_' }
    var intentos = 0

    while ((intentos > 0 || intentos == 0 ) && '_' in palabraAdivinada &&  intentos < 7) {
        println("Palabra actual: ${String(palabraAdivinada)}")
        println("Intentos usados: $intentos")
        val tini = 6 - intentos
        println("Intentos restantes : $tini")
        println("Ingresa una letra: ")
        val letra = readLine()?.get(0) ?: continue

        if (letra in palabraSecreta) {
            for (i in palabraSecreta.indices) {
                if (palabraSecreta[i] == letra) {
                    palabraAdivinada[i] = letra
                }
            }
        } else {
            intentos++
            DibujoAhorcado.dibujar(intentos);
        }
    }

    if ('_' !in palabraAdivinada && opcion != 4) {
        println("¡Felicidades! Has adivinado la palabra: ${String(palabraAdivinada)}")
        rm.cerrar()
    } else if (opcion == 4){
        println("Saliendo...")
    }else{
        println("¡Oh no! Te has quedado sin intentos. La palabra era: ${String(palabraSecreta)}")
    }
}
