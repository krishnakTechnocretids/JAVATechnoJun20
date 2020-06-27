package jagadeeshMJun20;

public class FirstAndLastIndex {
		void printCharFreq(String name) {
			for(int index=0; index<name.length(); index++) {
				char ch = name.charAt(index);//t
				//int count = 0;
				if (index == name.indexOf(ch)) {
				if(name.indexOf(ch) != name.lastIndexOf(ch)) 
					System.out.println(ch + " --> "+" First Index " + name.indexOf(ch) + " Last Index " + name.lastIndexOf(ch) );
			}
			}
			
		}
	public static void main(String[] args) {
		FirstAndLastIndex firstAndLastIndex = new FirstAndLastIndex();
		String name = "teechnocredits";
		firstAndLastIndex.printCharFreq(name);
	}
}
	