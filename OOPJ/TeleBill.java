

class TeleBill {
    String customer;
        String mob;
        int calls;
        int dur;
       
   
    public TeleBill(String name, String no,int call, double dur){
        this.customer = name;
        this.mob = no;
        this.calls = call;
        this.dur = (int)dur;
    } 

    public void calculateBill(){
        if(this.calls<=100){
            System.out.println("Bill is "+((this.calls*this.dur*0.50)+10)+" Rs");
        }
        if(this.calls>100){
            System.out.println("Bill is "+((this.calls*this.dur*0.25)+10)+" Rs");
        }
    }

    public static void main(String[] args) {
        TeleBill a = new TeleBill("Akash","8181819494",120,105.35);
        a.calculateBill();

    }
}
