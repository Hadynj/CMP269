#Exercise 1: The "Lehman Course" 
#Class Goal: Practice basic class definition and the self keyword.

class LehmanCourse:
    def __init__(self, course_name, credits):
        self.course_name = course_name
        self.credits = credits
        self._student_count = 0  # protected variable

    def enroll_student(self):
        self._student_count += 1

    def display_info(self):
        print(f"Course: {self.course_name}, Credits: {self.credits}, 
        Enrolled Students: {self._student_count}")


# Exercise 1 test
course = LehmanCourse("CMP 269", 4)
course.enroll_student()
course.enroll_student()
course.display_info()



