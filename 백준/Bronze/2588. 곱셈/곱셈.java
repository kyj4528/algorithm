import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a*b;
		
		for(int i=0; i<3; i++) {
			System.out.println(a*(b%10));
			b /= 10;
		}
		System.out.println(sum);
	}

}