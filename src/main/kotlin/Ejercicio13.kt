fun main() {
    val cantidadNumeros = 10
    val numeros = IntArray(cantidadNumeros)

    // Leer los números del usuario y almacenarlos en el arreglo
    for (i in 0 until cantidadNumeros) {
        print("Ingresa el número ${i + 1}: ")
        val entrada = readLine()?.toIntOrNull()

        if (entrada != null) {
            numeros[i] = entrada
        } else {
            println("Número no válido. Introduce un número entero válido.")
            return;
        }
    }

    // Mostrar los números en el orden especificado
    println("Números en el orden especificado:")
    for (i in 0 until cantidadNumeros / 2) {
        println(numeros[i])
        println(numeros[cantidadNumeros - 1 - i])
    }

    // En caso de haber un número impar de elementos, mostrar el número central
    if (cantidadNumeros % 2 != 0) {
        println(numeros[cantidadNumeros / 2])
    }
}
