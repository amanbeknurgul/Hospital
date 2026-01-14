public class Appointment {

    // 1. PRIVATE FIELDS
    private int appointmentId;
    private String patientName;
    private String doctorName;
    private String date;
    private String status;

    // 2. CONSTRUCTOR WITH PARAMETERS
    public Appointment(int appointmentId, String patientName, String doctorName, String date, String status) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.date = date;
        this.status = status;
    }

    // 3. DEFAULT CONSTRUCTOR
    public Appointment() {
        this.appointmentId = 0;
        this.patientName = "Unknown";
        this.doctorName = "Unknown";
        this.date = "Not scheduled";
        this.status = "Pending";
    }

    // 4. GETTERS
    public int getAppointmentId() {
        return appointmentId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    // 5. SETTERS
    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // 6. ADDITIONAL METHODS
    public void reschedule(String newDate) {
        this.date = newDate;
        this.status = "Rescheduled";
    }

    public void cancel() {
        this.status = "Cancelled";
    }

    // 7. toString()
    @Override
    public String toString() {
        return "Appointment{appointmentId=" + appointmentId +
                ", patientName='" + patientName + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", date='" + date + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
