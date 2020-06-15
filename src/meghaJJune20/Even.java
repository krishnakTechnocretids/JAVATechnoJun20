package meghaJJune20;

public class Even {
	
	void evenNumbers(int startindex, int endindex)
	{
		System.out.println(" Numbers are ");
		for(int i=startindex; i<=endindex;i++)
		{
			if(i%2==0)
			{
				
				System.out.println(+i);
			}
			
		}
	}
	public static void main(String[] args)
	{
		Even even = new Even();
		even.evenNumbers(10,15);
	}

}
