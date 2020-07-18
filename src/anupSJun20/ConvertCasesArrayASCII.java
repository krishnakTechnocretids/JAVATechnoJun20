package anupSJun20;

import java.util.Arrays;

/*WAP to convert case in all elements of array. 
Input : 
String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};

Output:
array = {"aAvRUTI", "nIkHIL","aDItI", "maHESH","aRCHAna","JAgaDEESH"};*/

public class ConvertCasesArrayASCII {
	
	String[] convertCasesASCII(String[] input) {
		String[] output = new String[input.length];
		for(int index = 0;index<input.length;index++) {
			output[index] = "";
			for(int innerindex = 0;innerindex<input[index].length();innerindex++) {
				char ch = input[index].charAt(innerindex);
				if(ch >= 65  && ch <= 90) {
					ch+=32;
					output[index]+= ch;
				}
				else if(ch >= 97  && ch <= 122) {
					ch-=32;
					output[index]+= ch;
				}
				else {
					output[index]+= ch;
				}
			}
		}
		
		return output;
	}
	public static void main(String[] args) {
		String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};
		System.out.println("The input array is " + Arrays.toString(array));
		ConvertCasesArrayASCII convertCasesArrayASCII = new ConvertCasesArrayASCII();
		System.out.println("The output array is " + Arrays.toString(convertCasesArrayASCII.convertCasesASCII(array)));
		
	}

}
