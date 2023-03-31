package Day3;


import java.util.Date;

 class Assignment1 {
    public static void main(String[] args) {
        Date date = new Date();
        int day = date.getDate();
        int month = date.getMonth() + 1;
        int year = date.getYear() + 1900;
        System.out.println(day+" / "+month+" / "+year);
    }
}
