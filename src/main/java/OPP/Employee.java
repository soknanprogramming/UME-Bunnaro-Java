/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OPP;

/**
 *
 * @author Soknan Poch
 */
public class Employee {
    public  static String company = " UME KRATIE";
    public String name;
    
    
    
    public Employee() {
        name = "unknown";
    }
    
    public Employee(String name) {
        this.name = name;
    }
    public static String getCompanyName () {
        return company;
    }
    
    public String getjTextArea1() {
        return "Company Is " + company + "\n Name is " + name;
    }
}
