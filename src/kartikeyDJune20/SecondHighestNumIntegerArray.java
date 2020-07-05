package kartikeyDJune20;

public class SecondHighestNumIntegerArray {
	
	static void secondHighest(int[] input) {
		
		int highest=input[0];
		int secHighest=input[0];
		for(int index=1;index<input.length;index++) {
			if(input[index]>highest ) {
				highest=input[index];		
			}
		}
		for(int index=1;index<input.length;index++) {
			if(input[index]>secHighest && input[index]!= highest) {
				secHighest=input[index];
			}
		}	
	//	System.out.println(secHighest);	
		System.out.println(highest);
	}
public static void main(String[] args) {
	int[] number = {10,33,56,43,99,21};
	secondHighest(number);
	
}
}
