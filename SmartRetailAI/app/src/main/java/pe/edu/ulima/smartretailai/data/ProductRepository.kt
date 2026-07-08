package pe.edu.ulima.smartretailai.data

import pe.edu.ulima.smartretailai.model.Product

object ProductRepository {

    private val products = listOf(

        Product(
            name = "Coca Cola",
            price = "S/ 3.50",
            category = "Bebidas",
            description = "Bebida gaseosa sabor cola.",
            similarProducts = listOf(
                "Pepsi",
                "Inca Kola",
                "Fanta"
            )
        ),

        Product(
            name = "Agua San Luis",
            price = "S/ 2.00",
            category = "Agua",
            description = "Agua mineral sin gas.",
            similarProducts = listOf(
                "Cielo",
                "San Mateo",
                "Vida"
            )
        ),

        Product(
            name = "Doritos",
            price = "S/ 4.00",
            category = "Snacks",
            description = "Snack sabor queso.",
            similarProducts = listOf(
                "Lays",
                "Pringles",
                "Chizitos"
            )
        ),

        Product(
            name = "Pringles",
            price = "S/ 8.50",
            category = "Snacks",
            description = "Papas en tubo.",
            similarProducts = listOf(
                "Lays",
                "Doritos",
                "Ruffles"
            )
        ),

        Product(
            name = "Sublime",
            price = "S/ 2.50",
            category = "Chocolate",
            description = "Chocolate con maní.",
            similarProducts = listOf(
                "Triángulo",
                "Princesa",
                "Vizzio"
            )
        )

    )

    fun getProduct(name: String): Product? {

        return products.find {

            it.name.equals(name, ignoreCase = true)

        }

    }

}