/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Soknan Poch
 */

public class Main {
    private static void Example1() {
        PersonTeacherClasss obj = new PersonTeacherClasss(45, 9, "Dara", "male");
        String st = "Name: " + obj.getName() +
                "\nGender: " + obj.getGender() +
                "\nHour: " + obj.getFee() +
                "\nFee: " + obj.getFee() + 
                "\nTotal: " + obj.getTotalSalary() +
                "\n================================";
        System.out.println(st);
    }
    public static void main(String[] agr){
        int i = 2;
        Example1();
        Example1();
        Example1();
        Example1();
        Example1();
        Example1();
    }
}
