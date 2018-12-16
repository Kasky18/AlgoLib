import kotlin.system.measureTimeMillis

fun insertionSort(array: IntArray) {
    for ((index) in array.withIndex()) {
        var j = index

        while (j > 0) {
            // swap if smaller than sorted[j]
            if (array[j] < array[j - 1]) {
                val temp = array[j]
                array[j] = array[j - 1]
                array[j - 1] = temp

            }
            j--
        }

    }

}

fun main(args: Array<String>) {

    val array = intArrayOf(4, 3, 5, 9, 6, 7, 11, 2, 1, 15, 8, 9, 27, 32, 30, 55, 42, 40, 75, 82, 70, 120, 69, 77, 22,
            100, 102, 94, 99, 65, 54, 85, 18, 62, 35, 111, 180, 165, 68, 44, 73, 49, 104, 44, 63, 200, 91, 190, 126, 50)
    array.forEach { i -> println(i) }
    val executionTime = measureTimeMillis {

        insertionSort(array)

    }
    array.forEach { i -> println(i) }
    println("Execution Time = $executionTime ms")

}
