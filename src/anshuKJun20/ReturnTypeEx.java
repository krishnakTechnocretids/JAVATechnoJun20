package anshuKJun20;

public class ReturnTypeEx {
	int add (int number1, int number2) {
		return number1+number2;
	}
	int sub(int number1, int number2) {
		return number1-number2;
	}
	int mutliply(int number1, int number2) {
		return number1*number2;
	}
	int divide(int number1, int number2) {
		return number1/number2;
	}
  public static void main(String[] args) {
	  ReturnTypeEx processcalculation = new ReturnTypeEx();
	 
	  System.out.println("Total sum : "+(processcalculation.add(20,30)+processcalculation.sub(40,10)+processcalculation.mutliply(30,21)+processcalculation.divide(21,7)));
  }
	

}
