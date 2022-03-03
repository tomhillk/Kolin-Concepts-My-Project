package structured

fun main(args: Array<String>) {
    //WHILE LOOP
    var x = 0
    while (x <= 5) {
        println(x)
        x++
    }
    //DO WHILE LOOP
    var y = 10
    do {
        println(y)
        y++
    } while (y <= 15)
    //FOR WHILE LOOP
    var numbers = 20..25
    for (number in numbers) {
        println(number)
    }
    var num = 25 downTo 20
    for (number in num) {
        repeat(5) {
            println(number)
        }

        //REPEAT LOOP repeat(5){
        repeat(5) {
            println("Good morning")
        }
    }
}