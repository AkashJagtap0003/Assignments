import java.util.*;
class Vote{
	public static void main(String args[]){
	Scanner ab = new Scanner(System.in);
	System.out.println("enter your age :");
	int a = ab.nextInt();
	System.out.println("are you resident of this region :");
	String n1 = ab.next();
	String n2 = "indian";
	//Boolean b = ab.nextBoolean();
	System.out.println(a>=18&&n1.equals("indian")?"You are eligible to vote":"You are not eligible to vote");
}
}