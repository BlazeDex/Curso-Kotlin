import kotlin.math.pow
fun main (args: Array<String>) {
    println("Este es un programa para calcular el área y longitud de una circunferencia.");
    print("Ingresa el valor del radio de la circunferencia: ");

    val radius = readLine()?.toDoubleOrNull();
    val pi = Math.PI;

    if (radius !=  null) {
        val length = 2*pi*radius;
        val roundLength = "%.2f".format(length);
        val area= pi*radius.pow(2);
        val roundArea = "%.2f".format(area);

        print("El área  de la circunferencia es $roundArea y su longitud es $roundLength.");
    } else {
        print("Ingresa un número, por favor.");
    }
}