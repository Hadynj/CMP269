data class WebResponse(
    val statusCode: Int,
    val statusMessage: String,
    val body: String?
)

fun main() {
    // Success response
    val successResponse = WebResponse(
        statusCode = 200,
        statusMessage = "OK",
        body = """{"message": "Request successful"}"""
    )

    // Not Found response
    val notFoundResponse = WebResponse(
        statusCode = 404,
        statusMessage = "Not Found",
        body = null
    )

    // Print responses
    println(successResponse)
    println(notFoundResponse)
}