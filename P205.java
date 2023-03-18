class P205{
	public static void main(String[] args){
		int a=9;
		for(int i=1;i<=9;i++){
			for(int k=8;k>=i;k--){
				System.out.print("  ");
			}
			
			for(int j=0;j<=i-1;j++){
				System.out.print(a+j+" ");
				
			}
			a--;
			int b=8;
		    for(int l=i-1;l>=1;l--){
			
				System.out.print(b+" ");
				b--;
			}
			
			System.out.println();
		}
		
		
	}           
}