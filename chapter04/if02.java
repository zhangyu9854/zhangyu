import java.util.Scanner;
public class if02{
	public static void main(String[] args){
	//double x = 0.1;
	//double y = 0.5;
	//if (x > 10){
		//if (y < 20){
			//System.out.println( x + y);
		//}
	//}
	//else {System.out.println( x + y);}	
	//}
	int d1 = 20;
	int d2 = 31;
	int num = d1 + d2;
	if (num % 3 == 0 && num % 5 == 0){
		System.out.println("能");
	
	}
	else 
		System.out.println("不能");
   	Scanner myScanner = new Scanner(System.in);
   	System.out.println("输入芝麻信用分");
   	int mark = myScanner.nextInt();
   	if (mark == 100 ){
   		System.out.println("信用极好");
 	}
   	else if (mark > 80 && mark <= 90){
   		System.out.println("信用优秀");
   		}
   	else if (mark >= 60 && mark <= 80){
   		System.out.println("信用一般");
   		}
   	else System.out.println("不及格");
	}
}
