import java.util.Scanner;
public class if01{
	public static void main(String[] args){
		//��д�����������˵����䣬�����ͬ־�������18��
		//����������������18��Ҫ���Լ���Ϊ�����ͼ족
		Scanner myScanner = new Scanner (System.in);
		System.out.println("����������");
		int age = myScanner.nextInt();

		//�������������
		if(age > 18) {
			System.out.println("��Ҫ������");
		}
	}
}