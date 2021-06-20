public class VarParameterExercise{
	public static void main(String[] args){
		//±àÐ´Hello world³ÌÐò
		HspMethod m = new HspMethod();



		System.out.println(m.showScore("zhngyu",91.5,52.1));
	}
}
class HspMethod{
	public String showScore(String n1,double...n){
		double sum = 0;
		for(int i = 0;i < n.length;i++){
			sum += n[i];
		}
		return n1 + sum  ;

	}
}