fun main () {
    val idade = 27

    when {
        idade < 13 -> println ("Criança")
        idade in 13 .. 17  -> println ("Adolescente")
        idade >= 18 -> println ("Adulto")
    }
}