public class Assignment013 {
    public static void main(String[] args) {

        short a = 125;
        String b = String.valueOf(a);
        System.out.println("short to string : "+b);

        Short c = Short.valueOf(a);
        System.out.println("short to short instance : "+c);

        String d = new String(b);
        Short e = new Short(d);
        System.out.println("string instance to short instance : "+e);

    }
}
