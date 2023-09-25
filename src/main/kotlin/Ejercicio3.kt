fun main (args: Array<String>) {
    println("Este es un programa para transformar grados centígrado a Farenheit");
    print("Introduce la cantidad de grados centígrados a transformar: ");

    val degrees = readLine()?.toDoubleOrNull();

    if (degrees !=null) {
        val fahrenheit = 32 + (9*degrees/5);
        print("$degrees grados centígrados equivalen a $fahrenheit grados fahrenheit.");
    } else {
        print("Ingresa un valor válido.");
    }
}