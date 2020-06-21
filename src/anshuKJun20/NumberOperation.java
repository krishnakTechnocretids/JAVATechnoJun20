package anshuKJun20;

import java.util.Scanner;

public class NumberOperation {
public static void main(String[] args) {
	
	int add = 0;
	
	int index= 0;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Give Number to add");
	int number = scanner.nextInt();
	while(index < 4) {
	if (number>0) {
		add = add + number;
		index++;
	}
	System.out.println(add);;
}
	scanner.close();
}

}
