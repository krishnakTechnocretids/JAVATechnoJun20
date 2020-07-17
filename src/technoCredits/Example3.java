package technoCredits;


public class Example3 {
	// Ad3P2Q9
	void diplay(String input) {
		int sum = 0;
		for(int index=0;index<input.length();index++) {
			sum += input.charAt(index);
		}
		System.out.println(sum); // 65 + 66 + 67 = 198
	}
	
	void m1() {
		//int temp = 'A';
		//System.out.println(temp);
		
		for(char ch='A'; ch<='Z';ch++) {
			int temp = ch;
			System.out.println(ch + ":" + temp);
		}
		
		for(char ch='a'; ch<='z';ch++) {
			int temp = ch;
			System.out.println(ch + ":" + temp);
		}
		
		for(char ch='0'; ch<='9';ch++) {
			int temp = ch;
			System.out.println(ch + ":" + temp);
		}
		
		int temp1 = '}';
		System.out.println("}" + temp1);
		
		char ch1 = 91;
		System.out.println(ch1);
		
		for(int num=91; num<=96;num++) {
			char ch2 = (char)num;
			System.out.println(num + ":" + ch2);
		}
	}
	
	
	public static void main(String[] args) {
		//new Example3().diplay("ABC");
		new Example3().m1();
	}
}
