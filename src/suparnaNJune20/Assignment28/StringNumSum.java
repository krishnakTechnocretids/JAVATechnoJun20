package suparnaNJune20.Assignment28;

public class StringNumSum {

	void findSum(String str)
	{
		int  digitSum=0;
		for (int index =0; index < str.length(); index ++)
		{
			
			if (str.charAt(index) >= 48 && str.charAt(index) <=57)
			{
								digitSum += (str.charAt(index)-'0');
			}
		}
		System.out.println("sum =" +digitSum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Input String : J7u9y8h1h8j4b7j3j6");
		new StringNumSum().findSum("J7u9y8h1h8j4b7j3j6");
	}

}