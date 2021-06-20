import java.util.Scanner;
public class switch01{
	public static void main(String[] args){
		//±àÐ´Hello world³ÌÐò
		Scanner myScanner = new Scanner(System.in);
   	   	System.out.println("SHU RU");
   		char summer = myScanner.next().charAt(0);
		
		switch (summer){
			case 'a':
			{System.out.println("A");}
			break;
			case 'b':
			{System.out.println("B");}
			break;
			case 'c':
			{System.out.println("C");}
			break;
			default:
			{System.out.println("other");} 
			break;
		}
		System.out.println("Hello,world");
	}
}