/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagement;

import data.Experience;
import data.Fresher;
import data.Intern;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Main {
 public static void main(String[] args) {
        EmployeeManagement em = new EmployeeManagement();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            menu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Select Employee Type: ");
                    System.out.println("0. Experience");
                    System.out.println("1. Fresher");
                    System.out.println("2. Intern");
                    int type = sc.nextInt();
                    sc.nextLine();

                    if (type == 0) {
                        Experience ex = new Experience();
                        ex.InputInfo();
                        em.addEmployee(ex);
                    } else if (type == 1) {
                        Fresher fr = new Fresher();
                        fr.InputInfo();
                        em.addEmployee(fr);
                    } else if (type == 2) {
                        Intern in = new Intern();
                        in.InputInfo();
                        em.addEmployee(in);
                    } else {
                        System.out.println("Invalid type!");
                    }
                    break;
                case 2:
                    System.out.print("Enter Employee ID to delete: ");
                    String delID = sc.nextLine();
                    em.deleteEmployee(delID);
                    break;
                case 3:
                    System.out.print("Enter Employee ID to update: ");
                    String updID = sc.nextLine();
                    em.updateEmployee(updID);
                    break;
                case 4:
                    em.displayAllEmployees();
                    break;
                case 5:
                    System.out.print("Enter Employee ID to search: ");
                    String searchID = sc.nextLine();
                    em.searchEmployeeByID(searchID);
                    break;
                case 6:
                    System.out.print("Enter Employee type to display (0: Experience, 1: Fresher, 2: Intern): ");
                    int displayType = sc.nextInt();
                    sc.nextLine();
                    em.displayEmlpoyeeByType(displayType);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 7);
    }
    public static void menu(){
        System.out.println("1. Add Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Search Employee by ID");
            System.out.println("6. Display Employees by Type");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
    }
}
