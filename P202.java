class P202{
	public static void main(String[] args){
		
		for(int i=1;i<=9;i++){
			for(int k=8;k>=i;k--){
				System.out.print(" ");
			}
			int a=1;
			for(int j=1;j<=i;j++){
				System.out.print(a+" ");
				a++;
			}
			
			System.out.println();
		}
		
		
	}
}