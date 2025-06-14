package com.lljjssjjll.actor

import com.lljjssjjll.model.Drink
import com.lljjssjjll.model.Order

class Cashier(private val name: String, private val barista: Barista) {

    private val entireMenuItems = listOf("아메리카노", "라떼", "모카")

    private val orderDraft = mutableListOf<String>()

    // 주문 받기
    fun receiveMenu(menu: String) {
        if (menu !in entireMenuItems) {
            println("캐시어($name): ${menu}는 없습니다.")
            return
        }

        orderDraft.add(menu)
        println("캐시어($name): ${menu}를 추가했습니다.")
    }

    // 받은 주문으로 주문서 생성하기
    fun createOrder(customer: Customer) {
        if (orderDraft.isEmpty()) {
            println("캐시어($name): 주문 내역이 없습니다.")
            return
        }

        val order = Order(orderDraft.toList())
        println("캐시어($name): ${customer}님의 주문이 확정되었습니다. → [${order.menuItems.joinToString(", ")}]")

        println("캐시어($name): 바리스타에게 주문을 전달합니다.")
        val drinks = barista.makeDrinks(order)
        deliverDrinks(drinks, customer)

        orderDraft.clear()
    }

    private fun deliverDrinks(drinks: Set<Drink>, customer: Customer) {
        println("캐시어($name): ${customer}님, [${drinks.joinToString(", ") { it.name }}] 나왔습니다.")
    }
}
