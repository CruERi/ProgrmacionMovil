fun main () {
    val numbers = listOf("one", "two", "three", "four", "five")
    println(numbers)
    println("Número de elementos: ${numbers.size}")
    println("Segundo elemento: ${numbers.get(1)}")
    println("Cuarto elemento: ${numbers.get(3)}")
    println("Último elemento: ${numbers.get(numbers.size - 1)}")
    println("Index del elemento \"four\": ${numbers.indexOf("four")}")


    val list = mutableListOf(1, 2, 3, 4)

    list.add(5)

    list.removeAt(1)
    
    list[0] = 0
    println(list)
}