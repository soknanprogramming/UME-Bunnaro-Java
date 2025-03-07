package HomeWord;

public class Product {
    private String name;
    private double unitPrice;
    private int quantity;
    
    public Product(){
        this("unknow", 0.0, 0);
    }
    public Product(String name, double unitPrice, int quantity){
        if(name.equals("")){
            this.name = "unkow";
        }
        else{
            this.name = name;
        }
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setUnitPrice(double unitPrice){
       
        this.unitPrice = unitPrice;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public String getName(){
        return this.name;
    }
    public double getUnitPrice(){
        return this.unitPrice;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public double getTotal(){
        return this.unitPrice * this.quantity;
    }
    
    @Override
    public String toString(){
        String result = "Name: " + this.name + "\n" + 
                        "Unit Price: " + String.format("%.2f", this.unitPrice) + "\n" + 
                        "Quantity: " + this.quantity + "\n";
        return result;
    }
}
