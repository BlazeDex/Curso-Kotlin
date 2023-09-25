fun main (args: Array<String>) {
    println("Este es un programa que convierte  km/h a m/s.");
    print("Introduce la velocidad en km/h: ");

    val speed = readLine()?.toDoubleOrNull();

    if (speed != null) {
        val conversion = speed*1000/3600;
        val rounded = "%.2f".format(conversion)
        print("Una velocidad de $speed km/h equivale a $rounded m/s.");
    } else {
        print("Ingresa un valor válido.")
    }
}