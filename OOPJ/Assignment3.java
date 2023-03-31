package Day3;

import java.util.Calendar;
import java.util.*;

class Assignment3 {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        int localday = c.get(Calendar.DATE);
        int localmonth = c.get(Calendar.MONTH)+1;
        int localyear = c.get(Calendar.YEAR);

        System.out.println("Enter your birth Date :");

        Scanner sc = new Scanner(System.in);
        System.out.print("Day : ");
        int a = sc.nextInt();
        
        System.out.print("Month : ");
        int b = sc.nextInt();
        
        System.out.print("Year : ");
        int d = sc.nextInt();
        

        System.out.println("Age is "+(localyear-d)+" years "+(localmonth-b)+" months "+(localday-a)+" days");

     }
}
