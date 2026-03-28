sealed class EnrollmentStatus {
    data class Success(val courseCode: String) : EnrollmentStatus()
    data class Error(val message: String) : EnrollmentStatus()
    object Loading : EnrollmentStatus()
}

fun printStatus(status: EnrollmentStatus) {
    when (status) {
        is EnrollmentStatus.Success -> {
            println("Enrolled successfully in ${status.courseCode}")
        }
        is EnrollmentStatus.Error -> {
            println("Enrollment failed: ${status.message}")
        }
        EnrollmentStatus.Loading -> {
            println("Enrollment is in progress...")
        }
    }
}

fun main() {
    val successStatus = EnrollmentStatus.Success("CMP 269")
    val errorStatus = EnrollmentStatus.Error("Course is full")

    printStatus(successStatus)
    printStatus(errorStatus)
}