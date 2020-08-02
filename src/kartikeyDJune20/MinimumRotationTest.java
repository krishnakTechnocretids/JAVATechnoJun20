package kartikeyDJune20;

public class MinimumRotationTest {
	public static void main(String[] args) {
		String str1= "abcdef";
		String str2= "defabc";
		int count=0;
		for(int index=0;index<str1.length();index++) {
			if(!str1.equals(str2)) {
			str1=str1.charAt(str1.length()-1)+str1.substring(0,str1.length()-1);
			count++;
			}
			else
				break;			
		}
		System.out.println(count +": no. of roation is required to match");
		
		
		//char[] arr1=str1.toCharArray();
		//char[] arr2=str2.toCharArray();
		
}
}