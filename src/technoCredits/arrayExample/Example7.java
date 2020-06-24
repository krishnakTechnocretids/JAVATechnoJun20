package technoCredits.arrayExample;

public class Example7 {

	void processData() {
		//n*n = 10*5 = n2 = O(n2)
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=5;j++) {
				//System.out.println(i+"*"+j+" is "+ (i*j));
				System.out.println(i*j);
			}
		}
	}
	
	void m1() {
		// n + n = 2n = n = O(n)
		for(int i=1;i<=10;i++) {
			
		}
		
		for(int j=1;j<=5;j++) {
			
		}
	}
	
	public static void main(String[] args) {
		Example7 example7 = new Example7();
		example7.processData();
	}
}
