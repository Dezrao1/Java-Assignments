class EmployeeReportGenerator {
    public void generateReport(Employee employee) {
        System.out.println("Employee Report:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Salary: " + employee.getSalary());
    }
}
