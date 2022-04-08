//4. Даны два натуральных числа.
// Выяснить, является ли хоть одно из них палиндромом ("перевертышем"),
// т.е. таким числом, десятичная запись которого читается одинаково
// слева направо и справа налево. Определить функцию,
// позволяющую распознавать числа-палиндромы;

fun isPalindrom(a: Int): Boolean {
    var length: Int = 0
    var a_s: Int = a
    while (a_s != 0) {
        a_s /= 10
        length++
    }
    var reverse: Int = 0
    a_s = a
    while (length != 0) {
        reverse = (reverse * 10 + a_s.mod(10))
        a_s = a_s.div(10)
        length--
    }
    if (reverse == a) {
        return true
    } else {
        return false
    }
}

fun main() {
    print("Введите первое натуральное число\t")
    var a: Int = readLine()!!.toInt()
    print("Введите второе натуральное число\t")
    var b: Int = readLine()!!.toInt()
    if ((isPalindrom(a)) || (isPalindrom(b))) {
        print("Как минимум одно число является палиндромом")
    } else {
        print("Ни одно число не является палиндромом")
    }
}