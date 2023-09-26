fun main() {
    println("Este programa pide un número, dicho número es un total de sueldos, y se muestra el más grande.");
    print("Ingresa la cantidad de sueldo a generar: ");

    val nSalary = readLine()?.toIntOrNull();

    if(nSalary != null && nSalary > 0) {
        var maxSalary = Double.MIN_VALUE;

        for(i in 1..nSalary) {
            print("Ingresa el sueldo $i: ");
            val salary = readLine()?.toDoubleOrNull();

            if(salary != null && salary > 0) {
                if(salary > maxSalary) {
                    maxSalary = salary;
                }
            } else {
                print("Ingresa un sueldo válido y mayor a cero.")
                return;
            }
        }
        println("El sueldo máximo es: $maxSalary");
    } else {
        println("Ingresa un valor válido y mayor a cero.")
    }
}