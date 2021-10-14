package fundamentos

fun main() {
     //Continue
    var i = 0
    while (i <= 10){
        if(i == 5){
            i++

            continue
        }
        println("Valor de I ${i}")
        i++
    }
}