/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class Fresher extends Employee{
   
    private String Graduation_date;
    private String Graduation_rank;
    private String Education;
    private Fresher[] arrFr = new Fresher[5000];

    public Fresher(String ID, String FullName, String BirthDay, String Phone, String Email, int Employee_type, String Graduation_date, String Graduation_rank, String Education) {
        super(ID, FullName, BirthDay, Phone, Email, Employee_type);
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;
    }

    public Fresher() {
    }

    public String getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(String Graduation_date) {
        this.Graduation_date = Graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String Graduation_rank) {
        this.Graduation_rank = Graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String Education) {
        this.Education = Education;
    }

    @Override
    public void InputInfo() {
        super.InputInfo();
        System.out.print("Enter Graduation Date (DD-MM-YYYY): ");
        Graduation_date = sc.nextLine();
        System.out.print("Enter Graduation Rank: ");
        Graduation_rank = sc.nextLine();
        System.out.print("Enter Education: ");
        Education = sc.nextLine();
        arrFr[count] = new Fresher(ID, FullName, BirthDay, Phone, Email, Employee_type, Graduation_date, Graduation_rank, Education);
        count++;
        
        super.setEmployee_type(1);
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.printf("Graduation Date: %s, Graduation Rank: %s, Education: %s\n", Graduation_date, Graduation_rank, Education);
    }
}
