public class TaskLinkedList {
    private TaskNode head;

    // Add a task to the end of the list
    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Task added: " + task.taskName);
    }

    // Search for a task by ID
    public void searchTask(int taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.taskId == taskId) {
                System.out.println("Task found:");
                current.task.display();
                return;
            }
            current = current.next;
        }
        System.out.println("Task with ID " + taskId + " not found.");
    }

    // Traverse all tasks
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("\nTask List:");
        TaskNode current = head;
        while (current != null) {
            current.task.display();
            current = current.next;
        }
    }

    // Delete a task by ID
    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        // If head needs to be deleted
        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("Task with ID " + taskId + " deleted.");
            return;
        }

        TaskNode current = head;
        while (current.next != null && current.next.task.taskId != taskId) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Task with ID " + taskId + " not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Task with ID " + taskId + " deleted.");
        }
    }
}
