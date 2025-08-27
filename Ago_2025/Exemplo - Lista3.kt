fun main () {
    val numeros = listOf(10, 10, 30)

    numeros.withIndex().forEach { (i, valor) ->
        println ("Posição $i tem o valor $valor")
    }
}