
import java.util.*;

class TollBill{
    private String veh;
    private int axle;
    private double dist;
    private double tollFee;
    private double totalamtdue;
    int c;

    private static final double CarRate = 0.25;
    private static final double TruckRate = 0.50;
    private static final double Profee = 150.00;

    Scanner sc = new Scanner(System.in);

    public void Menu(){
        while(true){
        System.out.println("***********MENU***********");
        System.out.println("1 : Enter Vehicle type");
        System.out.println("2 : Enter number of axles");
        System.out.println("3 : Enter distance travelled");
        System.out.println("4 : Calculate Toll fee");
        System.out.println("5 : Generate Bill");
        System.out.println("6 : Exit");
        c = sc.nextInt();
        
        System.out.println();
        System.out.println();
        
             switch(c){
                case 1 :
                System.out.print("Enter vehicle type : ");
                this.veh = sc.next();
                break;

                case 2 :
                System.out.print("Enter number of axles : ");
                this.axle = sc.nextInt();
                sc.nextLine();
                break;

                case 3 :
                System.out.println("Enter distance travelled : ");
                this.dist = sc.nextDouble();
                sc.nextLine();
                break;

                case 4 :
                CalculateToll();
                break;

                case 5 :
                GenerateBill();
                break;

                case 6 :
                return;

                default:
                    System.out.println("Invalid choice.");
                    break;

                
             }
             System.out.println();
                System.out.println();
        }
    }

   
    public void CalculateToll(){
        if(veh.equalsIgnoreCase("car") || veh.equalsIgnoreCase("vans") || veh.equalsIgnoreCase("bus")){
            tollFee = CarRate * dist * axle;
        }
        else if(veh.equalsIgnoreCase("truck")){
            tollFee = TruckRate * dist * axle;
        }
        System.out.println("Toll fee is Rs."+tollFee);
    }

    public void GenerateBill(){
        totalamtdue = Profee + tollFee;
        System.out.println("Amount due is "+tollFee+" plus processing fee of Rs.150 . Total = Rs."+totalamtdue);
    }



    public static void main(String[] args) {
        TollBill a = new TollBill();
        a.Menu();
    }
}