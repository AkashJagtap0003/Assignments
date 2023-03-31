public class Assignment28 {
    public static void main(String[] args) {
        double value = 3.14;
        Double doubleValue = Double.valueOf(value);
System.out.println("Double instance: " + doubleValue);

String strValue = "3.14";
 doubleValue = Double.valueOf(strValue);
System.out.println("Double instance: " + doubleValue);


long longValue = Double.doubleToLongBits(value);

String binaryString = Long.toBinaryString(longValue);
System.out.println("Binary value: " + binaryString);

String octalString = Long.toOctalString(longValue);
System.out.println("Octal value: " + octalString);

String hexString = Long.toHexString(longValue);
System.out.println("Hexadecimal value: " + hexString);

    }
}
