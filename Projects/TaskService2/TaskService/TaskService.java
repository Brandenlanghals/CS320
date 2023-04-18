package TaskService;

import java.util.ArrayList;

public class TaskService {
    // List of Tasks
    private final ArrayList<Task> tasks;

    // Default Constructor
    public TaskService() {
        tasks = new ArrayList<>();
    }

    // Create Task
    public boolean add(Task task) {
        boolean existingTask = false;
        for (Task c : tasks)
            if (c.equals(task)) {
                existingTask = true;
                break;
            }
        if (!existingTask) {
            tasks.add(task);
            System.out.println("Task created successfully.");
            return true;
        } else {
            System.out.println("Task already created.");
            return false;
        }
    }

    // Delete Task
    public boolean remove(String taskID) {
        for (Task c : tasks) {
            if (c.gettaskID().equals(taskID)) {
                tasks.remove(c);
                System.out.println("Task deleted successfully.");
                return true;
            }
        }
        System.out.println("Task not found.");
        return false;
    }

    //Update Task
    public boolean update(String taskID, String name, String description) {
        for (Task c : tasks) {
            if (c.gettaskID().equals(taskID)) {
                if (!name.equals(""))
                    c.setname(name);
                if (!description.equals(""))
                    c.setdescription(description);
                System.out.println("Task updated");
                return true;
            }
        }
        System.out.println("Task not found.");
        return false;
    }

}