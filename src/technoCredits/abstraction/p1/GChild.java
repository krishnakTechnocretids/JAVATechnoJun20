package technoCredits.abstraction.p1;

public class GChild extends Child{

	public GChild() {
		super();//2
		System.out.println("3"); // 7
	}
	
	public static void main(String[] args) {
		Parent parent = new Child(); //1 //8
	}
}
