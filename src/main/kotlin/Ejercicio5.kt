fun main (args: Array<String>) {
    println("Este es un programa que pide números hasta que se teclee uno negativo.");

    var counter = 0;

    while (true) {
        print("Introduce un número (introduce uno negativo para finalizar): ");
        val number = readLine()?.toDoubleOrNull();

        if (number == null) {
            println("Ingresa un valor válido.");
            continue;
        }

        if (number < 0) {
            break;
        }
        counter++;
    }

    print("Se ingresaron un total de $counter números.");
}