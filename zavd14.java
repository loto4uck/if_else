package if_else;

import java.util.Scanner;

public class zavd14 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a != 0) {
			System.out.println(-b / a);
		}else {
			if (a == 0) {
				if (b != 0) {
					System.out.println("NO");
				}else {
					System.out.println("INF");
				}
			}
			}
		}

}
