fun sumDigits(number: Int): Int {
    var sum = 0
    val digits = number.toString()
    for (digit in digits) {
        sum += digit.toString().toInt()
    }
    return sum
}

fun sortArrayBySum(array: IntArray): IntArray {
    return array.sortedBy { sumDigits(it) }.toIntArray()
}

fun printArrayWithSum(array: IntArray) {
    val sortedArray = sortArrayBySum(array)
    println("Исходный массив: ${array.contentToString()}")
    println("Отсортированный массив: ${sortedArray.contentToString()}")
    println("Сумма цифр каждого числа отсортированного массива:")
    for (number in sortedArray) {
        println("$number: ${sumDigits(number)}")
    }
}

fun invertString(input: String): String {
    val words = input.split(" ")
    return words.reversed().joinToString(" ")
}

fun calculateSum(startValue: Int, numberOfTerms: Int): Int {
    var sum = startValue
    for (i in 1..numberOfTerms) {
        sum += 10
    }
    return sum
}

fun generatePassword(): String {
    val passwordLength = (8..15).random()
    val password = StringBuilder()
    val allowedCharacters = ('0'..'9') + ('A'..'Z') + ('a'..'z')
    repeat(passwordLength) {
        val randomIndex = (0 until allowedCharacters.size).random()
        password.append(allowedCharacters[randomIndex])
    }
    return password.toString()
}

fun swapCase(input: String): String {
    val swappedChars = input.map { char ->
        if (char.isLowerCase()) {
            char.toUpperCase()
        } else {
            char.toLowerCase()
        }
    }
    return swappedChars.joinToString("")
}

fun main() {

    // 1
    val array = intArrayOf(14, 30, 103)
    printArrayWithSum(array)

    // 2
    val input = "Привет мир"
    val invertedString = invertString(input)
    println(invertedString)

    // 3
    val sum1 = calculateSum(10, 4)
    val sum2 = calculateSum(100, 5)
    println(sum1)
    println(sum2)

    // 4
    repeat(3) {
        val password = generatePassword()
        println(password)
    }

    // 5
    val strings = listOf("Привет Мир", "Hello World", "Программирование", "Programming", "Котлин")
    for (string in strings) {
        val swappedString = swapCase(string)
        println(swappedString)
    }
}
