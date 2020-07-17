package barkhaPJun20;

import java.util.Arrays;

public class AsciiConcept_ChangeCaseOfString {
	
	String ChangeCaseOfStringElement(String str) {    //"BArKhA"
		String tempStr="";
		for (int index=0; index<str.length(); index++) {
			char ch=str.charAt(index);
			if (ch>='A' && ch<='Z') {
				tempStr+=(char)(ch+32);
			}else if (ch>='a' && ch<='z') {
				tempStr+=(char)(ch-32);
			}
		}
		return tempStr;
	}
	void displayChangedCaseOfStringInArray(String[] input) {
		System.out.println();
		
		for (int index=0; index<input.length; index++) {
			input[index]=ChangeCaseOfStringElement(input[index]);
		}
		System.out.println("Output String Array with Converted Case is: "+Arrays.toString(input));
	}	
	public static void main(String[] args) {
		String [] inputArray= {"BArKhA","mEgha","pIYuSH","tAruN"};
		System.out.println("Input String Array is: "+Arrays.toString(inputArray));
		new AsciiConcept_ChangeCaseOfString().displayChangedCaseOfStringInArray(inputArray);
	}	
}		