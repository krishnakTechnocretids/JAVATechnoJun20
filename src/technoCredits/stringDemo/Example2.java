package technoCredits.stringDemo;

public class Example2 {
	
	public static void main(String[] args) {
		String[] arr = {"Maulik", "Krishna", "Maulik", "Techno", "Maulik", "Techno"};
		String input = "aashta"; // == // .equals
		// arr -> freq of every word, 
		String input1 = "Hi Hello hi GM Well Hi GM GM HELLO"; //
		String[] arr1 = input1.split(" ");
		System.out.println(arr1.length); // 
		//System.out.println(arr1[1]);
		
		String msg1 = "Hello";
		String msg2 = "HELLO";
		System.out.println(msg1.equals(msg2));
		System.out.println(msg1.equalsIgnoreCase(msg2)); // 1
		
		msg1 = msg1.toLowerCase();
		msg2 = msg2.toLowerCase();
		System.out.println(msg1.equals(msg2));
		
		msg1 = msg1.toUpperCase();
		msg2 = msg2.toUpperCase();
		System.out.println(msg1.equals(msg2));
	}

}
