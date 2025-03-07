package HomeWord;

public class Drink extends Product {
    private String toping;
    private double price;
    private float discountPercent;
    
    public Drink(){
        this("unknow", 0.0, 0, "unknow", 0.0, 0.0f);
    }
    public Drink(String name, double unitPrice, int quantity, String toping, double price, float discountPercent){
        super(name, unitPrice, quantity);
        this.toping = toping;
        this.price = price;
        this.discountPercent = discountPercent;
    }
    
    public void setToping(String toping){
        this.toping = toping;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setDiscountPercent(float discountPercent){
        this.discountPercent = discountPercent;
    }
    
    public String getToping(){
        return this.toping;
    }
    public double getPrice(){
        return this.price;
    }
    public float getDiscountPercent(){
        return this.discountPercent;
    }
    
    @Override
    public double getTotal(){
        double result = super.getTotal() + (this.price * super.getQuantity());
        return result;
    }
    public double getDiscountAmount(){
        return this.getTotal() * this.discountPercent;
    } 
    public double getNetTotal(){
        return this.getTotal() - this.getDiscountAmount();
    }
    @Override
    public String toString(){
        String result = super.toString() + 
               "Toping Drink: " + this.toping + "\n" +
                "Price: $" + String.format("%.2f", this.price) + "\n" +
                "Discount Percent: " + String.format("%.2f", (this.discountPercent * 100)) + "%\n" +
                "Total: $" + String.format("%.2f",this.getTotal()) + "\n" +
                "Discount Amount: $" + String.format("%.2f", this.getDiscountAmount()) + "\n" +
                "NetTotal: $" + String.format("%.2f", this.getNetTotal()) + "\n";
        return result;
    }
            
}
