
package employeemanagement;

import data.Employee;
import java.util.Scanner;

public class EmployeeManagement {

    private Employee[] employees = new Employee[5000];
    private int count = 0;
    private Scanner sc = new Scanner(System.in);

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
        } else {
            System.out.println("Cannot add more employees, array is full.");
        }
    }

    public void deleteEmployee(String ID) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getID().equals(ID)) {
                employees[i] = employees[--count];
                employees[count] = null;
                break;
            }
        }
    }

    public void updateEmployee(String ID) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getID().equals(ID)) {
                System.out.println("Updating employee with ID: " + ID);
                employees[i].InputInfo();
                break;
            }
        }
    }

    public void displayAllEmployees() {
        for (int i = 0; i < count; i++) {
            employees[i].ShowInfo();
        }
    }

    public void searchEmployeeByID(String ID) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getID().equals(ID)) {
                employees[i].ShowInfo();
                employees[i].displayCertificates();
                return;
            }
        }
        System.out.println("Employee with ID " + ID + " not found.");
    }
    
    public void displayEmlpoyeeByType(int type){
        boolean flag = false;
        for (int i = 0; i < count; i++) {
            if(employees[i].getEmployee_type() == type) {
                employees[i].ShowInfo();
                flag = true;
                System.out.println("");
            }
        }
        if(flag == false)
            System.out.println("No employees found with type: " + type);
    }
}
