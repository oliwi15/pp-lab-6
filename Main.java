
import java.util.ArrayList;
import java.util.List;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {

    public static void main(String[] args) {
        Worker worker1 = new Worker("Adam Adamczuk", 4000, 1, "2022-01-01", "Junior Java ");
        Worker worker2 = new Worker("Ola Drozd", 2000, 2, "2022-02-15", "Senior  Phyton");
        Worker worker3 = new Worker("Monika Musiałek", 2000, 2, "2023-05-27", " Javascript ");
        Worker worker4 = new Worker("Mirek Marcin", 6000, 2, "2024-10-22", " C++ ");
        Worker worker5 = new Worker("Paulina Moskalik", 1000, 4, "2022-08-29", " Java ");
        Manager manager = new Manager("Sara Parker", 3100, 5, "2023-05-01", "IT ");
        Manager manager2 = new Manager("John John", 3100, 6, "2022-05-01", "Web");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager);
        employees.add(manager2);

        double totalSalaryAllEmployees = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("Total salary of all employees: " + totalSalaryAllEmployees);

        double totalSalaryManagers = employees.stream()
                .filter(employee -> employee instanceof Manager)
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("Total salary of all managers: " + totalSalaryManagers);

        double totalSalaryWorkers = employees.stream()
                .filter(employee -> employee instanceof Worker)
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("Total salary of all workers: " + totalSalaryWorkers);

        for (Employee employee : employees) {
            int id = employee.hashCode();
            List<Employee> employeesWithSameId = employees.stream()
                    .filter(e -> e.hashCode() == id)
                    .toList();
            if (employeesWithSameId.size() > 1) {
                System.out.println("Employees with same ID (" + id + "):");
                for (Employee emp : employeesWithSameId) {
                    System.out.println("- " + emp.getName() + ", Position: " + emp.getPosition());
                }
            }
        }
    }
}
