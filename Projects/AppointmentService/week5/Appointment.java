package week5;
import java.util.Date;

public class Appointment {
    private String apptID;
    private String description;
    private Date date;

    public Appointment(String apptID, Date date, String description) {
        Date presentdate = new Date();
        if (apptID == null || apptID.length() > 10) {
            throw new IllegalArgumentException("Invalid Appointment ID");
        }
        if (date == null || presentdate.before(date)) {
            throw new IllegalArgumentException("Invalid Date");
        }
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Invalid Description");
        }
        this.apptID = apptID;
        this.date = date;
        this.description = description;
    }

    public String getApptID() {
        return apptID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}