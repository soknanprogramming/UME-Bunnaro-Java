package OPP;
public class HmElectricity {
    private String customerName;
    private double oldKw;
    private double newKw;
    public HmElectricity(String customerName, double oldKw, double newKw){
        if (newKw < oldKw) {
            throw new IllegalArgumentException("oldKw must be less than newKw.");
        }
        this.customerName = customerName;
        this.oldKw = oldKw;
        this.newKw = newKw;
    }
    public HmElectricity(double oldKw, double newKw){
        this("Unknow", oldKw, newKw);
    }   
    public void setOldKw(double oldKw){
        if (this.newKw < oldKw) {
            throw new IllegalArgumentException("oldKw must be less than newKw.");
        }
        this.oldKw = oldKw;
    }
    public void setNewKw(double newKw){
        if (newKw < this.oldKw) {
            throw new IllegalArgumentException("oldKw must be less than newKw.");
        }
        this.newKw = newKw;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    
    public double getOldKw(){
        return this.oldKw;
    }
    public double getNewKw(){
        return this.newKw;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public double getTotalKw(){
        return this.newKw - this.oldKw;
    }
    public double getTotalPrice(){
        double totalKw = getTotalKw();
        if(totalKw >= 0 && totalKw < 50){
            return totalKw * 450;
        }
        else if(totalKw >= 50 && totalKw < 100){
            return totalKw * 500;
        }
        else if(totalKw >= 100 && totalKw < 250){
            return totalKw * 650;
        }
        else if(totalKw >= 250){
            return totalKw * 750;
        }
        else{
            throw new IllegalStateException("TotalKW cannot be less that zero");
        }
    }
    public String getToString(){
        String result = "Customer Name: " + this.getCustomerName() + "\n" +
                        "Total Kw: " + this.getTotalKw() + "\n" +
                        "Total Amount: " + this.getTotalPrice() + "\n" +
                        "............................................................................................." + "\n";
        return result;
    }
}
