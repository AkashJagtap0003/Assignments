public class Assignment014 {
    public static void main(String[] args) {


        Short a = new Short("45");

        long b = a.longValue();
        System.out.println("Short instance to long : "+b);

        double c = a.longValue();
        System.out.println("Short instance to double : "+c);

        short d = a.shortValue();
        System.out.println("Short instance to short : "+d);

        int e = a.intValue();
        System.out.println("Short instance to int : "+e);

        float f = a.floatValue();
        System.out.println("Short instance to  float : "+f);
 }
}
