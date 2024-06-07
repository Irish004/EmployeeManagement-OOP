/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class Intern extends Employee{
 
    private String Majors;
    private String Semester;
    private String University_name;
    private Intern[] arrIn = new Intern[5000];

    public Intern(String ID, String FullName, String BirthDay, String Phone, String Email, int Employee_type, String Majors, String Semester, String University_name) {
        super(ID, FullName, BirthDay, Phone, Email, Employee_type);
        this.Majors = Majors;
        this.Semester = Semester;
        this.University_name = University_name;
    }

    public Intern() {
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String Majors) {
        this.Majors = Majors;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getUniversity_name() {
        return University_name;
    }

    public void setUniversity_name(String University_name) {
        this.University_name = University_name;
    }

    @Override
    public void InputInfo() {
        super.InputInfo();
        System.out.print("Enter Majors: ");
        Majors = sc.nextLine();
        System.out.print("Enter Semester: ");
        Semester = sc.nextLine();
        System.out.print("Enter University Name: ");
        University_name = sc.nextLine();
        arrIn[count] = new Intern(ID, FullName, BirthDay, Phone, Email, Employee_type, Majors, Semester, University_name);
        count++;
        super.setEmployee_type(2);
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.printf("Majors: %s, Semester: %s, University: %s\n", Majors, Semester, University_name);
    }
}
