package fundamentos

fun main() {
    //Break
    var i = 0
    while (i < 10){
        println("Valor de I ${i}")
        i++

        if (i == 8){
            break
        }
    }
}