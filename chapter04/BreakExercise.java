public class BreakExercise{
	public static void main(String[]  args){
		//±‡–¥Hello world≥Ã–Ú
		int sum = 0;
		for (int i = 1;i <= 100; i++){
			sum += i;
			if (sum > 20){
				System.out.println("∫Õ>20" + i);
				break;
			}
		}
	}
}