package com.gustavo.aluvery.sampledata

import com.gustavo.aluvery.R
import com.gustavo.aluvery.R.drawable
import com.gustavo.aluvery.R.drawable.placeholder
import com.gustavo.aluvery.R.drawable.ic_launcher_background
import com.gustavo.aluvery.R.drawable.burger
import com.gustavo.aluvery.R.drawable.fries
import com.gustavo.aluvery.R.drawable.pizza
import com.gustavo.aluvery.model.Product
import java.math.BigDecimal

val sampleProductsPromocoes = listOf(
    Product(
        name = "Hamburger",
        price = BigDecimal("29.99"),
        image = burger
    ),
    Product(
        name = "Pizza",
        price = BigDecimal("39.99"),
        image = pizza
    ),
    Product(
        name = "Batata frita",
        price = BigDecimal("9.99"),
        image = fries
    )
)

val sampleProductsDoces = listOf(
    Product(
        name = "Chocolate",
        price = BigDecimal("3.90"),
        image = placeholder
    ),
    Product(
        name = "Bala Fini",
        price = BigDecimal("7.99"),
        image = placeholder
    ),
    Product(
        name = "Torta de Morango",
        price = BigDecimal("12.89"),
        image = ic_launcher_background
    )
)

val sampleProductsBebidas = listOf(
    Product(
        name = "Coca 2L",
        price = BigDecimal("9.90"),
        image = placeholder
    ),
    Product(
        name = "Guaraná lata",
        price = BigDecimal("6.99"),
        image = placeholder
    )
)