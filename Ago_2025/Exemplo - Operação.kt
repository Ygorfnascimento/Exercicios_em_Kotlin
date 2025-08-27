fun main() {
    print("Digite o primeiro número: ")
    val num1 = readln().toInt()

    print("Digite o segundo número: ")
    val num2 = readln().toInt()

    print("Qual operação você deseja realizar? (+, -, *, /): ")
    val operacao = readln()

    when (operacao) {
        "+" -> println("Resultado: ${num1 + num2}")
        "-" -> println("Resultado: ${num1 - num2}")
        "*" -> println("Resultado: ${num1 * num2}")
        "/" -> {
            if (num2 != 0) {
                println("Resultado: ${num1 / num2}")
            } else {
                println("Erro: divisão por zero não permitida.")
            }
        }
        else -> println("Operação inválida!")
    }
}