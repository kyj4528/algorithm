import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();	// 현재시간 hour
		int m = sc.nextInt();	// 현재시간 minute
		int t = sc.nextInt();	// 요리 전체시간(m)
		int hh = t/60; 			// 요리시간 hour
		int mm = t%60;			// 요리시간 minute
		
		if(m+mm >= 60) {
			h += (m+mm) / 60;
			m = (m+mm) % 60;
		}else {
			m +=mm;
		}
		h = (h+hh) % 24;
	
		System.out.println(h+" "+m);

	}

}