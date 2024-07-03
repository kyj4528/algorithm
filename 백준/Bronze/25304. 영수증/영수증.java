import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tot = sc.nextInt();
		int n = sc.nextInt();
		int comp = 0;
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			comp += a*b;
		}
		System.out.println(comp == tot ? "Yes" : "No");
	}

}