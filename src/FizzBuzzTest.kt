import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class FizzBuzzTest {
    lateinit private var fizzBuzz: FizzBuzz

    @BeforeEach
    internal fun setUp() {
        fizzBuzz = FizzBuzz()
    }

    @Test
    fun shouldReturnTheNumberWhenNotMultipleOfThreeOrFive() {
        assertEquals("1", fizzBuzz.evaluate(1))
    }

    @Test
    internal fun shouldReturnFizzWhenTheNumberIsMultipleOfThree() {
        assertEquals("Fizz", fizzBuzz.evaluate(3))
    }

    @Test
    internal fun shouldReturnBuzzWhenTheNumberIsMultipleOfFive() {
        assertEquals("Buzz", fizzBuzz.evaluate(5))
    }

    @Test
    internal fun shouldReturnFizzBuzzWhenMultipleOfThreeAndFive() {
        assertEquals("FizzBuzz", fizzBuzz.evaluate(15))
    }
}