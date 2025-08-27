fun main () {
    val idades = mapOf("Ana" to 25, "Bruno" to 30)

    idades.forEach { (nome, idade) ->
        println ("$nome tem $idade anos.")
    }
}