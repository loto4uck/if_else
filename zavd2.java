package if_else;

import java.util.Scanner;

public class zavd2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        if (n % 400 == 0){
            System.out.println("Yes");
        }else{
            if(n % 100 == 0){
                System.out.println("No");
            }else{
                if (n % 4 == 0){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }

}
