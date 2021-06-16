public class Homework{
	public static void main(String[] args){
		//±‡–¥Hello world≥Ã–Ú
		int arr[] ={10,12,45,90};
		int a;
		int temp[] = new int[arr.length + 1];
		for(int i = 0;i < arr.length;i++){
			
			temp[i + 1] = arr[i];

		}
		temp[0]= 23;
		for(int i = 0;i < temp.length - 1;i++){
		 	if(temp[i] > temp[i + 1]){
		 		a = temp[i + 1];
		 		temp[i + 1] = temp[i];
		 		temp[i] = a;
		 	}
		}
		for(int i = 0;i < temp.length;i++){
			System.out.println(temp[i]);
		}
		
	}
}