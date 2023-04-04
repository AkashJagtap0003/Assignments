import java.util.*;

class Bank {
    static Scanner sc = new Scanner(System.in);
    String cust;
    Long acc; 
    double bal;
    
    public void newAccount(){
        System.out.print("Enter name : ");
        this.cust = sc.nextLine();
        System.out.print("Enter account number : ");
        this.acc = sc.nextLong();
        this.bal = 0;
    }

    public void deposit(){
        System.out.print("Enter amount to be deposited : ");
        this.bal = this.bal + sc.nextDouble();
    }
    
    public void withdraw(){
        System.out.print("Enter amount to withdraw : ");
        this.bal = this.bal - sc.nextDouble();
    }

    public void displayBal(){
        System.out.print("Enter account number for balance : ");
        if(sc.nextLong()==this.acc){
            
            System.out.println("Account balance : "+this.bal);
            }
            else{
                System.err.println("An error occurred: account number is invalid");
            }
    }

    public void displayInfo(){
        System.out.print("Enter account number : ");
        if(sc.nextLong()==this.acc){
            System.out.println("Customer name : "+this.cust);
            System.out.println("Account balance : "+this.bal);
            }
            else{
                System.err.println("An error occurred: account number is invalid");
            }
    }

    public static void main(String[] args) {
        Bank ab = new Bank();
        ab.newAccount();
        ab.deposit();
        ab.withdraw();
        ab.displayBal();
        ab.displayInfo();

    }

}