

public class ElectricityBill {
    String customerName;
    double Units;
    double Bill;

    

    public void ElectricityBill(){}

    public ElectricityBill(String name, double unit){
        this.customerName = name;
        this.Units = unit;
    }

    public void calculateBillAmount(){
        if(this.Units<=100){
            System.out.print("Bill Amount is "+(this.Units*5)+" Rs");
        }
        else if(this.Units<=300 && this.Units>=100){
            System.out.print("Bill Amount is "+(this.Units*7)+" Rs");
        }
        else{
            System.out.print("Bill Amount is "+(this.Units*10)+" Rs");
        }
    }
    public static void main(String[] args) {
        ElectricityBill a = new ElectricityBill("Akash" ,230.0 );
        a.calculateBillAmount();
    
    }
}
