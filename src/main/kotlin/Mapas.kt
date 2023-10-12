import java.util.*
fun main() {
    // MAPAS
    println("--------------- MAPAS -------------------");
    val prefijos:Map<Int, String> = mapOf(34 to "España", 1 to "USA", 52 to "México");
    for((key, value) in prefijos) {
        println("$key es el código del pais $value");
    }
    println(prefijos.get(52)); //México
    println(prefijos[1]);      // USA

    println("--------------- MAPAS MUTABLES -------------------");
    val monedas:MutableMap<String, String> = mutableMapOf("Euro" to "España", "Dolar" to "USA", "Libra esterlina" to "UK");
    println("Paises ${monedas.values}");
    println("Monedas ${monedas.keys}");

    monedas.put("cedi", "Ghana");
    println("Paises ${monedas.values}");
    println("Monedas ${monedas.keys}");

    monedas.remove("cedi");
    println("Paises ${monedas.values}");
    println("Monedas ${monedas.keys}");

    monedas.clear();
    println("Paises ${monedas.values}");
    println("Monedas ${monedas.keys}");

    println("------- Ejercicio MAPS --------");
    var aliens = TreeMap<String,Int>()
    aliens["navin"]=543;
    aliens["Kishor"]=409;
    aliens["Kishor2"]=400;
    for((name, age) in aliens) {
        println("$name : $age");
    }

    val diccionario = mutableMapOf<String, Double>()

    // Agregar artículos al diccionario
    diccionario["Producto 1"] = 15.50
    diccionario["Producto 2"] = 25.50
    diccionario["Producto 3"] = 10.20
    diccionario["Producto 4"] = 30.25
    diccionario["Producto 5"] = 5.50

    println("Imprimir el diccionario completo");
    for ((nombre, precio) in diccionario) {
        println("$nombre - Precio: $precio")
    }
    println("Articulos con precio mayor a 20");
    val superior = diccionario.count { it.value > 20 }
    println(superior);




}