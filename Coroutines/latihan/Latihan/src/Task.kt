import kotlinx.coroutines.*

// TODO 1
fun sum(valueA: Int, valueB: Int): Int {
    suspend {
        delay(3000L)
    }
    return valueA + valueB
}

// TODO 2
fun multiple(valueA: Int, valueB: Int): Int {
    suspend {
        delay(2000L)
    }
    return valueA * valueB
}

fun main() = runBlocking {

    println("Counting...")

    val resultSum = async { sum(10, 10) }
    val resultMultiple = async { multiple(20, 20) }

    // TODO 3
    println("Result sum: ${resultSum.await()}")
    println("Result multiple: ${resultMultiple.await()}")
}