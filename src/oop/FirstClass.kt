package oop

abstract class FirstClass(open var name:String,open var age:Int){
    abstract fun motto()
    abstract  fun mission()
}
class SecondClass(override var name: String,override var age: Int):FirstClass(name,age){
    override fun motto() {
        println("Education is the key to success")
    }

    override fun mission() {
        println("To educate the world")
    }
}
class ThirdClass(override var name: String,override var age: Int):FirstClass(name,age){
    override fun motto() {
        println("Education is a result of hard work")
    }

    override fun mission() {
        println("To nature the world through education")
    }
}

fun main(args: Array<String>) {
    var xyz= ThirdClass("King",100)
    xyz.motto()
}
//Create from Auth class, on register and login methods respectively
//validate any user's email and password. If the user has an email
//and password of your liking, calculate the BMI of the same user from a child class called Bmicalc
//ensure all credentials are provided by the user through a scanner