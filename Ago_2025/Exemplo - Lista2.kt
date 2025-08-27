fun main () {
    val frutas = listOf("Maça", "Banana", "Laranja")

    for ((indice, fruta) in frutas.withIndex()) {
        println ("Fruta $indice: $fruta")
    }
}