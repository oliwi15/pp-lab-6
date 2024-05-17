import company.models.Manager;
import company.models.Worker;

public class Main {

    public static void main(String[] args) {
        Worker worker1 = new Worker("Adam Adamczuk", 4000, 1);
        Worker worker2 = new Worker("Ola Drozd", 2000, 2);
        Worker worker3 = new Worker("Monika Musiałek", 5000, 3);
        Worker worker4 = new Worker("Tomasz Kot", 3000, 4);
        Manager manager = new Manager("Sara Parker", 3100, 5);

        System.out.println("Worker 1 Salary: " + worker1.getSalary());
        worker1.work();

        System.out.println("Worker 2 Salary: " + worker2.getSalary());
        worker2.work();

        System.out.println("Worker 3 Salary: " + worker3.getSalary());
        worker3.work();

        System.out.println("Worker 4 Salary: " + worker4.getSalary());
        worker4.work();

        System.out.println("Manager Salary: " + manager.getSalary());
        manager.work();
    }
}
