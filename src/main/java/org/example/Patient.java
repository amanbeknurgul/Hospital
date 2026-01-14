public class Patient extends Person {

    // Child-specific fields
    private String bloodType;
    private boolean admitted;

    // Constructor using super()
    public Patient(int id, String name, int age, String bloodType, boolean admitted) {
        super(id, name, age, "Patient"); // MUST be first
        this.bloodType = bloodType;
        this.admitted = admitted;
    }

    // Getters
    public String getBloodType() {
        return bloodType;
    }

    public boolean isAdmitted() {
        return admitted;
    }

    // Setters
    public void setAdmitted(boolean admitted) {
        this.admitted = admitted;
    }

    // Override method 1
    @Override
    public void performDuty() {
        System.out.println("Patient " + name + " is receiving medical treatment.");
    }

    // Override method 2
    @Override
    public String getDescription() {
        return "Patient";
    }

    // Unique methods
    public void admit() {
        admitted = true;
        System.out.println(name + " has been admitted to the hospital.");
    }

    public boolean needsGuardian() {
        return age < 18;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Blood Type: " + bloodType +
                " | Admitted: " + admitted;
    }
}
