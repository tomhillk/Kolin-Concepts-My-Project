package oop

import java.util.*

open class AuthClass(open var email:String,open var password:String) {
var status="User"
    fun login(){
        val tafuta= Scanner(System.`in`)
        println("Enter Email")
        email= tafuta.nextLine()
        println("Enter Password")
        password= tafuta.next()

        if (email.equals("tom@gmail.com")&& password.equals("tom123")){
            val tafuta= Scanner(System.`in`)
            println("Enter height: ")
            val height = tafuta.nextDouble()
            println("Enter weight: ")
            val weight = tafuta.nextDouble()

            var bmiresults=BmiCalc(weight,height)
            println(bmiresults.result)

        }else{
            println("Wrong username or password")
        }
    }
    fun register(){
        val tafuta= Scanner(System.`in`)
        println("Enter Email")
        email= tafuta.nextLine()
        println("Enter Password")
        password= tafuta.next()
        if(password.length < 5){
            println("Password must be more than 5 characters")

    }else{
            val tafuta= Scanner(System.`in`)
            println("Enter height: ")
            val height = tafuta.nextDouble()
            println("Enter weight: ")
            val weight = tafuta.nextDouble()

            var bmiresults=BmiCalc(weight,height)
            println(bmiresults.result)

        }



    }
}
class BmiCalc(weight:Double,height:Double){
    var result=weight/(height*height)

}

fun main(args: Array<String>) {
    var userOne=AuthClass("","")
    userOne.register()
}



