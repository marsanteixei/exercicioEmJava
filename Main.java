import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,x;
		Scanner sc = new Scanner(System.in);
		System.out.println("entre com um numero inteiro");
		num=sc.nextInt();
		sc.close();
		Fatorial fat = new Fatorial();
		x=fat.calcFatorial(num);
		System.out.println("fatorial de "+ num + " é "+ x);
	}     
}
