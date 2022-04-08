//6. Написать рекурсивную функцию вычисления суммы цифр натурального числа;

fun findSumOfDigits(x: Int): Int {
    if (x != 0) {
        var sum: Int = x.mod(10)
        return sum + findSumOfDigits(x.div(10))
    } else
        return 0
}

fun main() {
    print("Введите натуральное число\t")
    var x: Int = readLine()!!.toInt()
    print("Сумма цифр равна: ${findSumOfDigits(x)}")
}