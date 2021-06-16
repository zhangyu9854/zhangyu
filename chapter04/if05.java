import java.util.Scanner;
public class if05{
	public static void main(String[] args){
		//编写出票程序
		//输入月份和年龄
	Scanner myScanner = new Scanner(System.in);
   	System.out.println("输入月份");
   	int month = myScanner.nextInt();
   	System.out.println("年龄");
   	int age = myScanner.nextInt();
   	if (month >= 4 && month <= 10){
   		if (age >= 40) 
   		{
   				System.out.println("半价");
   			}
   		else{
   			System.out.println("退票");
   		}
   	}
   	else {System.out.println("Hello,world");

   	
   	}



		
	}
}