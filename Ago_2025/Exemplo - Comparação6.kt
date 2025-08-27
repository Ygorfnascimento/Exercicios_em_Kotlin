fun main() {
    print("Digite o primeiro número: ")
    val num1 = readln().toInt()

    print("Digite o segundo número: ")
    val num2 = readln().toInt()

    if (num1 == 100 || num2 == 100) {
        println("Um dos números é igual a 100.")
    } else if (num1 > 100 || num2 > 100) {
        println("Um dos números é maior do que 100.")
    } else {
        println("Nenhum número é igual ou maior do que 100.")
    }
}