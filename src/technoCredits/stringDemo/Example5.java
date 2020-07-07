package technoCredits.stringDemo;
// Overloaded method
// beigining index -> end string
//(int,int) -> bIndex < eindex (2,5) --> bIndex : inclusive , eIndex : exclusive 
// bIndex > eIndex
// bIndex == eIndex [nothing will be printed]
// length --> nothing will be printed
// length + n --> wil be runtime array [StringIndexOutOfBoundException]
public class Example5 {

	public static void main(String[] args) {
		String msg = "technocredits";
		//msg = msg.substring(3);
		//System.out.println(msg);
		
		/*msg = msg.substring(3, 7);
		msg.toUpperCase();
		System.out.println(msg.charAt(0));
		System.out.println(msg);
		*/
		
		/*msg = msg.substring(0,msg.length());
		System.out.println(msg);
		*/
		
		msg = msg.substring(msg.length(), msg.length()); //
		System.out.println(msg);
		
		
		msg = msg.substring(msg.length()+3);
		System.out.print(msg);
		
		
		/*msg = msg.substring(msg.length(),msg.length());
		System.out.println(msg);*/
		
		/*
		msg = msg.substring(0,0);
		System.out.println(msg);*/
		
	}
}
