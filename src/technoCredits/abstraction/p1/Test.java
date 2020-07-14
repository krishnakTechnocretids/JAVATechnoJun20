package technoCredits.abstraction.p1;

public class Test {
	
	Test(){
		this(10); //2
		System.out.println(1); // 6
	} //7
	
	Test(int x){ //3
		System.out.println(x); //4
	} //5
	
	public static void main(String[] args) {
		new Test(); // 1 // 7
	}
}
