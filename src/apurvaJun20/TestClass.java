package apurvaJun20;

public class TestClass {

	void findFrequency(String Input) {
		Input=Input.toLowerCase().replace("_","");
		
		System.out.println(Input);
		String[] words=Input.split(" ");
		System.out.println("Frequency of Every Word");
		for(int outerIndex=0; outerIndex<words.length; outerIndex++) {
			int count=1;
			if(!words[outerIndex].equals("*")) {
				for(int innerIndex=outerIndex+1;innerIndex<words.length;innerIndex++) {
					if(words[outerIndex].equals(words[innerIndex])) {
					count++;
					words[innerIndex]="*";
					}
					
				}
				System.out.println(words[outerIndex] + "->" + count);
			}
						
		}
		
		
	}
	
	public static void main(String[] args) {
	String Input = "Tech_no Hi T_EchNo H_I Tech hi_";
	TestClass testClass = new TestClass();
	testClass.findFrequency(Input);
		
		
	}
}