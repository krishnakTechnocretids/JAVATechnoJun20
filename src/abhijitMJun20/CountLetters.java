package abhijitMJun20;

public class CountLetters {
	void charfind(String input)
	{ 
		 int count=0,count1=0,count2=0,count3=0;
		for(int index=0;index<input.length();index++) {
		if(Character.isUpperCase(input.charAt(index))){
		count++;
		}
		else if(Character.isLowerCase(input.charAt(index))) {
			count1++;
		}
		else if(Character.isDigit(input.charAt(index))) {
		  count2++;	
		}
		else {count3++;}
		}
		System.out.println("In "+input+" --Count of upper case is :"+count);
		System.out.println("In "+input+" --Count of lower case is :"+count1);
		System.out.println("In "+input+" --Count of digits is :"+count2);
		System.out.println("In "+input+" --Count of Special char is :"+count3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountLetters countletters=new CountLetters();
		String name="1rRpd3F9#K(E";
		countletters.charfind(name);

	}
}
