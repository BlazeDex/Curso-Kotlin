fun main(args: Array<String>) {
   print("Ingresa un número: ");

    val number = readLine()?.toIntOrNull();

    if (number !=  null) {
        val doble = number*2;
        val triple = number*3;

        print("El doble de $number es $doble y el triple es $triple.");
    } else {
        print("Ingresa un número, por favor.");
    }
}