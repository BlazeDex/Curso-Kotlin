fun main() {
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
