/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public abstract class Employee {
 public String ID;
    public String FullName;
    public String BirthDay;
    public String Phone;
    public String Email;
    public int Employee_type;
    protected static int Employee_count = 0;
    protected Scanner sc = new Scanner(System.in);
    protected Employee[] arr = new Employee[5000];
    protected int count = 0;
    protected Certificate certificates[] = new Certificate[100];
    protected int certCount = 0;

    public Employee(String ID, String FullName, String BirthDay, String Phone, String Email, int Employee_type) {
        this.ID = ID;
        this.FullName = FullName;
        this.BirthDay = BirthDay;
        this.Phone = Phone;
        this.Email = Email;
        this.Employee_type = Employee_type;
        Employee_count++;
    }

    public Employee() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String BirthDay) {
        this.BirthDay = BirthDay;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getEmployee_type() {
        return Employee_type;
    }

    public void setEmployee_type(int Employee_type) {
        this.Employee_type = Employee_type;
    }

    public void addCertificate(Certificate certificate) {
        if (certCount < certificates.length) {
            certificates[certCount++] = certificate;
        } else {
            System.out.println("Cannot add more certificates, array is full.");
        }
    }

    public void displayCertificates() {
        System.out.println("Certificates:");
        for (int i = 0; i < certCount; i++) {
            System.out.println(certificates[i]);
        }
    }

    public void InputCert() {
        System.out.print("Enter number of certificates: ");
        int numCertificates = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numCertificates; i++) {
            System.out.println("Certificate " + (i + 1) + ":");
            System.out.print("Enter certificate ID: ");
            String certificateID = sc.nextLine();
            System.out.print("Enter certificate name: ");
            String certificateName = sc.nextLine();
            System.out.print("Enter certificate rank: ");
            String certificateRank = sc.nextLine();
            System.out.print("Enter certificate date: ");
            String certificateDate = sc.nextLine();

            Certificate certificate = new Certificate(certificateID, certificateName, certificateRank, certificateDate);
            addCertificate(certificate);
        }
    }

    public void InputInfo() {
        System.out.print("Enter Employee ID: ");
        ID = sc.nextLine();
        do {
            System.out.print("Enter Full Name: ");
            FullName = sc.nextLine();
            if (!ValidData.Validation.isValidName(FullName)) {
                System.out.println("Invalid Full Name. Please try again.");
            }
        } while (!ValidData.Validation.isValidName(FullName));

        do {
            System.out.print("Enter Birth Date (DD/MM/YYYY): ");
            BirthDay = sc.nextLine();
            if (!ValidData.Validation.isValidDate(BirthDay)) {
                System.out.println("Invalid Birth Date. Please try again.");
            }
        } while (!ValidData.Validation.isValidDate(BirthDay));

        do {
            System.out.print("Enter Phone: ");
            Phone = sc.nextLine();
            if (!ValidData.Validation.isValidPhone(Phone)) {
                System.out.println("Invalid Phone. Please try again.");
            }
        } while (!ValidData.Validation.isValidPhone(Phone));

        do {
            System.out.print("Enter Email: ");
            Email = sc.nextLine();
            if (!ValidData.Validation.isValidEmail(Email)) {
                System.out.println("Invalid Email. Please try again.");
            }
        } while (!ValidData.Validation.isValidEmail(Email));

        InputCert();
    }

    public void ShowInfo() {
        System.out.printf("ID: %s, Name: %s, BirthDate: %s, Phone: %s, Email: %s, Type: %d, Certificate: %d\n", ID, FullName, BirthDay, Phone, Email, Employee_type, certCount);
    }
}
