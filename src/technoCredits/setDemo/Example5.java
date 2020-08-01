package technoCredits.setDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Example5 {

	public static void main(String[] args) {
		ArrayList<String> managerList = new ArrayList<String>();
		managerList.add("Mahesh");
		managerList.add("Shruti");
		managerList.add("Vaishnavi");
		managerList.add("Yash");
		managerList.add("Shruti");
		managerList.add("Anup");
		managerList.add("Yash");
		
		ArrayList<String> temp = new ArrayList<String>(managerList);
		
		
		String[] t1 = (String[])managerList.toArray();
		
		
		LinkedHashSet<String> uniqueManagerSet = new LinkedHashSet<String>();
		System.out.println(uniqueManagerSet);
		
		
		/*for(String managerName : managerList) {
			uniqueManagerSet.add(managerName);
		}
		System.out.println(uniqueManagerSet.size() + " -" + uniqueManagerSet);*/
	}
}
