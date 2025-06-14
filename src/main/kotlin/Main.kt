package com.lljjssjjll

import com.lljjssjjll.actor.Barista
import com.lljjssjjll.actor.Cashier
import com.lljjssjjll.actor.Customer

fun main() {
    println("☕\uFE0F 카페 플로우 시작")

    val customer = Customer("조xx")
    val barista = Barista("이xx")
    val cashier = Cashier("박xx", barista)

    customer.sayMenu("아메리카노", cashier)
    customer.sayMenu("라떼", cashier)
    customer.sayMenu("모카", cashier)
    customer.sayMenu("카푸치노", cashier)

    customer.confirmMenu(cashier)
}
