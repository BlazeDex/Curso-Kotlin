fun main() {
    for (i in 1..12) {
        println("Tabla de multiplicar del $i:")
        for (j in 1..12) {
            val resultado = i * j
            println("$i x $j = $resultado")
        }
        println() // Línea en blanco para separar las tablas
    }
}
