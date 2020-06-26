package archanaNJun20;

public class IndexOfExample2 {

	void printIndexOf(String input)
	{
		for(int index=0;index<input.length();index++){
			char ch=input.charAt(index);
					if(index==input.indexOf(ch))
					if(input.indexOf(ch)!=input.lastIndexOf(ch)){
						System.out.println(ch +" first index ="+ input.indexOf(ch) +"  Last index ="+input.lastIndexOf(ch));
					}
		}
	}
	public static void main(String[] args) {
		IndexOfExample2 indexOfExample2=new IndexOfExample2();
		String input="technocredits";
		indexOfExample2.printIndexOf(input);
	}
}
