package anshuKJun20;
public class ArmstrongNumber {
  void checkArmstrong(int number) {
	  int actualnumber = number;
	  double result =0;
	  while( actualnumber != 0)
	  {
		  int remainder = actualnumber%10;
		   result += Math.pow(remainder,3);
		   actualnumber = actualnumber/10;
	  }
	  if(result == number)
	  {
		  System.out.println(number+" is armsstrong number ");
	  }
	  else
	  {
		  System.out.println(number+" is not a armstrong number ");
	  }
  }
  public static void main(String[] args) {
	  ArmstrongNumber armsstrongnumber = new ArmstrongNumber();
	  armsstrongnumber.checkArmstrong(153);
}
  }