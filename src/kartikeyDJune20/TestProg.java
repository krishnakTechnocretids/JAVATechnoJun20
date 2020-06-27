package kartikeyDJune20;

import java.util.Scanner;

public class TestProg {
 public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	int sum=0;
	if(scanner.nextInt()<0) {
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		int z=scanner.nextInt();
		sum=x+y+z;
		
	}
	System.out.println(sum);

	scanner.close();
}
}
