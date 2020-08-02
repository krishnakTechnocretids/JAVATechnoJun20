package technoCredits.setDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Example6 {
	static String[] m1() {
		ArrayList<String> managerList = new ArrayList<String>();
		managerList.add("Mahesh");
		managerList.add("Shruti");
		managerList.add("Vaishnavi");
		managerList.add("Yash");
		managerList.add("Shruti");
		managerList.add("Anup");
		managerList.add("Yash");
		
		String[] temp = new String[managerList.size()];
		//String[] obj = (String[])managerList.toArray();
		/*Object[] obj = managerList.toArray();
		for(int index=0;index<obj.length;index++) {
			temp[index] = (String)obj[index];
		}*/
		managerList.toArray(temp);
		return (String[])managerList.toArray();
	}
	
	public static void main(String[] args) {
		m1();
	}
}
