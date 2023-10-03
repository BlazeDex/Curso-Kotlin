fun main() {
    val filas = 5
    val columnas = 5
    val matriz = Array(filas) { IntArray(columnas) }

    // Rellenar la matriz de acuerdo a la fórmula T[n,m] = n + m
    for (n in 0 until filas) {
        for (m in 0 until columnas) {
            matriz[n][m] = n + m
        }
    }

    // Mostrar el contenido de la matriz
    println("Contenido de la matriz:")
    for (n in 0 until filas) {
        for (m in 0 until columnas) {
            print("${matriz[n][m]} ")
        }
        println() // Salto de línea al final de cada fila
    }
}