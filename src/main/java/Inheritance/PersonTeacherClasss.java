/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Soknan Poch
 */
public class PersonTeacherClasss extends Person {
    private int hour;
    private float fee;
    public PersonTeacherClasss(){
        super();
        this.hour = 0;
        this.fee = 0;
    }
    public PersonTeacherClasss(int hour, float fee){
        super();
        this.hour = hour;
        this.fee = fee;
    }
    public PersonTeacherClasss(int hour, float fee, String name, String gender){
        super(name, gender);
        this.hour = hour;
        this.fee = fee;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public void setFee(float fee){
        this.fee = fee;
    }
    public int getHour(){
        return this.hour;
    }
    public float getFee(){
        return this.fee;
    }
    public float getTotalSalary(){
        return this.hour * this.fee;
    }
}
