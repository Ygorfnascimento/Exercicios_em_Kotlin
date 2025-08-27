fun main() {
    var soma = 0
    var contador = 0

    while (true) {
        println("Digite um número inteiro (ou 0 para parar): ")
        val num = readln().toInt()

        if (num == 0) {
            break
        }

        soma += num
        contador++
    }

    if (contador > 0) {
        val media = soma / contador
        println("Soma total dos números digitados: $soma")
        println("Média dos números digitados: $media")
    } else {
        println("Nenhum número foi digitado.")
    }
}