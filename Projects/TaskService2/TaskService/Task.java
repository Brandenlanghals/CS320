package TaskService;

public class Task {
    // Variables
    private final String taskID;
    private String name;
    private String description;

    // Constructors with Task Class Requirements
    public Task(String taskID, String name, String description) {
        // Task ID is not Null and the length is less than 10 chars
        if (taskID == null || taskID.length() > 10) {
            throw new IllegalArgumentException("Invalid Task ID");
        }
        // Name is not Null and the length is less than 20 chars
        if (name == null || name.length() > 20) {
            throw new IllegalArgumentException("Invalid Name");
        }
        // Description is not Null and is less than 50 chars
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Invalid Description");
        }
        this.taskID = taskID;
        this.name = name;
        this.description = description;
    }
// Get and set
    public String gettaskID() {
        return taskID;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }
}

