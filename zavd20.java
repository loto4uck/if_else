package if_else;

import java.util.Scanner;

public class zavd20 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if ((n == 1) || (n % 10 == 1)) {
			System.out.println(n + " " + "korova");
		}else {
			if ((n % 10 == 2) || (n % 10 == 3) || (n % 10 == 4)) {
				System.out.println(n + " " + "korovy");
			}else {
				System.out.println(n + " " + "korov");
			}
			}
		}
		}


