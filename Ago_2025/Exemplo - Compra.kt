fun main() {
    println("Qual é o valor da compra da sua casa?")
    val casa = readln().toDouble()

    println("Qual é o seu salário?")
    val salario = readln().toDouble()

    println("Quantos anos você tem para pagar?")
    val anos = readln().toInt()

    val prestacao = casa / (anos * 12)

    if (prestacao > 0.3 * salario) {
        println("O valor da sua prestação é maior do que 30% do seu salário.")
    } else {
        println("O valor da prestação mensal é: " + prestacao.toInt())
    }
}