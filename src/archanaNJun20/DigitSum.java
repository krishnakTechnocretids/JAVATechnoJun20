package archanaNJun20;

public class DigitSum {
	static void digitSum(String input)
	{
		int sum=0;
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			String number=String.valueOf(ch);
			if(Character.isDigit(ch))
			{
				int num=Integer.parseInt(number);

				sum=sum+num;
			}
		}
		System.out.println("sum of digit is : "+sum);
	}

	public static void main(String[] args) {

		String input="1Hh9PR34QP";
		DigitSum.digitSum(input);
	}

}
