package com.lljjssjjll.actor

import com.lljjssjjll.model.Drink
import com.lljjssjjll.model.Order

class Barista(private val name: String) {

    // 음료 제조
    fun makeDrinks(order: Order): Set<Drink> {
        println("바리스타($name): [$order] 제조 중...")
        return order.menuItems.map { Drink(it) }.toSet()
    }
}