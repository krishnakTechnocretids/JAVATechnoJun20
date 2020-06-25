package maheshKJun20;

public class FirstAndLastIndex {
	
	void findIndexLocation(String str) {
		//Method with print the first and last index number of letter whose frequency is more than 1 in String
		System.out.println("Input String Value: " + str);
		for (int index=0;index<str.length();index++) {
			if (str.indexOf(str.charAt(index)) == index) {
				if(str.indexOf(str.charAt(index)) != str.lastIndexOf(str.charAt(index))) {
					System.out.println(str.charAt(index) + " -> First Index = " + str.indexOf(str.charAt(index)) + " Last Index = " + str.lastIndexOf(str.charAt(index)));
				}	
			}
		}
	}
	
	public static void main(String[] args) {
		FirstAndLastIndex firstAndLastIndex = new FirstAndLastIndex();
		String str = "technocredits";
		firstAndLastIndex.findIndexLocation(str);
	}
}
