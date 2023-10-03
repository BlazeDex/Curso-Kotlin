fun main() {
    val numeros = DoubleArray(5)

    // Leer los números del usuario y almacenarlos en el arreglo
    for (i in 0 until 5) {
        print("Ingresa el número ${i + 1}: ")
        val entrada = readLine()?.toDoubleOrNull()

        if (entrada != null) {
            numeros[i] = entrada
        } else {
            println("Número no válido. Introduce un número válido.")
            return
        }
    }

    // Ordenar el arreglo utilizando el método de burbuja
    for (i in 0 until 4) {
        for (j in 0 until 4 - i) {
            if (numeros[j] > numeros[j + 1]) {
                // Intercambiar los elementos si están en el orden incorrecto
                val temp = numeros[j]
                numeros[j] = numeros[j + 1]
                numeros[j + 1] = temp
            }
        }
    }

    // Mostrar el arreglo ordenado
    println("Arreglo ordenado:")
    for (numero in numeros) {
        println(numero)
    }
}