public class Assignment24 {
    public static void main(String[] args) {
        float a = 541.00f;

        String b = String.valueOf(a);
        System.out.println("float to string : "+b);

        Float c = new Float(a);
        System.out.println("float to Float instance : "+c);

        String h = new String(b);
        Float d = new Float(h);
        System.out.println("String to float instance "+d);

        String g = Float.toHexString(a);
        System.out.println("float to hexadecimal string : "+g);
        

    }
}
