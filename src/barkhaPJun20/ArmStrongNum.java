package barkhaPJun20;

public class ArmStrongNum {
	
	void findArmStrongNum(int originalNumber) {
		int number=originalNumber;
		int sum=0;
		while(number>0) {
			int lastnum=number%10;           //3
			sum=sum+(lastnum*lastnum*lastnum);
			number=number/10;               //51
		}	              
		if (sum==originalNumber)
			System.out.println("Number "+originalNumber+" is an Armstrong number");	          
		else
			System.out.println("Number "+originalNumber+" is not an Armstrong number");	                			
	}	
	public static void main(String[] args) {
		ArmStrongNum armStrongNum=new ArmStrongNum();
		int num=153;
		int num1=15622;
		armStrongNum.findArmStrongNum(num);
		armStrongNum.findArmStrongNum(num1);
	}
}	
