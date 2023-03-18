class P8{
	public static void main(String[] args){
		int a=5;
		for(int i=1;i<=5;i++){
			for(int k=4;k>=i;k--){
				System.out.print(" ");
			}
			
			for(int j=0;j<=i-1;j++){
				System.out.print(a+j+" ");
				
			}
			a--;
			
			System.out.println();
		}
		
		
	}           
}