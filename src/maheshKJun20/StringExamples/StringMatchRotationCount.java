package maheshKJun20.StringExamples;

public class StringMatchRotationCount {
	
	void displayCountofRotationToMatch(String input1, String input2) {
		System.out.println("Input1: " + input1 + "\nInput2: " + input2);
		int count = 0;
		if (input1.length() == input2.length()) {
			while (!input1.equals(input2)) {
				if (count >= input1.length()-1) {
					System.out.println("String cannot be matched with all possible rotation");
					break;
				}else
					count ++;
				input1 = input1.charAt(input1.length()-1) + input1.substring(0, input1.length()-1);
			}
			if (count<=input1.length()-1)
				System.out.println("Number of Rotation required to Match  strings: " + count);
		}else {
			System.out.println("Two Strings cannot be matched as lenght is not equal");
		}
	}
	
	public static void main(String[] args) {
		String input1 = "abcdef";
		String input2 = "defabc";
		new StringMatchRotationCount().displayCountofRotationToMatch(input1, input2);
	}

}
