package pe.edu.ulima.smartretailai.model

data class Product(

    val name: String,

    val price: String,

    val category: String,

    val description: String,

    val similarProducts: List<String>

)