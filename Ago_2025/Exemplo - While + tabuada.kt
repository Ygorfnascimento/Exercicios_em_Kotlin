fun main() {
    while (true) {
        println("Escolha uma opção:")
        println("1 - Adição")
        println("2 - Subtração")
        println("3 - Multiplicação")
        println("4 - Divisão")
        println("5 - Sair")

        when (readLine()?.toIntOrNull()) {
            1 -> mostrarTabuada("+")
            2 -> mostrarTabuada("-")
            3 -> mostrarTabuada("*")
            4 -> mostrarTabuada("/")
            5 -> return
            else -> println("Opção inválida")
        }
    }
}

fun mostrarTabuada(operacao: String) {
    print("Digite um número: ")
    val numero = readLine()?.toIntOrNull() ?: return

    for (i in 1..10) {
        val resultado = when (operacao) {
            "+" -> numero + i
            "-" -> numero - i
            "*" -> numero * i
            "/" -> numero / i.toDouble()
            else -> 0.0
        }
        println("$numero $operacao $i = $resultado")
    }
}