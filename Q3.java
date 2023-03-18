
class Q3{
public static void main(String args[]){
 double P = 50000000;
 double N = 5;
 double R = 10.75;
 double CI = (P*(Math.pow((1+(R/100)),5)))-P;
System.out.println("Compound interest is "+Math.round(CI));
System.out.printf("Compound interest is %.2f",(float)(CI));
}
}