package archanaNJun20;

public class TextExam4 {
	
	static void findSecondMax(int[] number)
	{
		int FirstMax=0;
		int SecondMax=0;
		for(int index=0;index<number.length;index++)
		{
			if(number[index]>FirstMax )
			{
				SecondMax=FirstMax;
				FirstMax=number[index];
				
			}
			
			
				
		}
		System.out.println(SecondMax);
	}

	public static void main(String[] args) {
		
		int[] number= {10,33,56,43,99,21};
		TextExam4.findSecondMax(number);
	}

}
