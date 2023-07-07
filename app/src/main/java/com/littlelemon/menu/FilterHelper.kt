package com.littlelemon.menu
import org.junit.Test
import org.junit.Assert.assertEquals



class FilterHelper { // create a FilterHelperTest and write a unit test for filterProducts

    class FilterHelperTest {

        @Test
        fun filterProducts_filterTypeDessert_croissantReturned() {
            val sampleProductsList = mutableListOf(
                ProductItem(title = "Black tea", price = 3.00, category = "Drinks", image = R.drawable.black_tea),
                ProductItem(title = "Croissant", price = 7.00, category = "Dessert", image = R.drawable.croissant),
                ProductItem(title = "Bouillabaisse", price = 20.00, category = "Food", image = R.drawable.bouillabaisse)
            )

            val filterHelper = FilterHelper()
            val filteredList = filterHelper.filterProducts(FilterType.Dessert, sampleProductsList)

            assertEquals(1, filteredList.size)
            assertEquals("Croissant", filteredList[0].title)

        }
    }

    fun filterProducts(type: FilterType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            FilterType.All -> productsList
            FilterType.Dessert -> productsList.filter { it.category == "Dessert" } // only products with category equal to Dessert
            FilterType.Drinks -> productsList.filter { it.category == "Drinks" } // only products with category equal to Drinks
            FilterType.Food -> productsList.filter { it.category == "Food" } // only products with category equal to Food
        }
    }

}