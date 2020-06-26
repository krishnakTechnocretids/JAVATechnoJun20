package technoCredits.stringDemo;

//Split
public class Example4 {

	public static void main(String[] args) {
		String msg1 = "Hello ";
		String msg2 = " hello  ";
		String msg3 = "Hello";
		
		StringBuffer sb = new StringBuffer("Hello this is technocredits");
		System.out.println(sb.reverse());
		msg1 = msg1.trim().toLowerCase();
		msg2 = msg2.trim().toLowerCase();
		
		System.out.println(msg1.equals(msg2));
		System.out.println(msg1.equalsIgnoreCase(msg2));
		
		String msg4 = "Techno-Maulik-M-Kanani-M-Techno-Maulik";
		//msg4 = msg4.replace('-', ' '); // char
		//msg4 = msg4.replace("-M-", " M "); // string
		//msg4 = msg4.replaceAll("Maulik", "Krishna");
		msg4 = msg4.replaceFirst("Maulik", "Krishna");
		System.out.println(msg4);
	}
}
