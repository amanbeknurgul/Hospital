public class Doctor extends Person {

    // Child-specific fields
    private String specialization;
    private int experienceYears;

    // Constructor using super()
    public Doctor(int id, String name, int age, String specialization, int experienceYears) {
        super(id, name, age, "Doctor"); // MUST be first
        this.specialization = specialization;
        this.experienceYears = experienceYears;
    }

    // Getters
    public String getSpecialization() {
        return specialization;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    // Override method 1
    @Override
    public void performDuty() {
        System.out.println("Doctor " + name + " is treating patients (" + specialization + ").");
    }

    // Override method 2
    @Override
    public String getDescription() {
        return "Doctor";
    }

    // Unique methods
    public boolean isExperienced() {
        return experienceYears >= 10;
    }

    public void diagnosePatient(String patientName) {
        System.out.println("Doctor " + name + " is diagnosing " + patientName + ".");
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Specialization: " + specialization +
                " | Experience: " + experienceYears + " years";
    }
}
