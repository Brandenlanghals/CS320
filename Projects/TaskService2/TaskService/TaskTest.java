package TaskService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    // Baseline
    @Test
    void testTask() {
        Task task = new Task("12345", "Name", "Description");
        assertEquals("12345", task.gettaskID());
        assertEquals("Name", task.getname());
        assertEquals("Description", task.getdescription());
    }

    // Task ID is too long
    @Test
    void testTaskIdTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Task("1234567891011", "Name", "Description"));
    }

    // Task name is too long
    @Test
    void testNameTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Task("12345", "NameNameNameNameNameName", "Description"));
    }

    // Task Description is too long
    @Test
    void testDescriptionTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Task("12345", "Name", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
    }

    // TaskID is null
    @Test
    void testTaskIDIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Task(null, "Name", "Description"));
    }

    // Name is null
    @Test
    void testNameIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Task("12345", null, "Description"));
    }

    // Description is null
    @Test
    void testDescriptionIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Task("12345", "Name", null));
    }
}
