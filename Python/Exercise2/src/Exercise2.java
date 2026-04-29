// CMP 269: Programming Methods III

// Exercise 1: base class
class Student {
    // defind fields
    protected String name;
    protected double gpa;
    protected boolean isActive;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
        this.isActive = true;
    }

    public String getStatus() {
        String status = isActive ? "Active" : "Inactive";
        return name + " is currently " + status + " with a " + gpa + " GPA.";
    }
}

// Exercise 2: Subclass
class GradStudent extends Student {
    // declare fields
    private String researchLab;

    public GradStudent(String name, double gpa, String researchLab) {
        super(name, gpa); // call parent constructor
        this.researchLab = researchLab;
    }


    @Override
    public String getStatus() {
        String baseStatus = super.getStatus();
        return baseStatus + " They research in the " + researchLab + " lab.";
    }
}

// Exercise 3: Polymorphism
// polymorphism
class Robot {
    public String getStatus() {
        return "BEEP BOOP. Robot systems nominal.";
    }
}

// Main class
public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("--- Exercise 1 & 2: Classes and Inheritance ---");

        Student student1 = new Student("John Doe", 2.8);
        GradStudent student2 = new GradStudent("Jane Smith", 4.0, "Cybersecurity");

        System.out.println(student1.getStatus());
        System.out.println(student2.getStatus());

        exercise3Polymorphism();
    }

    // Exercise 3: Polymorphism
    public static void exercise3Polymorphism() {
        System.out.println("\n--- Exercise 3: Polymorphism ---");

        Student undergrad = new Student("Alice", 3.5);
        GradStudent grad = new GradStudent("Bob", 3.9, "AI Data");
        Robot bot = new Robot();

        // Object[] mixed types
        Object[] entities = {undergrad, grad, bot};

        for (Object entity : entities) {
            if (entity instanceof Student) {
                System.out.println(((Student) entity).getStatus());
            } else if (entity instanceof Robot) {
                System.out.println(((Robot) entity).getStatus());
            }
        }
    }

}