import java.util.*;


 class BMICalculator {
    Scanner sc = new Scanner(System.in);
    double height;
    double weight;

     void BMICalculator(){
        this.height = 0;
        this.weight = 0; 
     }

     void getBMICalculator(){
        System.out.println("Height is "+this.height+" m");
        System.out.println("Weight is "+this.weight+" kg");
     }

     void setBMICalculator(){
        System.out.print("Enter your height in m : ");
         this.height = sc.nextDouble();
         System.out.print("Enter your weight in kg : ");
         this.weight = sc.nextDouble();
     }

    void CalBMICalculator(){
        System.out.println("BMI = "+(this.weight/Math.pow(this.height,2))+" kg/m2");
    }

    

    public static void main(String[] args) {
        BMICalculator a = new BMICalculator();
        a.getBMICalculator();
        a.setBMICalculator();
        a.getBMICalculator();
        a.CalBMICalculator();
        a.getBMICalculator();

    }
}
