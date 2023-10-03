fun main() {
    val filas = 10
    val columnas = 10
    val matriz = Array(filas) { IntArray(columnas) }

    // Cargar la matriz con valores
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            print("Ingresa el valor para la posición [$i][$j]: ")
            val entrada = readLine()?.toIntOrNull()

            if (entrada != null) {
                matriz[i][j] = entrada
            } else {
                println("Valor no válido. Introduce un número entero válido.")
                return
            }
        }
    }

    // Mostrar la matriz
    println("Matriz:")
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            print("${matriz[i][j]}\t")
        }
        println()
    }

    // Calcular y mostrar la suma de cada fila
    println("Suma de cada fila:")
    for (i in 0 until filas) {
        val sumaFila = matriz[i].sum()
        println("Fila $i: $sumaFila")
    }

    // Calcular y mostrar la suma de cada columna
    println("Suma de cada columna:")
    for (j in 0 until columnas) {
        val sumaColumna = matriz.map { it[j] }.sum()
        println("Columna $j: $sumaColumna")
    }
}