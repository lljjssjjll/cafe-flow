package com.lljjssjjll.actor

class Customer(private val name: String) {

    // 메뉴 말하기 (고르기)
    fun sayMenu(menuItem: String, cashier: Cashier) {
        println("고객($name): $menuItem 하나 추가해주세요.")

        cashier.receiveMenu(menuItem)
    }

    // 메뉴 확정하기
    fun confirmMenu(cashier: Cashier) {
        cashier.createOrder(this)
    }

    override fun toString() = name
}
