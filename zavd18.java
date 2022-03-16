package if_else;

import java.util.Scanner;

public class zavd18 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		int c;
		if ( k == n) {
			System.out.println(m * 2);
		}else {
			if (n > k) {
				c = n / k;
				System.out.println((m * 2) * c);
			}
				
			}
		}

}
