fun sumTwoIntegers(a: Int, b: Int):Int {
    return a + b
}

fun sumThreeIntegers(a: Int, b: Int, c: Int) = a + b +c

fun max(a: Int, b: Int): Int = if (a > b) a else b
fun max2(a: Int, b: Int) = if (a > b) a else b

const val myString = "hello"
const val myInt = 123
var accountBalance = 12345.67


fun main(args: Array<String>) {
    println("Sum of 3 and 5 is ${sumTwoIntegers(3, 5)}")
    println("Sum of 1 + 2 + 3 is ${sumThreeIntegers(1,2,3)}")
    println("Max of 3 and 5 is ${max(3,5)}")
    println("Max of 4 and 2 is ${max2(4,2)}")
    println("My string is $myString")
    println("My int is $myInt")
    println("My accountBalance is $accountBalance")
    accountBalance = 2345.74
    println("My accountBalance is now $accountBalance")
}