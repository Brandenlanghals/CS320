package TaskService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TaskServiceTest {
    // Test for adding Task with valid params
    @Test
    public void testAddTask() {
        TaskService cs = new TaskService();
        Task c1 = new Task("Task1", "Turn On Laptop", "Lorem ipsum dolor sit amet");
        Task c2 = new Task("Task2", "Catch Butterflies", "Lorem ipsum dolor sit amet");
        Task c3 = new Task("Task3", "Go Outside", "Take time for yourself and relax.");
        assertTrue(cs.add(c1));
        assertTrue(cs.add(c2));
        assertTrue(cs.add(c3));
    }

    // Test for adding a Task with false assertions
    @Test
    public void testAddTaskFail() {
        TaskService cs = new TaskService();
        Task c1 = new Task("Task1", "Turn On Laptop", "Lorem ipsum dolor sit amet");
        Task c2 = new Task("Task2", "Catch Butterflies", "Lorem ipsum dolor sit amet");
        Task c3 = new Task("Task3", "Go Outside", "Take time for yourself and relax.");
        assertTrue(cs.add(c1));
        assertFalse(cs.add(c1));
        assertTrue(cs.add(c3));
        assertTrue(cs.add(c2));
    }

    // Test for Deleting a Task with valid params
    @Test
    public void testDeleteTask() {
        TaskService cs = new TaskService();
        Task c1 = new Task("Task1", "Turn On Laptop", "Lorem ipsum dolor sit amet");
        Task c2 = new Task("Task2", "Catch Butterflies", "Lorem ipsum dolor sit amet");
        Task c3 = new Task("Task3", "Go Outside", "Take time for yourself and relax.");
        assertTrue(cs.add(c1));
        assertTrue(cs.add(c2));
        assertTrue(cs.add(c3));
        assertTrue(cs.remove("Task1"));
        assertTrue(cs.remove("Task2"));
    }

    // Test for Deleting a Task with false assertions
    @Test
    public void testDeleteTaskFail() {
        TaskService cs = new TaskService();
        Task c1 = new Task("Task1", "Turn On Laptop", "Lorem ipsum dolor sit amet");
        Task c2 = new Task("Task2", "Catch Butterflies", "Lorem ipsum dolor sit amet");
        Task c3 = new Task("Task3", "Go Outside", "Take time for yourself and relax.");
        assertTrue(cs.add(c1));
        assertTrue(cs.add(c3));
        assertTrue(cs.add(c2));
        assertFalse(cs.remove("Task4"));
        assertTrue(cs.remove("Task2"));
    }

    // Test for Updating Task with valid params
    @Test
    public void testUpdateTask() {
        TaskService cs = new TaskService();
        Task c1 = new Task("Task1", "Turn On Laptop", "Lorem ipsum dolor sit amet");
        Task c2 = new Task("Task2", "Catch Butterflies", "Lorem ipsum dolor sit amet");
        Task c3 = new Task("Task3", "Go Outside", "Take time for yourself and relax.");
        assertTrue(cs.add(c1));
        assertTrue(cs.add(c3));
        assertTrue(cs.add(c2));
        assertTrue(cs.update("Task1", "Turn On Laptop", "Lorem ipsum dolor sit amet"));
        assertTrue(cs.update("Task2", "Catch Butterflies", "CLorem ipsum dolor sit amet"));
    }

    /* Test to update Tasks, with false assertions */
    @Test
    public void testUpdateTaskFail() {
        TaskService cs = new TaskService();
        Task c1 = new Task("Task1", "Turn On Laptop", "Lorem ipsum dolor sit amet");
        Task c2 = new Task("Task2", "Catch Butterflies", "Lorem ipsum dolor sit amet");
        Task c3 = new Task("Task3", "Go Outside", "Lorem ipsum dolor sit amet");
        assertTrue(cs.add(c1));
        assertTrue(cs.add(c3));
        assertTrue(cs.add(c2));
        assertFalse(cs.update("Task4", "Fondue some cheddars", "Lorem ipsum dolor sit amet"));
        assertTrue(cs.update("Task3", "Go Outside", "Lorem ipsum dolor sit amet"));
    }
}