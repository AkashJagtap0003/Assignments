class P9{
	public static void main(String[] args){
		
		for(int i=1;i<=5;i++){
			for(int k=4;k>=i;k--){
				System.out.print(" ");
			}
			char a=65;
			for(int j=0;j<=i-1;j++){
				System.out.print(a+" ");
				a++;
			}
			
			System.out.println();
		}
		
		
	}
}