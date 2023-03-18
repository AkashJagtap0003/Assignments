class P206{
	public static void main(String[] args){
		int a=9;
		for(int i=1;i<=9;i++){
				for(int k=2;k<=i;k++){
				System.out.print(" ");
				}
			
			for(int j=1;j<=a;j++){
			
				System.out.print("*");
			}
			for(int j=2;j<=a;j++){
			
				System.out.print("*");
			}
			a--;
			System.out.println();
		}
		
		
	}
}