fun main() {
    val filas = 3
    val columnas = 3

    // Crear las dos matrices
    val matriz1 = Array(filas) { IntArray(columnas) }
    val matriz2 = Array(filas) { IntArray(columnas) }

    // Cargar las matrices con valores
    cargarMatriz(matriz1, "Matriz 1")
    cargarMatriz(matriz2, "Matriz 2")

    // Sumar las matrices
    val matrizSuma = sumarMatrices(matriz1, matriz2)

    // Mostrar la matriz resultante
    println("Matriz Suma:")
    mostrarMatriz(matrizSuma)
}

// Función para cargar una matriz con valores ingresados por el usuario
fun cargarMatriz(matriz: Array<IntArray>, nombre: String) {
    println("Cargar $nombre:")
    for (i in 0 until matriz.size) {
        for (j in 0 until matriz[i].size) {
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
}

// Función para sumar dos matrices
fun sumarMatrices(matriz1: Array<IntArray>, matriz2: Array<IntArray>): Array<IntArray> {
    val filas = matriz1.size
    val columnas = matriz1[0].size
    val matrizSuma = Array(filas) { IntArray(columnas) }

    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }

    return matrizSuma
}

// Función para mostrar una matriz
fun mostrarMatriz(matriz: Array<IntArray>) {
    for (fila in matriz) {
        for (valor in fila) {
            print("$valor\t")
        }
        println()
    }
}