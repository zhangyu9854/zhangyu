import java.util.Scanner;
public class if05{
	public static void main(String[] args){
		//��д��Ʊ����
		//�����·ݺ�����
	Scanner myScanner = new Scanner(System.in);
   	System.out.println("�����·�");
   	int month = myScanner.nextInt();
   	System.out.println("����");
   	int age = myScanner.nextInt();
   	if (month >= 4 && month <= 10){
   		if (age >= 40) 
   		{
   				System.out.println("���");
   			}
   		else{
   			System.out.println("��Ʊ");
   		}
   	}
   	else {System.out.println("Hello,world");

   	
   	}



		
	}
}