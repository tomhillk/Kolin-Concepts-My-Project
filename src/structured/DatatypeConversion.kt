package structured

fun main(args: Array<String>) {
    var a:String
    var b:String
    var c:Int
    var d:Double
    var total:Double

    a="100"
    b="200"
    println(a+b)
    c=a.toInt()
    d=b.toDouble()
    println(c+d)
    println(a.toInt()+b.toDouble())
    total=c+d
    println("Your total is $total ")
    println("%.4f".format(total))

}