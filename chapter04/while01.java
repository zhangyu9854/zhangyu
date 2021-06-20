public class while01{
	public static void main(String[] args){
		//编写Hello world程序
		int i = 1;
		int a = 3;
		int b = 100;
		
		while (i <= b){
			if (i % a == 0){
			 	System.out.println(i);
			
			}
			i++;//必须放if外

		}
		System.out.println("Hello,world");
	}
}