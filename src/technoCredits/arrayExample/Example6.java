package technoCredits.arrayExample;


public class Example6 {

	void findCharFreq(String name, char ch) {
		int count = 0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index) == ch)
				count++;
		}
		System.out.println(name + " and freq of " + ch + " is " + count);
	}
	
	void findAllCharFreq(String name) {
		for(int charIndex=0;charIndex<name.length();charIndex++) {	
			findCharFreq(name, name.charAt(charIndex));
		}
		System.out.println("==========================");
	}
	
	void findAllCharFreqFromArray(String[] input) {
		for(int index=0;index<input.length;index++) {
			findAllCharFreq(input[index]);
		}
	}
	
	public static void main(String[] args) {
		String name = "technocredits";
		char ch = 't';
		Example6 example6 = new Example6();
		String[] names = {"Techno","Krishna","Harsh"};
		example6.findAllCharFreqFromArray(names);
	}
}
