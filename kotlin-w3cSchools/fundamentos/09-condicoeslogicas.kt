package fundamentos

fun main() {
// if
    /*
    println("Informe o primeiro numero")
    val idade = readLine()

    if (idade != null) {
        if (idade > 18.toString()){
            println("Maior idade")
        }
    }
    */

    val time = 19

    if (time <= 12){
        println("Bom dia ${time} horas")
    } else if(time <= 18){
        println("Boa tarde ${time} horas")

    }else{
        println("Boa Noite ${time} horas")
    }


}