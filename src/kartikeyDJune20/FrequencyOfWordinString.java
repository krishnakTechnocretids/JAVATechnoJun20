package kartikeyDJune20;


public class FrequencyOfWordinString {
	static void frequencyOfElement(String[] input) {
		System.out.println("Frequency of every word:");
		for(int index=0;index<input.length;index++) {
			
			int cnt=1;
			if(!input[index].equals("**")) {
				
				for(int indexInner=index+1;indexInner<input.length;indexInner++) {
					if(input[index].equals(input[indexInner])) {
						cnt++;
						input[indexInner]="**";					
					}
					
				}
				System.out.println("Frequency of "+input[index]+" --> "+cnt);
			}
		}
		
	}
	public static void main(String[] args) {
		String input= "Tech_no Hi T_EchNo H_I Tech hi_";
		input=input.replace("_", "");
		input=input.toLowerCase();
		System.out.println(input);
		String[]  inputArray=input.split(" ");
		FrequencyOfWordinString.frequencyOfElement(inputArray);
		
	}

}
