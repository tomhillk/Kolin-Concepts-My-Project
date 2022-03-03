package structured

import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    println("Enter Username")
    var username= sc.next()
    println("Enter Password")
    var password= sc.next()
    println("Enter height: ")
    val height = sc.nextDouble()
    println("Enter weight: ")
    val weight = sc.nextDouble()
    // nextDouble() reads the next double from the keyboard



fun credentials(username:String,password:String,weight:Double,height:Double) {
    if (username.equals("eMobilis") && password.equals("eMobilis@123")) {
        //calculate the bmi

    } else {
        println("Wrong login credentials")
    }
}

        var result=weight/(height*height)

        if (result<18){
            println("Underweight")
        }else if (result<25){
            println("Normal")
        } else if (result<30){
            println("Overweight")
        }else{
            println("Obese")
        }
    }




