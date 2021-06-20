public class ArrayReduce{
	public static void main(String[] args){
		//编写Hello world程序
	int arr[] = {1,2,3};//创建的数组
	int arrNew[] = new int[arr.length + 1];
	for (int i = 0; i <= arr.length; i++){
			arrNew [i] = arr [i];
	}
	arrNew[arrNew.length - 1] = 4;
	arr = arrNew;
	System.out.println("=====扩容后的元素====");	
	for(int i = 0; i < arr.length; i++){
		System.out.println(arr[i] + "/t");
	}
	}
}