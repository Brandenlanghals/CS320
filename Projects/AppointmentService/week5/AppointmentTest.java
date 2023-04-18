package week5;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppointmentTest {
    private final Date presentDate = new Date(System.currentTimeMillis());

    @Test
    void testAppointment() {
        Appointment appt = new Appointment("12345", presentDate,
                "Description");
        assertEquals("12345", appt.getApptID());
        assertEquals(appt.getDate(), presentDate);
        assertEquals("Description", appt.getDescription());
    }

    @Test
    void testAppointmentIDTooLong() {
        /* Test for Appointment ID, too long */
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Appointment("1234511111111", presentDate, "Description"));
    }

    @Test
    void testAppointmentDescriptionTooLong() {
        /* Test for Description, too long */
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Appointment("12345", presentDate, "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."));
    }

    @Test
    void testAppointmentIDIsNull() {
        /* Test for Appointment ID Null */
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Appointment(null, presentDate, "Description"));
    }

    @Test
    void testAppointmentDateIsNull() {
        /* Test for Appointment Date Null*/
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Appointment("12345", null, "Description"));
    }

    @Test
    void testAppointmentDescriptionIsNull() {
        /* Test for Description Null */
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Appointment("12345", presentDate, null));
    }
}