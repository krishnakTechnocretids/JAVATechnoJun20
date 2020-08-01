package technoCredits.setDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example3 {

	public static void main(String[] args) {
		Set<String> setOfNames = new HashSet<String>();
		setOfNames.add("Maulik");
		setOfNames.add("Harshad");
		setOfNames.add("Ajit");
		setOfNames.add("Mahesh");
		setOfNames.add("Ajit");
		
		Iterator<String> itr = setOfNames.iterator();
		
		while(itr.hasNext()){
			String temp = itr.next();
			//System.out.println(temp);
			if(temp.equals("Maulik"))
				itr.remove(); // fail safe
		}
		
		System.out.println(itr.next());
		
		ArrayList<String> al = new ArrayList<String>();
		Iterator itr1 = al.iterator();
		for(String temp : al) {
			itr.next();
		}
		
		for(int index=0;index<al.size();index++) {
			System.out.println(itr1.next());
		}
	}
}
