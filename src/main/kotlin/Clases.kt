class Persona(nombre:String, apellido:String, edad:Int) {
    var nombre:String = nombre;
    var apellido:String = apellido;
    var edad:Int = edad;

    constructor(nombre:String, apellido:String):this(nombre, apellido, 0);

    fun escribeTusDatos(){
        println("Mi nombre es $nombre $apellido y tengo la edad de $edad años");
    }
}

fun main() {
    //val example = Persona();
    /*persona.nombre = "Alan";
    persona.apellido = "Hernández";
    persona.edad = 21;*/

    val persona = Persona("Alan", "Hernández", 21);
    val persona2 = Persona("Fernando", "Arellano");

    println("${persona.nombre} ${persona.apellido} ${persona.edad}");
    println("${persona2.nombre} ${persona2.apellido} ${persona2.edad}");
    persona.escribeTusDatos();

}