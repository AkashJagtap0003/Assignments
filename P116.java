class P116{
	public static void main(String[] args){
	int a=3;
		for(int i=1;i<=5;i++){
			for(int k=4;k>=i;k--){
				System.out.print(" ");
			}
				
			for(int j=1;j<=i;j++){
				if(i!=5){
				 if(j==1||j==i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				}
				else{
					System.out.print("*");
				}
			}
			a++;
			System.out.println();
		}
	}
}