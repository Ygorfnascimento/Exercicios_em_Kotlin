fun main() {

    print("Digite o valor de início: ")
    val inicio = readLine()!!.toInt()

    print("Digite o valor de fim: ")
    val fim = readLine()!!.toInt()

    if (inicio <= fim) {

        println("Contagem de $inicio a $fim:")
        for (i in inicio..fim) {
            println(i)
        }
    } else {
        println("O valor de início não pode ser maior que o valor de fim.")
    }
}