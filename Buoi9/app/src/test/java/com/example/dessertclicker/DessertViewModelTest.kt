package com.example.dessertclicker

import com.example.dessertclicker.ui.DessertViewModel
import org.junit.Assert.assertEquals
import org.junit.Test

class DessertViewModelTest {
    @Test fun initialState_isEmpty() {
        val state = DessertViewModel().dessertUiState.value
        assertEquals(0, state.dessertsSold)
        assertEquals(0, state.revenue)
        assertEquals(5, state.currentDessertPrice)
    }
    @Test fun fifthSale_changesDessert_withoutRepricingPreviousSales() {
        val vm = DessertViewModel()
        repeat(5) { vm.onDessertClicked() }
        assertEquals(5, vm.dessertUiState.value.dessertsSold)
        assertEquals(25, vm.dessertUiState.value.revenue)
        assertEquals(10, vm.dessertUiState.value.currentDessertPrice)
        assertEquals(1, vm.dessertUiState.value.currentDessertIndex)
    }
    @Test fun sixthSale_usesNewPrice() {
        val vm = DessertViewModel()
        repeat(6) { vm.onDessertClicked() }
        assertEquals(6, vm.dessertUiState.value.dessertsSold)
        assertEquals(35, vm.dessertUiState.value.revenue)
    }
}
