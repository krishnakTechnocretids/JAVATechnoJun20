package deavinaSJun20;

public class TestIndexCount {
	public static void main(String[] args) {
		String name="technocredits";
		System.out.println("Entered String : "+name);
		new TestIndexCount().repeatedCharIndex(name);
	}
	//function to print repeated characters
	public void repeatedCharIndex(String name) {
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(i==name.indexOf(ch) && i!=name.lastIndexOf(ch))
				System.out.println(ch+"--> first index = "+name.indexOf(ch)+" Last index = "+name.lastIndexOf(ch));
		}		
	}
}
