fun routeRequest(path: String, user: String?): String {
    return when (path) {
        "/home" -> "Welcome to the Lehman Homepage, ${user ?: "Guest"}!"
        "/grades" -> {
            if (user == null) {
                "Error: Unauthorized access to grades."
            } else {
                "Loading grades for $user..."
            }
        }
        else -> "404: Path $path not found."
    }
}

fun main() {
    // Test the "/home" path
    println(routeRequest("/home", "Hendrix"))
    println(routeRequest("/home", null))

    // Test the "/grades" path
    println(routeRequest("/grades", "Hendrix"))
    println(routeRequest("/grades", null))

    // Test an unknown path
    println(routeRequest("/profile", "Hendrix"))
}