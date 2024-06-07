/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class Experience extends Employee{
    
    private int ExpInYear;
    private String ProSkill;
    private Experience[] arrEx = new Experience[5000];

    public Experience(String ID, String FullName, String BirthDay, String Phone, String Email, int Employee_type, int ExpInYear, String ProSkill) {
        super(ID, FullName, BirthDay, Phone, Email, Employee_type);
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }

    public Experience() {
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int ExpInYear) {
        this.ExpInYear = ExpInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String ProSkill) {
        this.ProSkill = ProSkill;
    }

    @Override
    public void InputInfo() {
        super.InputInfo();
        System.out.print("Enter Years of Experience: ");
        ExpInYear = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Professional Skill: ");
        ProSkill = sc.nextLine();
        arrEx[count] = new Experience(ID, FullName, BirthDay, Phone, Email, Employee_type, ExpInYear, ProSkill);
        count++;
        super.setEmployee_type(0);
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.printf("Experience: %d years, ProSkill: %s\n", ExpInYear, ProSkill);
    }
}
