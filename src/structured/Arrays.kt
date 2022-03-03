package structured

fun main(args: Array<String>) {
    var names= arrayOf("King","Tom","Purity","Ian","Jasmine")
    for (name in names){
        println(name)
    }
    println(names[2])
    if ("Tom" in names){
        println("Tom is here")
    }
}