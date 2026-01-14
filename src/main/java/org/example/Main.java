import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Person> people = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n========================================");
            System.out.println(" HOSPITAL MANAGEMENT SYSTEM ");
            System.out.println("========================================");
            System.out.println("1. Add General Person");
            System.out.println("2. Add Patient");
            System.out.println("3. Add Doctor");
            System.out.println("4. View All (Polymorphic)");
            System.out.println("5. Demonstrate Polymorphism");
            System.out.println("6. View Patients Only");
            System.out.println("7. View Doctors Only");
            System.out.println("0. Exit");
            System.out.println("========================================");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addPerson();
                case 2 -> addPatient();
                case 3 -> addDoctor();
                case 4 -> viewAll();
                case 5 -> demonstratePolymorphism();
                case 6 -> viewPatients();
                case 7 -> viewDoctors();
                case 0 -> System.out.println("Program finished.");
                default -> System.out.println("Invalid choice.");
            }

        } while (choice != 0);
    }

    // -------- MENU METHODS --------

    private static void addPerson() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        people.add(new Person(id, name, age, "Person"));
        System.out.println("Person added.");
    }

    private static void addPatient() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Blood type: ");
        String blood = scanner.nextLine();

        people.add(new Patient(id, name, age, blood, false));
        System.out.println("Patient added.");
    }

    private static void addDoctor() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Specialization: ");
        String spec = scanner.nextLine();

        System.out.print("Experience years: ");
        int exp = scanner.nextInt();

        people.add(new Doctor(id, name, age, spec, exp));
        System.out.println("Doctor added.");
    }

    private static void viewAll() {
        System.out.println("\n--- ALL PEOPLE (POLYMORPHIC LIST) ---");
        for (Person p : people) {
            System.out.println(p);

            if (p instanceof Doctor d && d.isExperienced()) {
                System.out.println(" ⭐ Experienced Doctor");
            }
            if (p instanceof Patient pat && pat.needsGuardian()) {
                System.out.println(" 👶 Needs guardian");
            }
        }
    }

    private static void demonstratePolymorphism() {
        System.out.println("\n--- POLYMORPHISM DEMO ---");
        for (Person p : people) {
            p.performDuty(); // SAME METHOD — DIFFERENT BEHAVIOR
        }
    }

    private static void viewPatients() {
        System.out.println("\n--- PATIENTS ONLY ---");
        for (Person p : people) {
            if (p instanceof Patient pat) {
                System.out.println(pat);
            }
        }
    }

    private static void viewDoctors() {
        System.out.println("\n--- DOCTORS ONLY ---");
        for (Person p : people) {
            if (p instanceof Doctor d) {
                System.out.println(d);
            }
        }
    }
}
