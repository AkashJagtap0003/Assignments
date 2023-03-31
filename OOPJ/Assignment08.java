public class Assignment08 {
    public static void main(String[] args) {
        byte a = 5;
        String x = String.valueOf(a);
        System.out.println("byte to string : "+x);
        Byte f = Byte.valueOf(a);
        System.out.println("byte to Byte instance : "+f);
        String s = new String("123");
        Byte b = Byte.valueOf(s);
        System.out.println("String to byte : "+b);
    }
}
