fun main() {
    println("Digite um número:")
    val numero = readLine()?.toIntOrNull() ?: return println("Número inválido")

    var divisores = 0
    for (i in 2..numero / 2) {
        if (numero % i == 0) {
            divisores++
        }
    }

    if (divisores == 0 && numero > 1) {
        println("É primo.")
    } else {
        println("Não é primo e é divisível $divisores vezes.")
    }
}