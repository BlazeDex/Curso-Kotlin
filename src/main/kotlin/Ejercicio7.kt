import kotlin.random.Random
fun main (args: Array<String>) {
    println("Adivina el número secreto (del 1 al 100). El programa termina al acertar.");

    val randomNumber = Random.nextInt(1, 101);
    var counter = 0;

    while (true) {
        print("Ingresa un número: ");
        val number = readLine()?.toIntOrNull()

        if (number == null) {
            println("Ingresa un valor válido.");
            continue;
        }

        if( number > randomNumber) {
            println("El número que ingresaste ($number) es mayor al número secreto.")
            counter++;
            continue;
        } else if (number < randomNumber) {
            println("El número que ingresaste ($number) es menor al número secreto.")
            counter++;
            continue;
        } else {
            counter++;
            break;
        }
    }

    print("El número secreto era $randomNumber y lo has adivinado en $counter intentos.");
}