package com.gustavo.aluvery.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gustavo.aluvery.R.drawable.burger
import com.gustavo.aluvery.R.drawable.fries
import com.gustavo.aluvery.R.drawable.pizza
import com.gustavo.aluvery.model.Product
import java.math.BigDecimal

@Composable
fun ProductList() {
    Column {
        Text(
            text = "Promoções",
            Modifier.padding(
                start = 16.dp,
                end = 16.dp
            ),
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        Row(
            Modifier
                .padding(
                    top = 8.dp
                )
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Spacer(Modifier) //deixa um espaço nas extremidades porem sumindo com esse espaço quando usa o scroll
            ProductItem(
                Product(
                    name = "Hamburger",
                    price = BigDecimal("29.99"),
                    image = burger
                )
            )
            ProductItem(
                Product(
                    name = "Pizza",
                    price = BigDecimal("39.99"),
                    image = pizza
                )
            )
            ProductItem(
                Product(
                    name = "Batata frita",
                    price = BigDecimal("9.99"),
                    image = fries
                )
            )
            Spacer(Modifier) //deixa um espaço nas extremidades porem sumindo com esse espaço quando usa o scroll
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductListPreview() {
    ProductList()
}