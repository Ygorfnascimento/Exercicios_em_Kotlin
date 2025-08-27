fun main () {

    print ("Digite o primeiro número: ")
    val num1 = readln().toInt()

    print ("Digite o segundo número: ")
    val num2 = readln().toInt()

    if (num1 > num2) {
        println ("O número $num1 é maior que o $num2.")
    } else println ("O número $num1 é menor que o $num2.")
}