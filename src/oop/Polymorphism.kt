package oop

open class ClassOne{
    fun ugali(){
        println("I love ugalo")
    }
    fun  githeri(){
        println("I love githeri")
    }
}
open class ClassTwo:ClassOne(){

}
class ClassThree:ClassTwo(){

}

fun main(args: Array<String>) {
    var myObj=ClassThree()
    myObj.githeri()
}