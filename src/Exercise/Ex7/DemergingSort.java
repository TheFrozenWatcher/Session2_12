package Exercise.Ex7;

import java.util.LinkedList;
import java.util.Queue;

public class DemergingSort {
        public static void main (String[]args){
            // Create a list of employee data
            Employee[] employees = {
                    new Employee("Bob", false, "1985-12-03"),
                    new Employee("Diana", true, "1988-04-10"),
                    new Employee("Alice", true, "1990-05-15"),
                    new Employee("Charlie", false, "1992-08-22"),
                    new Employee("Eva", true, "1995-11-27")
            };

            // Separate employees by gender using queues
            Queue<Employee> femaleQueue = new LinkedList<>();
            Queue<Employee> maleQueue = new LinkedList<>();

            for (Employee employee : employees) {
                if (employee.isFemale) {
                    femaleQueue.add(employee);
                } else {
                    maleQueue.add(employee);
                }
            }

            // Print the sorted result
            System.out.println("Sorted Employee List:");
            System.out.println("Female Employees:");
            printQueue(femaleQueue);

            System.out.println("\nMale Employees:");
            printQueue(maleQueue);
        }

        public static void printQueue (Queue < Employee > queue) {
            for (Employee employee : queue) {
                System.out.println(employee.name + " | " + (employee.isFemale ? "Female" : "Male") + " | " + employee.dob);
            }
    }
}
