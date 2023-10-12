import kotlin.math.pow
import kotlin.random.Random

class Ejercicios {

    // Ejercicio número 1.
    fun dobleYTriple() {
        println("---------------------------------------");
        println("Este es un programa para calcular el doble y triple de un número.")
        print("Ingresa un número: ");

        val number = readLine()?.toIntOrNull();

        if (number != null) {
            val doble = number * 2;
            val triple = number * 3;

            print("El doble de $number es $doble y el triple es $triple.");
        } else {
            print("Ingresa un número, por favor.");
        }
    }

    //Ejercicio número 2.
    fun areaAndLength() {
        println("---------------------------------------");
        println("Este es un programa para calcular el área y longitud de una circunferencia.");
        print("Ingresa el valor del radio de la circunferencia: ");

        val radius = readLine()?.toDoubleOrNull();
        val pi = Math.PI;

        if (radius != null) {
            val length = 2 * pi * radius;
            val roundLength = "%.2f".format(length);
            val area = pi * radius.pow(2);
            val roundArea = "%.2f".format(area);

            print("El área  de la circunferencia es $roundArea y su longitud es $roundLength.");
        } else {
            print("Ingresa un número, por favor.");
        }
    }

    //Ejercicio número 3.
    fun farenheitConvertor() {
        println("---------------------------------------");
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

    // Ejercicio número 4.
    fun metersPerSecondConverter() {
        println("---------------------------------------");
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

    // Ejercicio número 5.
    fun negativeNumbersDetector() {
        println("---------------------------------------");
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

    // Ejercicio número 6.
    fun hundredToSeven() {
        println("---------------------------------------");
        println("Números del 100 al 0 de 7 en 7.");

        for(number in 100 downTo  0 step 7) {
            println(number);
        }
    }

    // Ejercicio 7.
    fun secretNumber() {
        println("---------------------------------------");
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

    //Ejercicio 8.
    fun biggerSalary() {
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

    // Ejercicio 9.
    fun multiplicationTables() {
        println("---------------------------------------");
        for (i in 1..12) {
            println("Tabla de multiplicar del $i:")
            for (j in 1..12) {
                val resultado = i * j
                println("$i x $j = $resultado")
            }
            println() // Línea en blanco para separar las tablas
        }
    }

    // Ejercicio 10.
    fun replaceNumber3() {
        println("---------------------------------------");
        println("Este programa reemplaza el número 3 por la letra E.");
        for (digito1 in 0..9) {
            for (digito2 in 0..9) {
                for (digito3 in 0..9) {
                    for (digito4 in 0..9) {
                        for (digito5 in 0..9) {
                            val contador = "$digito1-$digito2-$digito3-$digito4-$digito5"
                            val contadorSustituido = contador.replace('3', 'E')
                            println(contadorSustituido)
                        }
                    }
                }
            }
        }
    }

    // Ejercicio 11.
    fun numbersCounters() {
        println("---------------------------------------");
        println("Este cuenta la cantidad de números negativos y positivos que se ingresaron de un total de cinco.");
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

    // Ejercicio 12.
    fun bubbleSort() {
        println("---------------------------------------");
        println("Ordena un vector de números mediante el ordenamiento burbuja.");
        val numeros = DoubleArray(5)

        // Leer los números del usuario y almacenarlos en el arreglo
        for (i in 0 until 5) {
            print("Ingresa el número ${i + 1}: ")
            val entrada = readLine()?.toDoubleOrNull()

            if (entrada != null) {
                numeros[i] = entrada
            } else {
                println("Número no válido. Introduce un número válido.")
                return
            }
        }
        // Ordenar el arreglo utilizando el método de burbuja
        for (i in 0 until 4) {
            for (j in 0 until 4 - i) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambiar los elementos si están en el orden incorrecto
                    val temp = numeros[j]
                    numeros[j] = numeros[j + 1]
                    numeros[j + 1] = temp
                }
            }
        }
        // Mostrar el arreglo ordenado
        println("Arreglo ordenado:")
        for (numero in numeros) {
            println(numero)
        }
    }

    // Ejercicio 13.
    fun orderNumber() {
        println("---------------------------------------");
        println("Lee 10 números enteros y muestra los números de manera intercalada primero-último.");
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

}
fun main() {
    val ejercicio = Ejercicios();

    // Ejercicios básicos.
    ejercicio.dobleYTriple();
    ejercicio.areaAndLength();
    ejercicio.farenheitConvertor();
    ejercicio.metersPerSecondConverter();

    //Ciclos y condicionales.
    ejercicio.negativeNumbersDetector();
    ejercicio.hundredToSeven();
    ejercicio.secretNumber();
    ejercicio.biggerSalary();

    //Bucles anidados.
    ejercicio.multiplicationTables();
    ejercicio.replaceNumber3();

    //Vectores.
    ejercicio.numbersCounters();
    ejercicio.bubbleSort();
    ejercicio.orderNumber();


}