public class Assignment016 {
    public static void main(String[] args) {

        int a = 123;
        String b = String.valueOf(a);
        System.out.println("Integer to string : "+b);

        int c = new Integer(a);
        System.out.println("Integer to integer instance : "+c);

        String d = new String(b);
        int e = new Integer(d);
        System.out.println("string instance to integer instance : "+e);

        String f = Integer.toBinaryString(a);
        System.out.println("Integer to binary string : "+f);

        String g = Integer.toOctalString(a);
        System.out.println("Integer to octal string : "+g);

        String h = Integer.toHexString(a);
        System.out.println("Integer to hex string : "+h);

 
    }
    }
