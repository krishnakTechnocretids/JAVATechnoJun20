package technoCredits.blocks;

public class A2 {

	{
		System.out.println("GM - Nonstatic Block - DB Connect"); //1 //8
	}
	
	{
		System.out.println("GM - Nonstatic Block - Excel Sheet"); //2 //9
	}
	
	A2(){
		super();
		System.out.println(1); //3
	}
	
	A2(int x){ //7
		System.out.println(2); //10
	}
	
	A2(String x){
		System.out.println(3);
	}
	
	
	public static void main(String[] args) {
		A2 a1 = new A2(); //0 //4
		System.out.println("In main"); //5
		A2 a2 = new A2(10); //6 //11
	}
}
