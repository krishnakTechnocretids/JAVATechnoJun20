package aasthaJJun20;

/*WAP to convert case in all elements of array. 
Input : 
String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};

Output:
array = {"aAvRUTI", "nIkHIL","aDItI", "maHESH","aRCHAna","JAgaDEESH"};*/

public class InvertTheCaseOfArrayElements {
	//Below method displays the array elements on console
	void diplayArrayElements(String[] input) {
		System.out.print("{  ");
		for (int index = 0; index < input.length; index++)
			System.out.print(input[index] + "  ");
		System.out.print("}");
	}
	
	//Below method converts the case of every character of every array element
	void invertCase(String[] input) {
		System.out.print("Input array : ");
		diplayArrayElements(input);
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			output[index] = "";
			for (int innerIndex = 0; innerIndex < input[index].length(); innerIndex++) {
				if (input[index].charAt(innerIndex) >= 'A' && input[index].charAt(innerIndex) <= 'Z')
					output[index] += (char) (input[index].charAt(innerIndex) + 32);
				else if (input[index].charAt(innerIndex) >= 'a' && input[index].charAt(innerIndex) <= 'z')
					output[index] += (char) (input[index].charAt(innerIndex) - 32);
				else
					output[index] += input[index].charAt(innerIndex);
			}
		}
		System.out.print("\nArray after converting the case: ");
		diplayArrayElements(output);
	}

	public static void main(String[] args) {
		String[] input = { "AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh", "aA$t|-|a" };
		new InvertTheCaseOfArrayElements().invertCase(input);
	}
}
