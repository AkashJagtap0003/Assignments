class Arrays2{
	//Minimum
	public static void main(String[] args){
		
		int arr[]=new int[]{5,4,9,2,7};
		int max=arr[0];
		for(int i=1;i<5;i++){
				if(arr[i]>max){
					max=max;
				}
				else{
					max=arr[i];
				}
			
		}
		System.out.println(max);
	}
}