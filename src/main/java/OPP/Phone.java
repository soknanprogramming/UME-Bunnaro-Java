package OPP;
public class Phone {
    private String model;
    private String brand;
    private double price;
    private int quantity;
    
    public Phone(){
        this.model = "unknow";
        this.brand = "unknow";
        this.price = 0.0;
        this.quantity = 0;
    }
    public Phone(String model, String brand, double price, int quantity){
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }
    public String getModel(){
        return this.model;
    }
    public String getBrand(){
        return this.brand;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double totalPrice(){
        return this.price * this.quantity;
    }
    
    @Override
    public String toString(){
        String st =  "Brand: " + this.brand + "\n";
               st += "Model: " + this.model + "\n";
               st += "Price: " + this.price + "\n";
               st += "Total: " + this.totalPrice()+ "\n";
               
               return st;
    }

    
}
