package vaishnaviVJun20_arrayExamples;

//WAP to sum all the numbers in given string.
//Example: P71Rr29T2E in this string consider 71 as one number and not 7 and 1

public class SumOfAllIntegers {
	
	void findSumOfAllIntegersInGivenString(String str) {
		String temp = "";
		int sum = 0;
		for(int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))){
				temp = temp + str.charAt(index);
			}
			else {
				if(temp.length()!=0) {
				   sum += Integer.parseInt(temp);
				   temp = "";
				}
			}			
		}
		if(temp.length()!=0)
			sum += Integer.parseInt(temp);
		
		System.out.println("Addition is : " +sum);
	}

	public static void main(String[] args) {
		SumOfAllIntegers sumOfAllIntegers = new SumOfAllIntegers();		
		sumOfAllIntegers.findSumOfAllIntegersInGivenString("P71Rr29T2E");
		sumOfAllIntegers.findSumOfAllIntegersInGivenString("P6Rr29T2E3");
	}

}
