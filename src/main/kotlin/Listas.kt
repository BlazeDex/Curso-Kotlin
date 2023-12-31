fun main() {
    val lista1: List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");

    println("Imprimir la lista completa");
    println(lista1);
    println("Imprimir el primero elemento de la lista.");
    println(lista1[0]);
    println("Imprimir el primero elemento de la lista.");
    println(lista1.first());
    println("Imprimir el último elemento de la lista.");
    println(lista1.last())
    println("Imprimir el primero elemento de la lista.");
    println(lista1[lista1.size-1]);
    println("Imprimir el tamaño de la lista.");
    println(lista1.size);
    println("Imprimir un elemento específico de la lista.");
    println(lista1.get(3));
    println("Recorrer la lista completa.");
    for(element in lista1) {
        println(element);
    }
    println("Imprimir el elemento y su posición.");
    for(pos in lista1.indices){
        println(pos);
    }
    println("Filtrar elementos específicos.");
    val a= lista1.filter { it == "Lunes" || it == "Jueves" };
    println(a);

    // LISTAS MUTABLES
    println("Listas mutables");
    var mutableList: MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");
    println(mutableList);
    mutableList.add("Dominguito");
    println(mutableList);

    /*
        mutableList.none --> Devuelve true si está vacía la lista.
        .firstOrNull --> Devuelve el primer valor, si existe, si no null.
        .elementAtOrNull(2) --> Devuelve el elemento indicado, si no null.
        .lastOrNull --> Devuelve el último valor, si no null.
    */

    println("Ejercicio de prueba")
    var edades: MutableList<Int> = mutableListOf(18, 19, 20, 21, 22);
    println(edades);
    println(edades[0]);
    println(edades.average());
    edades.add(23);
    println(edades);
    edades.add(1, 24);
    println(edades);
    edades.removeAt(3);
    println(edades);

    val cantidad = edades.count{it >= 21};
    println(cantidad);
    edades.removeAll {it > 20};
    println(edades);


    println("Ejercicio de clase 2");
    var list2 : MutableList<Int> = mutableListOf(2, 4, 1, 5, 2, 4, 6, 1, 3, 4, 3, 1, 1, 3, 2, 6, 2, 2, 3, 5);
    val cantidad1 = list2.count{it == 1};
    println(cantidad1);
    list2.removeAll { it == 6 };
    println(list2);
}