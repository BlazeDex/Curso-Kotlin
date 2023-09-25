import kotlin.math.pow
fun main (args: Array<String>) {
    println("Este es un programa para calcular el área y longitud de una circunferencia.");
    print("Ingresa el valor del radio de la circunferencia: ");

    val radius = readLine()?.toDoubleOrNull();
    val pi = 3.1416;

    if (radius !=  null) {
        val length = 2*pi*radius;
        val power = 2;
        val area= pi*radius.pow(power);

        print("El área  de la circunferencia es $area y su longitud es $length.");
    } else {
        print("Ingresa un número, por favor.");
    }
}