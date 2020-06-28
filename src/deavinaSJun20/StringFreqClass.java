package deavinaSJun20;
/*a) Word should be compare without case sensitivity.
b) Word should be compare without special character. [use replace method]

Input = "Tech_no Hi T_EchNo H_I Tech hi_"
output : 
Frequency of every word:
              techno -> 2
              hi -> 3
              tech -> 1*/

public class StringFreqClass {

	public static void main(String[] args) {
		String input = "Tech_no Hi T_EchNo H_I Tech hi_";
		System.out.println("Entered String : "+input);
		input = input.toLowerCase().replaceAll("_", "");
		new StringFreqClass().stringFreq(input);
	}

	void stringFreq(String input) {
		String[] Arr = input.split(" ");
		System.out.println("Frequency of every word : ");
		for (int i = 0; i < Arr.length; i++) {
			int count = 1;
			if(!Arr[i].equals("*")) {
				for (int j = i + 1; j < Arr.length; j++) {
					if (Arr[i].equals(Arr[j])) {
						count++;
						Arr[j] = "*";
					}
				}
				System.out.println(Arr[i]+" --> "+count);
			}
			
		}
	}
}
