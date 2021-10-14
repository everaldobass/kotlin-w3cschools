package fundamentos

fun main() {
    //Matrizes Para criar uma matriz, use a arrayOf()função e coloque os valores em uma lista separada por vírgulas dentro dela:
    val carros = arrayOf("Audi", "Ferrari", "BMW")
    // Você pode acessar um elemento da matriz referindo-se ao número do índice , entre colchetes .
    println("Carro:" + carros[0])

    // ara alterar o valor de um elemento específico, consulte o número do índice:
    val carro1 = arrayOf("Audi", "Ferrari", "BMW")
    carro1[2] = "Posh"
    println("Carro:" + carro1[2])

    // Para descobrir quantos elementos uma matriz possui, use a size propriedade:
    val carro2 = arrayOf("Audi", "Ferrari", "BMW")
    println("Carro:" + carro2.size)

    // Você pode usar o inoperador para verificar se um elemento existe em uma matriz:
    val carro3 = arrayOf("Audi", "Ferrari", "BMW")
    if ("Audi" in carro3){
        println("Carro Existe ")
    }else{
        println("Carro não Existe ")
    }

    // Você pode percorrer os elementos do array com o for loop, sobre o qual aprenderá ainda mais no próximo capítulo.
    val lista = arrayOf("Arroz", "Feijão", "Carnes", "Legumes", "Frutas")
    for (x in lista ){
        println("Alimento ${x}")
    }





}