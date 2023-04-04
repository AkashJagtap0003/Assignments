package Day5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class DateTimeConverter{
    public static void main(String[] args) {
        Date D = new Date();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day : ");
        int day = sc.nextInt();
        if(day<0||day>31){
            System.out.print("Enter valid day : ");
            day = sc.nextInt();
        }

        System.out.print("Enter month : ");
        int mon = sc.nextInt();
        if(mon<0||mon>12){
            System.out.print("Enter valid month : ");
            mon = sc.nextInt();
        }

        System.out.print("Enter year : ");
        int year = sc.nextInt();
        if(year<0){
            System.out.print("Enter valid year : ");
            year = sc.nextInt();
        }

        System.out.print("Enter hour : ");
        int hour = sc.nextInt();
        if(hour<0||hour>24){
            System.out.print("Enter valid hour : ");
            hour = sc.nextInt();
        }

        System.out.print("Enter minutes : ");
        int min = sc.nextInt();
        if(min<0||min>60){
            System.out.print("Enter valid minutes : ");
            min = sc.nextInt();
        }

        System.out.print("Enter seconds : ");
        int sec = sc.nextInt();
        if(sec<0||sec>60){
            System.out.print("Enter valid seconds : ");
            sec = sc.nextInt();
        }

        D.setDate(day);
        D.setMonth(mon-1);
        D.setYear(year-1900);
        D.setHours(hour);
        D.setMinutes(min);
        D.setSeconds(sec);

        SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy");
        String str1 = s1.format(D);
        System.out.print("Date in dd/MM/yyyy format : "+str1);
        System.out.println();

        SimpleDateFormat s2 = new SimpleDateFormat("MM/dd/yyyy");
        String str2 = s2.format(D);
        System.out.print("Date in MM/dd/yyyy format : "+str2);

        System.out.println();
        SimpleDateFormat s3 = new SimpleDateFormat("yyyy/MM/dd");
        String str3 = s3.format(D);
        System.out.print("Date in yyyy/MM/dd format : "+str3);

        System.out.println();
        SimpleDateFormat s4 = new SimpleDateFormat("HH:mm:ss");
        String str4 = s4.format(D);
        System.out.print("Time in HH:mm:ss format : "+str4);

        System.out.println();
        SimpleDateFormat s5 = new SimpleDateFormat("hh:mm:ss");
        String str5 = s5.format(D);
        System.out.print("Time in hh:mm:ss format : "+str5);

        System.out.println();
        SimpleDateFormat s6 = new SimpleDateFormat("HH:mm");
        String str6 = s6.format(D);
        System.out.print("Time in HH:mm format : "+str6);


    }
}