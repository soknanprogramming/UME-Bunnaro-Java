/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Soknan Poch
 */
public class Person {
    private String name;
    private String gender;
    
    public Person(){
        this.name= "";
        this.gender = "";
    }
    public Person(String name, String gender){
        this.name = name;
        this.gender = gender;
    }    
    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getName(){
        return this.name;
    }
    public String getGender(){
        return this.gender;
    }
}
