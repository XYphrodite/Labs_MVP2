//5. Даны натуральные числа a и b. Найти их наименьшее общее кратное.
// Определить функцию для расчета наибольшего общего делителя двух натуральных чисел,
// используя алгоритм Евклида;

fun evclid(a: Int, b: Int): Int {
    if (a > b) {
        return evclid(a - b, b)
    } else if (a < b) {
        return evclid(a, b - a)
    } else return a
}

fun findLCM(a: Int, b: Int): Int {
    var arr_a = emptyArray<Int>()
    var arr_b = emptyArray<Int>()
    var a_w: Int = a
    var b_w: Int = b
    var d: Int = 2
    while (a_w != 1) {
        if (a_w.mod(d) == 0) {
            a_w = a_w.div(d)
            arr_a += d
            d = 1
        }
        d++
    }
    d = 2
    while (b_w != 1) {
        if (b_w.mod(d) == 0) {
            b_w = b_w.div(d)
            arr_b += d
            d = 1
        }
        d++
    }
    var res: Int = a * b / evclid(a, b)
    return res
}

fun main() {
    print("Введите натуральное число a\t")
    var a: Int = readLine()!!.toInt()
    print("Введите натуральное число b\t")
    var b: Int = readLine()!!.toInt()
    var e: Int = evclid(a, b)
    var lcm: Int = findLCM(a, b)

    print("Их НОК $lcm\n")
    print("Их НОД $e")
}