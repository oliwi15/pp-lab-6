
import company.models.Manager;
import company.models.Worker;

public class Main {

    public static void main(String[] args) {
        Worker worker1 = new Worker("Adam Adamczuk", 4000, 1, "2022-01-01", "Junior Java ");
        Worker worker2 = new Worker("Ola Drozd", 2000, 2, "2022-02-15", "Senior  Phyton");
        Worker worker3 = new Worker("Monika Musiałek", 5000, 2, "2022-03-20", " Javascript ");
        Manager manager = new Manager("Sara Parker", 3100, 5, "2022-05-01", "IT ");

        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        Worker workerWithSameId = worker1;

        System.out.println("Checking equality for workerWithSameId and worker1: " + workerWithSameId.equals(worker1));
        System.out.println("Checking equality for workerWithSameId and worker2: " + workerWithSameId.equals(worker2));
        System.out.println("Checking equality for workerWithSameId and worker3: " + workerWithSameId.equals(worker3));
        System.out.println("Checking equality for workerWithSameId and manager: " + workerWithSameId.equals(manager));
    }

}
