class Arrays2{
	//Minimum
	public static void main(String[] args){
		
		int arr[]=new int[]{5,4,9,2,7};
		int min=arr[0];
		for(int i=1;i<5;i++){
				if(arr[i]>min){
					min=min;
				}
				else{
					min=arr[i];
				}
			
		}
		System.out.println(min);
	}
}
