# kotlin-w3cschools
- Sintaxe Kotlin
- A funpalavra-chave é usada para declarar uma função. Uma função é um bloco de código projetado para realizar uma tarefa específica. No exemplo acima, ele declara a main()função.

- A main()função é algo que você verá em todos os programas Kotlin. Esta função é usada para executar código. Qualquer código dentro das main()chaves da função {}será executado .
- Por exemplo, a println()função está dentro da main()função, o que significa que ela será executada. A println()função é usada para produzir / imprimir texto e, em nosso exemplo, produzirá "Hello World".
- 
### Saída Kotlin (impressão)
- A println()função é usada para emitir valores / imprimir texto:
- A função print () - Também existe uma print()função semelhante a println(). A única diferença é que não insere uma nova linha no final da saída:

#### Comentários de linha única
- Comentários de linha única começam com duas barras ( //).
- Qualquer texto entre //e o final da linha é ignorado pelo Kotlin (não será executado).
- Este exemplo usa um comentário de uma única linha antes de uma linha de código:

#### Comentários multilinhas
- Comentários multilinhas começam com /*e terminam com */.
- Qualquer texto entre /*e */será ignorado por Kotlin.
- Este exemplo usa um comentário de várias linhas (um bloco de comentário) para explicar o código:

### Variáveis
- Variáveis são contêineres para armazenar valores de dados.
- Para criar uma variável, use varou vale atribua um valor a ela com o sinal de igual ( =):

#### Tipo de Variável
- Para criar uma variável, use varou vale atribua um valor a ela com o sinal de igual ( =):
- A diferença entre vare valé que as variáveis declaradas com a varpalavra - chave podem ser alteradas / modificadas , enquanto as valvariáveis não .
- Quando você cria uma variável com a valpalavra - chave, o valor não pode ser alterado / reatribuído.

###  Tipos de dados Kotlin
- Em Kotlin, o tipo de uma variável é decidido por seu valor:
- Inteiro
- Short
- Long
- Float
- Double
- Boolean
- Cientifico
- Char
- String

### Operadores Kotlin
- Operadores aritméticos
- Operadores de atribuição
- Operadores de comparação
- Operadores lógicos

### Kotlin Strings
- Strings são usadas para armazenar texto.
- Uma string contém uma coleção de caracteres entre aspas duplas:

### Booleanos Kotlin
- Um tipo booleano pode ser declarado com a Boolean palavra - chave e pode assumir apenas os valores true ou false:

### Condições de Kotlin e If..Else
- Use if para especificar um bloco de código a ser executado se uma condição for true.
- Use else para especificar um bloco de código a ser executado se a condição for false.
- Use else if para especificar uma nova condição se a primeira condição for false.

### Kotlin quando - When
- A when expressão é semelhante à switchinstrução em Java.
- Em vez de escrever muitas if..elseexpressões, você pode usar a when expressão, que é muito mais fácil de ler.
- É usado para selecionar um dos muitos blocos de código a serem executados:

### Kotlin While Loop
- Os loops podem executar um bloco de código, desde que uma condição especificada seja alcançada.
- Os loops são úteis porque economizam tempo, reduzem os erros e tornam o código mais legível.
- O while loop percorre um bloco de código, desde que uma condição especificada seja true:
- 
### Kotlin Break
- A breakinstrução é usada para pular de um loop .
- Este exemplo sai do loop quando i é igual a 4:
### Kotlin Continue
- A continueinstrução interrompe uma iteração (no loop), se uma condição especificada ocorrer, e continua com a próxima iteração no loop.

### Matrizes Kotlin
- Os arrays são usados para armazenar vários valores em uma única variável, em vez de criar variáveis separadas para cada valor.
- Para criar uma matriz, use a arrayOf()função e coloque os valores em uma lista separada por vírgulas dentro dela:
- Você pode acessar um elemento da matriz referindo-se ao número do índice , entre colchetes .
- Para alterar o valor de um elemento específico, consulte o número do índice:
- Para descobrir quantos elementos uma matriz possui, use a sizepropriedade:
- Você pode usar o inoperador para verificar se um elemento existe em uma matriz:
- Você pode percorrer os elementos do array com o for loop, sobre o qual aprenderá ainda mais no próximo capítulo.

### Kotlin For Loop
- Freqüentemente, ao trabalhar com matrizes, é necessário percorrer todos os elementos.
- Para percorrer os elementos da matriz, use o for loop junto com o inoperador:

### Cordilheiras Kotlin
- Com o forloop , você também pode criar intervalos de valores com " ..":

### Funções Kotlin
- Uma função é um bloco de código que só é executado quando é chamado.
- Você pode passar dados, conhecidos como parâmetros, para uma função.
- As funções são usadas para executar certas ações e também são conhecidas como métodos .
- Para criar sua própria função, use a funpalavra - chave e escreva o nome da função, seguido por parênteses () :
- Parâmetros Múltiplos
- Para retornar um valor, use a returnpalavra - chave e especifique o tipo de retorno após os parênteses da função ( Intneste exemplo):


