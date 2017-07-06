class FizzBuzz {
    fun evaluate(number: Int): String = when {
        number isMultipleOf 3 && number isMultipleOf 5 -> "FizzBuzz"
        number isMultipleOf 5 -> "Buzz"
        number isMultipleOf 3 -> "Fizz"
        else -> number.toString()
    }

    infix fun Int.isMultipleOf(number: Int): Boolean = this % number == 0
}

fun main(args: Array<String>) {
    val fizzBuzz = FizzBuzz()
    (1..100).forEach { i -> println(fizzBuzz.evaluate(i)) }
}
