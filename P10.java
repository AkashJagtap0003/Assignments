class P10{
	public static void main(String[] args){
	char a = 69;
		for(int i=1;i<=5;i++){
			for(int k=4;k>=i;k--){
				System.out.print(" ");
			}
				
			for(int j=0;j<=i-1;j++){
				System.out.printf("%c",a+j);
				System.out.print(" ");
			}
			a--;
			
			System.out.println();
		}
		
		
	}
}