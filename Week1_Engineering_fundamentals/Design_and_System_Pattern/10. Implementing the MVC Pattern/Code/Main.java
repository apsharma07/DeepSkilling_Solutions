public class Main{
    public static void main(String[] args) {
        // Step 1: Create the model (student data)
        Student student = new Student("Ankit Kumar", "CSE2025", "A");

        // Step 2: Create the view (how to display data)
        StudentView view = new StudentView();

        // Step 3: Create controller (connect model and view)
        StudentController controller = new StudentController(student, view);

        // Step 4: Display initial data
        controller.updateView();

        // Step 5: Update some data using controller
        controller.setStudentName("Rahul Singh");
        controller.setStudentGrade("A+");

        // Step 6: Display updated data
        controller.updateView();
    }
}
