// Violates SRP - Handles both employee data and reporting
class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Data management methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Reporting methods - this violates SRP
    public void generateReport() {
        System.out.println("Employee Report:");
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }

    public void saveToDatabase() {
        // Database saving logic
        System.out.println("Saving employee to database...");
    }
}
