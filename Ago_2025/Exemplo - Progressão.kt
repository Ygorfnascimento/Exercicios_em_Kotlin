fun main(){
    println("Digite o termo: ")
    var num1 = readln().toInt()

    println("Digite a razão: ")
    var ent = readln().toInt()

    while (num1 <= 20){
        println(num1)
        num1 += ent
    }
}