class CreditScore {
    int creditHistory;
    double creditUtilization;
    boolean paymentHistory;
    double creditScore;

   



    public CreditScore(){
        this.creditHistory = 0;
        this.creditUtilization = 0;
        this.paymentHistory = false;
    }

    public void setCreditInfo(int a,double b,boolean c){
        this.creditHistory = a;
        this.creditUtilization = b;
        this.paymentHistory = c;
    }

    public void getCreditInfo(){
        System.out.println("your credit history is "+this.creditHistory);
        System.out.println("your credit utilization is "+this.creditUtilization);
    
        
    }
    public int calculateCreditScore(){
        if(paymentHistory){
        creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 55;
        return (int) creditScore;
        }
        else{
        creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 35;
        return (int) creditScore;
        }
    }


    public static void main(String[] args) {
        double h;
        CreditScore c = new CreditScore();
        
        c.setCreditInfo(500,250,true);
        c.getCreditInfo();
        h = c.calculateCreditScore();
        System.out.println("Your credit score is "+h);

    }
}
