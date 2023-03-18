import java.util.*;
class Ternary{
public static void main(String args[]){
	Scanner ab = new Scanner(System.in);
	System.out.println("Enter number 1 :");
	int a = ab.nextInt();
	System.out.println("Number is even : "+(a%2==0 ? "Even" : "Odd"));	
}
}