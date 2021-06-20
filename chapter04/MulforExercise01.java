import java.util.Scanner;
public class MulforExercise01{
	public static void main(String[] args){
		//±àÐ´Hello world³ÌÐò
	double sum = 0;
	for (int i = 1; i <= 5; i++){
		System.out.println("ÊäÈë" + 1 + "°àµÚ" + i + "¸öÍ¬Ñ§µÄ³É¼¨");
		Scanner myScanner = new Scanner(System.in);
		double score = myScanner.nextDouble();
		sum += score;
	System.out.println("×Ü³É¼¨=" + sum + "Æ½¾ù³É¼¨" + (sum / 5.0));
	}		
	}	
}