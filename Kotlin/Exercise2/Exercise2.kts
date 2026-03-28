fun describeStatus(code: Int): String {
    return when (code) {
        in 200..299 -> "Success: The request was fulfilled."
        in 400..499 -> "Client Error: Check your URL or parameters."
        in 500..599 -> "Server Error: The Lehman Server is having trouble."
        else -> "Unknown status code."
    }
}

fun main() {
    println("201 -> ${describeStatus(201)}")
    println("404 -> ${describeStatus(404)}")
    println("503 -> ${describeStatus(503)}")
}