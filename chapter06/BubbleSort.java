public class BubbleSort{
	public static void main(String[] args){
		int arr[] = {22,88,66,15,2};
		int temp = 0;
		for(int j = 0; j < 4; j++){
			for(int i = 0; i < (4 - j); i++){
			
			if(arr[i] > arr[i + 1]){
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t" );
			
		}
		
	}
}