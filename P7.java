class P7{
	public static void main(String[] args){
		
		for(int i=1;i<=5;i++){
			for(int k=4;k>=i;k--){
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