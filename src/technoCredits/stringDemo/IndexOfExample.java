package technoCredits.stringDemo;

public class IndexOfExample {
	static void printIndex() {
		String name = "technocredits";
		for(int index=0;index<name.length();index++) {
			char ch = name.charAt(index);
			System.out.println(ch + ":" + name.indexOf(ch));
		}
	}
	
	void printIndexOfChar(String input) {
		System.out.println("M :" + input.indexOf('M'));
		System.out.println("a :" + input.indexOf('a'));
		System.out.println("u :" + input.indexOf('u'));
		System.out.println("l :" + input.indexOf('l'));
		System.out.println("i :" + input.indexOf('i'));
		System.out.println("k :" + input.indexOf('k'));
		System.out.println("z :" + input.indexOf('z')); // -1
	}
	
	public static void main(String[] args) {
		IndexOfExample indexOfExample = new IndexOfExample();
		String name = "Maulik";
		//indexOfExample.printIndexOfChar(name);
		IndexOfExample.printIndex();
	}
}
