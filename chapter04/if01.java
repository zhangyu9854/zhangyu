import java.util.Scanner;
public class if01{
	public static void main(String[] args){
		//编写：可以输入人的年龄，如果该同志年龄大于18，
		//输出：“你年龄大于18，要对自己行为负责。送检”
		Scanner myScanner = new Scanner (System.in);
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();

		//接收输入的年龄
		if(age > 18) {
			System.out.println("你要进局子");
		}
	}
}