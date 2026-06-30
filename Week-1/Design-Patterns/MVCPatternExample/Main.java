// package Week-1.Design-Patterns.MVCPatternExample;

public class Main {

    public static void main(String[] args) {

        // Create Model
        Student student = new Student("Maria", 101, "A");

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller =
                new StudentController(student, view);

        System.out.println("Initial Student Details:");
        controller.updateView();

        System.out.println();

        // Update Student Details
        controller.setStudentName("Tejaswi");
        controller.setStudentGrade("A+");

        System.out.println("Updated Student Details:");
        controller.updateView();

    }

}