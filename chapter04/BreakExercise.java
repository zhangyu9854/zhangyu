public class BreakExercise{
	public static void main(String[]  args){
		//��дHello world����
		int sum = 0;
		for (int i = 1;i <= 100; i++){
			sum += i;
			if (sum > 20){
				System.out.println("��>20" + i);
				break;
			}
		}
	}
}