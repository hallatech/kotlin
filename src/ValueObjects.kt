class Product (
    val id: String,
    val name: String) {

    val feelingLucky: Boolean
        get() = id.contains("222")

    val displayName: String
        get() = "${id}:${name[0].toUpperCase()}${name.substring(1)}"

}

class Category (
    val id: String,
    val products: Array<Product>)
