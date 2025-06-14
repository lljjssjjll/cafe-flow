package com.lljjssjjll.model

data class Order(
    val menuItems: List<String>
) {

    override fun toString(): String {
        return menuItems.joinToString(", ")
    }
}