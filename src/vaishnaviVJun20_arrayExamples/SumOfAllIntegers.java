package vaishnaviVJun20_arrayExamples;

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
		if(temp!= null)
			sum += Integer.parseInt(temp);
		
		System.out.println("Addition is : " +sum);
	}

	public static void main(String[] args) {
		new SumOfAllIntegers().findSumOfAllIntegersInGivenString("J7yu91y81h1h8j41b756j3jjb6");
	}

}
