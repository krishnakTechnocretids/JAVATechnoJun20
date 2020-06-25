package archanaNJun20;

public class IndexOfExample2 {

	void printIndexOf(String input)
	{
		for(int index=0;index<input.length();index++){
			char ch=input.charAt(index);
			int count=0;
			if(index==input.indexOf(ch))
				for(int index1=0;index1<input.length();index1++) {
					if(ch==input.charAt(index1)){
						count++;
					}
				}
			if(count>1){
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
