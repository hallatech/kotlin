fun main(args: Array<String>) {
    val product1 = Product("prod1111","socks")
    val product2 = Product("prod2222","shoes")
    val category = Category("cat2222", arrayOf(product1, product2))

    println("Product1 ${product1}")
    println("Product1 id: ${product1.id}, name: ${product1.name}, " +
            "feelingLucky: ${product1.feelingLucky} displayName: ${product1.displayName}")
    println("Product1 id: ${product2.id}, name: ${product2.name}, " +
            "feelingLucky: ${product2.feelingLucky} displayName: ${product2.displayName}")

    println("Category: ${category}")

    println("Category ${category.id} contains products ${category.products}")
    println("Category ${category.id} contains products ${category.products.asList()}")
    println("Category ${category.id} contains products ${category.products.asList().joinToString { it.id }}")
}
