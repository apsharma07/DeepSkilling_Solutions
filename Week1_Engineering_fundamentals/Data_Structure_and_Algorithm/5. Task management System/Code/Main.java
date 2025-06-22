public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Add tasks
        taskList.addTask(new Task(1, "Design database", "Pending"));
        taskList.addTask(new Task(2, "Develop API", "In Progress"));
        taskList.addTask(new Task(3, "Test modules", "Pending"));

        // Display all tasks
        taskList.displayAllTasks();

        // Search a task
        taskList.searchTask(2);

        // Delete a task
        taskList.deleteTask(1);

        // Final task list
        taskList.displayAllTasks();
    }
}
