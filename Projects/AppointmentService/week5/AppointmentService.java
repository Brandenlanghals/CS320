package week5;

import java.util.ArrayList;

public class AppointmentService {
    private final ArrayList<Appointment> appts;

    public AppointmentService() {
        appts = new ArrayList<>();
    }

    public boolean add(Appointment appt) {
        boolean existingAppt = false;
        for (Appointment c : appts) {
            if (c.equals(appt)) {
                existingAppt = true;
                break;
            }
        }
        if (!existingAppt) {
            appts.add(appt);
            System.out.println("Appointment Successfully Added");
            return true;
        } else {
            System.out.println("Appointment Presently Exists");
            return false;
        }
    }

    public boolean remove(String apptID) {
        for (Appointment c : appts) {
            if (c.getApptID().equals(apptID)) {
                appts.remove(c);
                System.out.println("Appointment Successfully Removed");
                return true;
            }
        }
        System.out.println("No Existing Appointment");
        return false;
    }
}

