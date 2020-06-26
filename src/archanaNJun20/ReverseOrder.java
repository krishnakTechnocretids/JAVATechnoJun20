package archanaNJun20;

public class ReverseOrder {

	void printReverseOrder(String input){
		int length=input.length();
		for(int index=length-1;index>=0;index--){
			char ch=input.charAt(index);
			System.out.print(ch);
		}
	}
	public static void main(String[] args){
		ReverseOrder reverseOrder=new ReverseOrder();
		String input="Hello this is technocredits";
		reverseOrder.printReverseOrder(input);
	}
}
