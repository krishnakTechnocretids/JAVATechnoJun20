package technoCredits.setDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example7 {

	public static void main(String[] args) {
		/*ArrayList<String> managerList = new ArrayList<String>();
		managerList.add("Mahesh");
		managerList.add("Shruti");
		managerList.add("Vaishnavi");
		managerList.add("Yash");
		managerList.add("Shruti");
		managerList.add("Anup");
		managerList.add("Yash");
		
		Collections.sort(managerList,Collections.reverseOrder());
		System.out.println(managerList);*/
		
		TreeSet<String> ts = new TreeSet<String>();//  Natural order
		ts.add("Mahesh");
		ts.add("Shruti");
		ts.add("Vaishnavi");
		
		System.out.println("----" + ts);
		ArrayList<String> temp = new ArrayList<String>(ts);
		Collections.sort(temp,Collections.reverseOrder());
		LinkedHashSet<String> ts1 = new LinkedHashSet<String>(temp);
		
		System.out.println("***" + ts1); // 
	}
}
