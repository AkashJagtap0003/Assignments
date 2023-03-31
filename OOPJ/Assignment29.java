public class Assignment29 {
    public static void main(String[] args) {
        Double d = 458.002;

        byte b = d.byteValue();
        System.out.println("Byte value: " + b);

        // Convert to short
        short s = d.shortValue();
        System.out.println("Short value: " + s);

        int i = d.intValue();
        System.out.println("Int value: " + i);

        long l = d.longValue();
        System.out.println("Long value: " + l);

        float f = d.floatValue();
        System.out.println("Float value: " + f);

        double db = d.doubleValue();
        System.out.println("Double value: " + db);
    }
}
    
