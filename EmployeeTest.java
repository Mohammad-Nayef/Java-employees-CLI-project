import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeTest {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<Employee>();

    public static void main(String[] args) {
        int option;

        do {
            System.out.println("Employees menu:\n\n1. Add new employee.\n"
            + "2. Remove an employee by his/her name if exists.\n"
            + "3. Print annual salary for each employee.\n"
            + "4. Add a certain raise percentage to each employees monthly salary.\n"
            + "5. Print all employees information.\n"
            + "6. Exit.\n");

            System.out.print("Choose an option: ");
            option = scan.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    addNewEmployee();
                    break;

                case 2:
                    removeByName();
                    break;

                case 3:
                    printAnnualSalary();
                    break;

                case 4:
                    addRaisePercentage();
                    break;

                case 5:
                    print();
                    break;
            }

            System.out.println("***********************\n");
        } while (option != 6);
    }

    public static void addNewEmployee() {
        String name;
        int day, month, year;
        double monthlySalary;

        System.out.print("To add a new employee write the following:\nName: ");
        name = scan.next();
        System.out.print("Hiring date (day, month, year): ");
        day = scan.nextInt();
        month = scan.nextInt();
        year = scan.nextInt();
        System.out.print("Monthly salary: ");
        monthlySalary = scan.nextDouble();

        employees.add(new Employee(name, new Date(day, month, year), monthlySalary));
    }

    public static void removeByName() {
        if (employees.isEmpty())
            System.out.println("The array is empty!\n");

        else {
            System.out.print("Write the name: ");
            String wantedName = scan.next();

            for (int i = 0; i < employees.size(); i++) {
                if (wantedName.toLowerCase().equals(employees.get(i).getName().toLowerCase())) {
                    employees.remove(i);
                    return;
                }
            }

            System.out.println("Can't find the wanted name!");
        }
    }

    public static void printAnnualSalary() {
        if (employees.isEmpty())
        System.out.println("The array is empty!\n");

        else {
            System.out.println("The annual salary of the emoloyees:\n");

            for (int i = 0; i < employees.size(); i++) {
                System.out.println(employees.get(i).getName() + ": " + 12 * employees.get(i).getMonthlySalary());
            }
        }
    }

    public static void addRaisePercentage() {
        if (employees.isEmpty())
        System.out.println("The array is empty!\n");

        else {
            System.out.print("Write the percentage: ");
            double percentage = scan.nextDouble();

            for (int i = 0; i < employees.size(); i++) {
                double raise = employees.get(i).getMonthlySalary() + percentage * employees.get(i).getMonthlySalary();
                employees.get(i).setMonthlySalary(raise);
            }
        }
    }

    public static void print() {
        if (employees.isEmpty())
        System.out.println("The array is empty!\n");

        else {
            System.out.println("Information of the employees:\n");

            for (int i = 0; i < employees.size(); i++) {
                System.out.println("Name: " + employees.get(i).getName()
                + "\nHiring date: " + employees.get(i).getHireDate().print()
                + "\nMothly salay: " + employees.get(i).getMonthlySalary() + '\n');

            }
        }
    }
}