package com.gustavo.aluvery.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gustavo.aluvery.R
import com.gustavo.aluvery.components.ProductList
import com.gustavo.aluvery.model.Product
import com.gustavo.aluvery.sampledata.sampleProductsBebidas
import com.gustavo.aluvery.sampledata.sampleProductsDoces
import com.gustavo.aluvery.sampledata.sampleProductsPromocoes
import java.math.BigDecimal

@Composable
fun HomeScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(
                rememberScrollState()
            ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(Modifier)
        ProductList(title = "Promoções", products = sampleProductsPromocoes)
        ProductList(title = "Doces", products = sampleProductsDoces)
        ProductList(title = "Bebidas", products = sampleProductsBebidas)
        Spacer(Modifier)
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}