package technoCredits.stringDemo;

public class Example14 {

	public static void main(String[] args) {
		String s1 = "HiHello"; //1 SPC
		s1.toLowerCase(); //2 Heap
		s1.substring(1); // 3 Heap 
		s1.toUpperCase(); //4 Heap 
		System.out.println(s1.replace('H', 'h')); // 5 // Heap
		System.out.println(s1); //
		
 
		StringBuffer sb = new StringBuffer("GM");
		/*sb.append("Techno"); // GMTechno
		sb.replace(1, 3, "Credits");
		System.out.println(sb); // 
*/		
		System.out.println(sb.reverse());
	}
}
