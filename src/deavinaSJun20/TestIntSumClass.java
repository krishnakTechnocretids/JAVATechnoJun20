package deavinaSJun20;
/*String input = "1Hh9PR34QP";
Hint : 1+9+3+4 [all digits]
output : 178*/
public class TestIntSumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="1Hh9PR34QP";

new TestIntSumClass().intSumClass(name);
	}
  void intSumClass(String name) {
	  int sum=0;
	  for(int i=0;i<name.length();i++) {
		  if(Character.isDigit(name.charAt(i)))
		  {String ch=String.valueOf(name.charAt(i));
			sum=sum+Integer.parseInt(ch)  ;
			  
			  
		  }
	  }
	  System.out.println(sum);
  }
}
