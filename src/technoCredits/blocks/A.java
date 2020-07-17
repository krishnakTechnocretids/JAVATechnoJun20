package technoCredits.blocks;

public class A {

	{
		System.out.println("GM - Nonstatic Block - DB Connect"); //1 //8
	}
	
	{
		System.out.println("GM - Nonstatic Block - Excel Sheet"); //2 //9
	}
	
	A(){
		super();
		System.out.println(1); //3
	}
	
	A(int x){ //7
		System.out.println(2); //10
	}
	
	A(String x){
		System.out.println(3);
	}
	
	
	public static void main(String[] args) {
		A a1 = new A(); //0 //4
		System.out.println("In main"); //5
		A a2 = new A(10); //6 //11
	}
}
