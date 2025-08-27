fun main() {
    println("Digite o valor do depósito inicial: ")
    val depo = readln().toDouble()

    println("Digite a taxa de juros (em percentual): ")
    val juros = readln().toDouble() / 100

    println("Digite o número de meses: ")
    val meses = readln().toInt()

    var saldo = depo

    for (mes in 1..meses) {
        saldo += saldo * juros
        println(String.format("Mês %d: R$ %.2f", mes, saldo))
    }

    val ju = saldo - depo
    println("O seu juros ganho foi de: R$ %.2f".format(ju))
}