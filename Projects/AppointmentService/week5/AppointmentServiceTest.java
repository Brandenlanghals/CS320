package week5;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import java.util.Date;
public class AppointmentServiceTest {
    Date presentDate = new Date();

    //Add appointment test
    @Test
    public void testAddAppointment() {
        AppointmentService cs = new AppointmentService();
        Appointment a1 = new Appointment("Test1", presentDate, "Dentist");
        Appointment a2 = new Appointment("Test2", presentDate, "Primary Care");
        Appointment a3 = new Appointment("Test3", presentDate, "Nurse Visit");
        assertEquals(true, cs.add(a1));
        assertEquals(true, cs.add(a2));
        assertEquals(true, cs.add(a3));
    }

    // Add appointment with false assertions
    @Test
    public void testAddAppointmentFail() {
        AppointmentService cs = new AppointmentService();
        Appointment a1 = new Appointment("Test1", presentDate, "Dentist");
        Appointment a2 = new Appointment("Test2", presentDate, "Primary Care");
        Appointment a3 = new Appointment("Test3", presentDate, "Nurse Visit");
        assertEquals(true, cs.add(a1));
        assertEquals(false, cs.add(a1));
        assertEquals(true, cs.add(a3));
        assertEquals(true, cs.add(a2));
    }

    // Delete Appointments test
    @Test
    public void testDeleteAppointment() {
        AppointmentService cs = new AppointmentService();
        Appointment a1 = new Appointment("Test1", presentDate, "Dentist");
        Appointment a2 = new Appointment("Test2", presentDate, "Primary Care");
        Appointment a3 = new Appointment("Test3", presentDate, "Nurse Visit");
        assertEquals(true, cs.add(a1));
        assertEquals(true, cs.add(a2));
        assertEquals(true, cs.add(a3));
        assertEquals(true, cs.remove("Test1"));

    }
}
