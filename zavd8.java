package if_else;

import java.util.Scanner;

public class zavd8 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = x1 - x2;
		int y3 = y1 - y2;
		if (Math.pow(x3,2) == Math.pow (y3,2)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
