import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dice = new int[3];
		for(int i=0; i<3; i++) {
			dice[i] = sc.nextInt();
		}
		Arrays.sort(dice);
		
		int cnt = 0;
		int num = 0;
		for(int i=0; i<dice.length-1; i++) {
			if(dice[i] == dice[i+1]) {
				cnt++;
				num = dice[i];
			}
		}
		if(cnt == 2) {
			num = 10000 + num * 1000;
		}else if(cnt == 1) {
			num = 1000 + num * 100;
		}else {
			num = dice[2] * 100;
		}
		System.out.println(num);

	}

}