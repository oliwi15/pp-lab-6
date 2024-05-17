import java.util.ArrayList;
import java.util.List;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {

    public static void main(String[] args) {
        Worker worker1 = new Worker("Adam Adamczuk", 4000, 1, "2022-01-01", "Junior Java ");
        Worker worker2 = new Worker("Ola Drozd", 2000, 2, "2022-02-15", "Senior  Phyton");
        Worker worker3 = new Worker("Monika Musiałek", 5000, 3, "2022-03-20", " Javascript ");
        Worker worker4 = new Worker("Tomasz Kot", 3000, 4, "2022-04-10", " Sql");
        Manager manager = new Manager("Sara Parker", 3100, 5, "2022-05-01", "IT ");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() +
                    ", Position: " + employee.getPosition() + ", Hire date: " +
                    employee.getHireDate() + ", Salary: " + employee.getSalary() + ")");
            employee.work();
        }
    }
}
