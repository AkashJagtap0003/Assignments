public class Assignment020 {
    public static void main(String[] args) {
        long a = 541l;

        String b = String.valueOf(a);
        System.out.println("Long value to string : "+b);

        Long c = new Long(a);
        System.out.println("long to long instance : "+c);

        Long d = new Long(b);
        System.out.println("String instance to long : "+d);

        String f = Long.toBinaryString(a);
        System.out.println("Long to binary string : "+f);

        String g = Long.toOctalString(a);
        System.out.println("Long to octal string : "+g);

        String h = Long.toHexString(a);
        System.out.println("Long to hex string : "+h);
    }
}
