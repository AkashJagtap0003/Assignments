public class Assignment09 {
    public static void main(String[] args) {
       

        //Byte instance to byte
        byte a = 5;
        Byte z = new Byte(a);
        byte b = Byte.valueOf(a);
        System.out.println("Byte instance to byte : "+b);

        //Byte instance to short
        short c = z.shortValue();
        System.out.println("Byte instance to short : "+c);

        long e = z.longValue();
        System.out.println("Byte instance to long : "+e);

        int f = z.intValue();
        System.out.println("Byte instance to int : "+f);

        double g = z.doubleValue();
        System.out.println("Byte instance to double : "+g);

        float h = z.floatValue();
        System.out.println("Byte instance to float : "+h);
  }
}
