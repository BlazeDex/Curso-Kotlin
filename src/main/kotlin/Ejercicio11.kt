fun main() {
    val limitNumbers = 5;
    val numbers = DoubleArray(limitNumbers);
    var positiveNumber = 0.0;
    var negativeNumber = 0.0;
    var ceroCounter = 0;

    for(i in 0 until limitNumbers) {
        println("Ingresa el número $i: ");
        val input = readLine()?.toDoubleOrNull();

        if(input != null) {
            numbers[i] = input;
            if(input > 0) {
                positiveNumber += input;
            } else if(input < 0) {
                negativeNumber += input;
            } else {
                ceroCounter++;
            }
        } else {
            println("El número que introduciste no es válido.");
            return;
        }
    }

    if(positiveNumber > 0) {
        val positiveAvg = positiveNumber/limitNumbers;
        println("La media de los números positivos es de: $positiveAvg")
    } else {
        println("No se ingresaron números positivos.");
    }

    if(negativeNumber < 0) {
        val negativeAvg = negativeNumber/limitNumbers;
        println("La media de los números positivos es de: $negativeAvg")
    } else {
        println("No se ingresaron números negativos.");
    }

    println("Número de ceros: $ceroCounter");
}
