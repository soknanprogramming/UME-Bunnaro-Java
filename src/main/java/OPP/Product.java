/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OPP;

/**
 *
 * @author Soknan Poch
 */
public class Product {
    private String name;
    private double unitPrice;
    private int quantity;
    private double discount;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    public double getUnitPrice(){
        return this.unitPrice;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setDiscount(double discount){
        if(discount > 100){
            this.discount = 100;
        }
        else if(discount < 0){
            this.discount = 0;
        }
        else{
            this.discount = discount;
        }
    }
    public double getDiscountAmount(){
        return this.discount * 100 / this.getTotal();
    }
    public double getNetAmount(){
        return this.getTotal() - this.getDiscountAmount();
    }
    public double getDiscount(){
        return this.discount;
    }
    public Product(String name, double unitPrice, int quantity){
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    public Product(){
        this("Unknow", 0.0f, 0);
    }
    public double getTotal(){
        return this.unitPrice * this.quantity;
    }
    public String toString(){
        return "Name: " + this.name + ", Quanity" + this.quantity + ", Unit Price: " + this.unitPrice + ", Total: " + this.getTotal();
    }
    
}
