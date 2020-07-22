package technoCredits.exceptionExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		while(cnt<=3) {
		try {
			int x = Integer.parseInt(sc.next());
			System.out.println(x);
			cnt++;
		}catch(NumberFormatException ie) {
			System.out.println("In catch");
		}
	}
	}
}
