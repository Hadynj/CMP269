data class Laptop(val brand: String, val ramGB: Int)

// Extension function for Int
fun Int.toLehmanGigabytes(): String {
    return "$this GB (Lehman Standard)"
}

fun main() {
    // Create two Laptop instances
    val laptop1 = Laptop("Dell", 16)
    val laptop2 = Laptop("Apple", 8)

    // Use the extension function
    println("${laptop1.brand} RAM: ${laptop1.ramGB.toLehmanGigabytes()}")
    println("${laptop2.brand} RAM: ${laptop2.ramGB.toLehmanGigabytes()}")
}