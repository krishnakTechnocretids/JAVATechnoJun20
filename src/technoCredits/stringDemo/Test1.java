package technoCredits.stringDemo;

public class Test1 {
	int getFreqCount(String input, char ch) {
		char[] chArray = input.toCharArray();
		for(int index=0;index<chArray.length;index++) {
			System.out.println(chArray[index]);
		}
		return 0;
	}
	
	int getFreqCount1(String input, char ch) {
		for(int index=0;index<input.length();index++) {
			System.out.println(input.charAt(index));
		}
		return 0;
	}
	
	int getFreqCount2(String input, char ch) {
		String[] arr = input.split("");
		for(int index=0;index<arr.length;index++) {
			System.out.println(arr[index]);
		}
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		new Test1().getFreqCount2("technocredits", 'c');
	}
}
