class Assignment25 {

    public static void main(String[] args) {
        float a = 58945161.00f;
        Float b = new Float(a);

        byte c = b.byteValue();
        System.out.println("Float to byte : "+c);

        short d = b.shortValue();
        System.out.println("Float to short : "+d);

        int e = b.intValue();
        System.out.println("Float onto int : "+e);

        long f = b.longValue();
        System.out.println("Float to long : "+d);

        float g = b.floatValue();
        System.out.println("Float to float : "+g);

        double h = b.doubleValue();
        System.out.println("Float to double : "+h);
    }
}
