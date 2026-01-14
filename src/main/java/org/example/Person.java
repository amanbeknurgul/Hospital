public class Person {

    // PROTECTED fields (доступны в child)
    protected int id;
    protected String name;
    protected int age;
    protected String role;

    // Constructor
    public Person(int id, String name, int age, String role) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.role = role;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    // Setters
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    // Method to be overridden
    public void performDuty() {
        System.out.println(name + " is performing general hospital duties.");
    }

    // Another method to override
    public String getDescription() {
        return "Hospital Person";
    }

    // Method NOT overridden
    public boolean isAdult() {
        return age >= 18;
    }

    @Override
    public String toString() {
        return "[" + getDescription() + "] " + name +
                " (ID: " + id + ", Age: " + age + ")";
    }
}
