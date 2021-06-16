public class OverLoad{
	public static void main(String[] args){
		//±àÐ´Hello world³ÌÐò
		Methods cd = new Methods();
		cd.met(10,20.5);


		
	}
}
class Methods{
	public void met(int n1 , int n2){
		if(n1 > n2){
			System.out.println(n1);
		}else{
			System.out.println(n2);
		}
	}
	public void met(double n1,double n2){
		if(n1 > n2){
			System.out.println(n1);
		}else{
			System.out.println(n2);
		}
	}
	public void met(double n1,double n2,double n3){
		if(n1 > n2){
			if(n1 > n3){
				System.out.println(n1);
			}else{
				System.out.println(n3);
			}
		}else{
			if(n2 > n3){
				System.out.println(n2);
			}else{
				System.out.println(n3);
			}
		}
	}
}