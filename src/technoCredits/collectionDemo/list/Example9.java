package technoCredits.collectionDemo.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Example9 {

	public static void main(String[] args) {
		
		String[] names = {"Anup","Amita","Prayag Mokate","Sumit Mate","Prayag Mokate"};
		/* ArrayList<String> nameList = new ArrayList<String>();
		
		for(String currentName : names) {
			if(nameList.indexOf(currentName) == -1) {
				nameList.add(currentName);
			}else {
				System.out.println(currentName + " is duplicate");
			}
		}*/
		
		/*ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(names));
		for(String name : nameList) {
			if(nameList.indexOf(name) != nameList.lastIndexOf(name)) {
				System.out.println(name + " is duplicate");
			}
		}*/
		

		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(names));
		HashMap<String,Integer> nameMap = new HashMap<String,Integer>();
		for(String name : nameList) {
			if(nameMap.containsKey(name)) {
				System.out.println(name);
				nameMap.put(name, nameMap.get(name)+1);
			}else {
				nameMap.put(name, 1);
			}
		}
		System.out.println(nameMap);
		/*Set<String> keys = nameMap.keySet();
		Iterator<String> itr= keys.iterator();
		
		while(itr.hasNext()) {
			String currentKey =  itr.next();
			int currentValue = nameMap.get(currentKey);	
			if(currentValue >1) {
				System.out.println(currentKey + " is duplicate");
				//itr.remove();	
			}
		}*/
		//System.out.println(nameMap);
	}
}
