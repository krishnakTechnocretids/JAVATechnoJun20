package abhijitMJun20;

public class Checknumber {
	void checkgivennumber(int[] input, int srno) {
	 int count=0;
		for(int index=0;index<input.length;index++) {
			if(input[index]==srno) {
				count++;
				}
		}
		if(count>0) 
			System.out.println("Given number " + srno + " is present in predefined array with frequency " +count );
		    else
	    	System.out.println("Given number " + srno + " is not present in predefined array");
	}
	public static void main(String[] args) {
		Checknumber checknumber= new Checknumber();
		/*Scanner scanner= new Scanner(System.in);
		System.out.println("Enter how many number you want");
		int intnum= scanner.nextInt();
		int[] number= new int[intnum];
		System.out.println("Enter numbers");
		for(int index=0;index<number.length;index++)
		{
			number[index]=scanner.nextInt();
		}
		System.out.println("Enter number which you want search");
		int serchno=scanner.nextInt();
		checknumber.checkgivennumber(number,serchno);
		scanner.close();*/
		int[] number= {2,3,8,6,3,4};
		int a=3;
		checknumber.checkgivennumber(number, a);

	}

}
