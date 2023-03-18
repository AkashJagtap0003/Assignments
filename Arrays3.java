class Arrays3{
	//Search
	public static void main(String[] args){
		
		int arr[]=new int[]{5,4,9,2,7};
		int search=3;
		
		String max= new String();
		for(int i=0;i<5;i++){
				if(arr[i]==search){
					max="present";
					break;
				}
			
		}
		System.out.println(max);
	}
}
