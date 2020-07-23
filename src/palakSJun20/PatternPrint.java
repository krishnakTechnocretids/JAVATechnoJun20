/* WAP to print below pattern :
$
$ $
$ $ $
$ $ $ $
$ $ $ $ $  And 
1 
1 3 
1 3 5 
1 3 5 7 
1 3 5 7 9 

*/
package palakSJun20;

public class PatternPrint {

	void dollarPrintInIncrementOrder() {
		for (int index = 1; index <= 5; index++) {
			for (int innerindex = 1; innerindex <= index; innerindex++) {
				System.out.print("$ ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		PatternPrint patternPrint = new PatternPrint();
		patternPrint.dollarPrintInIncrementOrder();
		patternPrint.oddPattern();
	}
	
	void oddPattern() {
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((2*j)-1 + " ");
			}
			System.out.println("");
		}
	}

}
