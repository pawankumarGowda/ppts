package Model

import java.math.BigDecimal

data class Money (val amount:Int , val currency:String)

fun main(args: Array<String>) {
    val tickets = Money(100, "$")
    val popcorn = tickets.copy(200,"EU")

    if (tickets != popcorn){
        System.out.println("No equle")
    }

    val javamoney = JavaMoney(200,"$")
    javamoney.amount = 100
    val am = javamoney.amount

    fun sum (x:Int, y:Int) = x + y

    //val bd1 = 100.bd
}
