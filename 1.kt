//1. Определить значение z = min(a, 3b) * min(2a-b, 2b), где min(x, y) – минимальное из чисел x, y.
// Значения a и b вводятся с клавиатуры. Задачу решить, определив и использовав функцию min;

fun min(x: Double, y: Double): Double {
    return if (x >= y)
        y
    else
        x
}

fun foo(a: Double, b: Double): Double {
    return min(a, 3 * b) * min(2 * a - b, 2 * b)
}

fun main() {
    print("Введите значение a:\t")
    var a: Double = readLine()!!.toDouble()
    print("Введите значение b:\t")
    var b: Double = readLine()!!.toDouble()
    var z: Double = foo(a, b)
    println("Значение z = min(a, 3b) * min(2a-b, 2b) = $z")
}