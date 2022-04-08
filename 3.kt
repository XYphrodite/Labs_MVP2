//3. Даны натуральное число n и целые числа a1, a2, ... , an.
// Найти количество чисел ai (i = 1, 2, ..., n), являющихся степенями пятерки.
// Определить функцию, позволяющую распознавать степени пятерки;

fun isExtentOfFive(x: Int): Boolean {
    var a: Int = 0
    var t: Int
    while (true) {
        t = Math.pow(5.0, a.toDouble()).toInt()
        if (x == t) {
            return true
        } else if (t > x) {
            return false
        }
        a++
    }
}

fun main() {
    print("Введите натуральное число n:\t")
    var n: Int = readLine()!!.toInt()
    var arr = emptyArray<Int>()
    var a: Int = 0
    var amount: Int = 0
    while (n != a) {
        print("Введите целое число a${a + 1}:\t")
        arr += readLine()!!.toInt()
        a++
    }
    while (a!=0){
        if (isExtentOfFive(arr[a-1])){
            amount++
        }
        a--
    }
    print("${amount} числа")

}