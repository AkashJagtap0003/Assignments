class Assignment6{
  public static void main(String[] args) {
    boolean a = true;
    boolean b = false;
    String x = String.valueOf(a);
    String y = String.valueOf(b);
    System.out.println("boolean to string : "+x);
    System.out.println("boolean to string : "+y);
    Boolean c =  Boolean.valueOf(b);
    Boolean d =  Boolean.valueOf(a);
    System.out.println("Boolean instance : "+c);
    System.out.println("Boolean instance : "+d);
    a = Boolean.parseBoolean(y);
    b = Boolean.parseBoolean(x);
    System.out.println("String to boolean"+a);
    System.out.println("String to boolean"+b);
    Boolean g =  Boolean.valueOf(x);
    Boolean h =  Boolean.valueOf(y);
    System.out.println("String to Boolean : "+g);
    System.out.println("String to Boolean : "+h);


  }
}