class Q1 {
	public static void main(String args []){
    double B = 10000.8989009;
	double T = 5600.6778;
	double D = B*14/100;
	double P = 7000.3443534546;
	double TD = D * 1.76/100;
	double s = B+T+D+P+TD;
	System.out.println("Salary is "+s);
}
}