public class Main {

    public static void main(String[] args) {

        System.out.println("=== Hospital Management System ===\n");

        // CREATE OBJECTS
        Patient p1 = new Patient(101, "Ali Khan", 17, "O+");
        Patient p2 = new Patient(102, "Dana Smith", 45, "A-");
        Patient p3 = new Patient();

        Doctor d1 = new Doctor(201, "Dr. Brown", "Cardiology", 12);
        Doctor d2 = new Doctor(202, "Dr. Green", "Surgery", 4);

        Appointment a1 = new Appointment(301, "Ali Khan", "Dr. Brown", "10.10.2026", "Pending");
        Appointment a2 = new Appointment();

        // DISPLAY OBJECTS
        System.out.println("--- PATIENTS ---");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("\n--- DOCTORS ---");
        System.out.println(d1);
        System.out.println(d2);

        System.out.println("\n--- APPOINTMENTS ---");
        System.out.println(a1);
        System.out.println(a2);

        // TEST GETTERS
        System.out.println("\n--- TESTING GETTERS ---");
        System.out.println("Patient 1 name: " + p1.getFullName());
        System.out.println("Doctor 1 specialization: " + d1.getSpecialization());
        System.out.println("Appointment 1 status: " + a1.getStatus());

        // TEST SETTERS
        System.out.println("\n--- TESTING SETTERS ---");
        p3.setFullName("New Patient");
        p3.setAge(65);
        p3.setBloodType("B+");
        System.out.println(p3);

        // TEST METHODS
        System.out.println("\n--- TESTING METHODS ---");
        System.out.println(p1.getFullName() + " is minor: " + p1.isMinor());
        System.out.println(p2.getFullName() + " age category: " + p2.getAgeCategory());

        System.out.println(d1.getName() + " experienced: " + d1.isExperienced());
        System.out.println(d2.getName() + " can perform surgery: " + d2.canPerformSurgery());

        a1.reschedule("15.10.2026");
        System.out.println("Rescheduled appointment: " + a1);

        a2.cancel();
        System.out.println("Cancelled appointment: " + a2);

        System.out.println("\n=== Program Complete ===");
    }
}
