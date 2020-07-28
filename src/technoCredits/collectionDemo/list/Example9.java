package technoCredits.collectionDemo.list;

import java.util.ArrayList;
import java.util.Arrays;

public class Example9 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Rachna");
		al1.add("Archana");
		al1.add("Shruti");
		al1.add("Archana");
		al1.add("Viresh");
		al1.add("Archana");
		al1.add("Aadesh");
		
		/*while(al1.contains("Archana")) {
			al1.remove("Archana");
			System.out.println(al1);
		}*/
		
		/*while(al1.indexOf("Archana") != -1) {
			al1.remove("Archana");
			System.out.println(al1);
		}*/
		
		int orgSize = al1.size();
		al1.removeAll(Arrays.asList("Archana"));
		int currentSize = al1.size();
		
		System.out.println("Total occurences of Archana :" + (orgSize - currentSize));
		System.out.println(al1);
		
	}
}
