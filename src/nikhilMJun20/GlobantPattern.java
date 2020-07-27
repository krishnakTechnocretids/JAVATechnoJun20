package nikhilMJun20;

import java.util.Arrays;

public class GlobantPattern {
	void printPattren(String str) {
		for(int index = str.length(); index > 0; index--) {
			System.out.println(str.substring(0,index));
		}
	}
	
	public static void main(String[] args) {
		String str = "Globant";
		new GlobantPattern().printPattren(str);
	}
}
