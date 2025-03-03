/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OPP;




/**
 *
 * @author Soknan Poch
 */
import javax.swing.JOptionPane;
public class Staff {
    private String name;
    private String gender;
    private double fee;
    private int hours;
    
    public Staff(String name, String gender, double fee, int hours){
        this.name = name;
        this.gender = gender;
        this.fee = fee;
        this.hours = hours;
    }
    public Staff(String name, String gender, double fee){
        this(name, gender, fee, 0);
    }
    public Staff(String name, String gender){
        this(name, gender, 0);
    }
    public Staff(String name){
        this(name, "Unknow");
    }
    public Staff(){
        this("Unknow");
    }
    
    public double getSalary(){
        return this.fee * this.hours;
    }
    public void showDisplay(){
        String showStr = "Staff Info: \n -------------------------------------------------------\n" +
                         "\t Name: " + this.name + "\n" +
                         "\t Gender: " + this.gender + "\n" +
                         "\t Fee: " + this.fee + "\n" +
                         "\t Hours: " + this.hours + "\n" +
                         "\t Salary: " + this.getSalary() + "\n";
        JOptionPane.showMessageDialog(null, showStr);
    }
}
