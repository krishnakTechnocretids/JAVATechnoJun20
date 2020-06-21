package technoCredits;

public class LoopEx1 {

	void display(int count,String name) {
		System.out.println(name);
		for(int index=1;index<=count;index++) {
			System.out.println(name);
		}
	}
	
	void displayWithWhile(int count,String name) {
		System.out.println(name);
		int index=1;
		while(index<=count) {
			System.out.println(name);
			index++;
		}
	}
	
	void displayWithDoWhile(int count,String name) {
		
		int index=1;
		do {
			System.out.println(name);
			index++;
		}while(index<=count);
	}
	
}
