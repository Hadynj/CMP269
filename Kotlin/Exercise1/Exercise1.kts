fun main() {
    val studentName: String = "YourName"
    val middleName: String? = null

    val displayMiddleName = middleName ?: "No Middle Name"

    println("Welcome, $studentName $displayMiddleName!")
}