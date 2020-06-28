package technoCredits.arrayExample;


public class Example8 {

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
			String name = input[index];
			for(int charIndex=0;charIndex<name.length();charIndex++) {	
				char ch = name.charAt(charIndex);
				int count = 0;
				for(int index1=0;index1<name.length();index1++) {
					if(name.charAt(index1) == ch)
						count++;
				}
				System.out.println(name + " and freq of " + ch + " is " + count);
			}
			System.out.println("==========================");
		}
	}
	
	public static void main(String[] args) {
		String name = "technocredits";
		char ch = 't';
		Example8 example6 = new Example8();
		String[] names = {"Techno","Krishna","Harsh"};
		example6.findAllCharFreqFromArray(names);
	}
}
