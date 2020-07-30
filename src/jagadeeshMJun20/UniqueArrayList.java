/*String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
output : [Palak, Viresh, Yash, Aavruti,Deavina,Nikhil]

Note : use collection concepts here and raise PR.  */

package jagadeeshMJun20;
import java.util.ArrayList;
import java.util.Arrays;

public class UniqueArrayList {
	ArrayList<String> displayUniqueList(ArrayList<String> names1ist1, ArrayList<String> nameslist2) {
		names1ist1.removeAll(nameslist2);
		names1ist1.addAll(nameslist2);
		return names1ist1;	
	}
	public static void main(String[] agrs) {
		String[] name1 =  {"Palak", "Viresh", "Yash", "Aavruti"};
		String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"} ;
		ArrayList<String> names1ist1 = new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> nameslist2 = new ArrayList<String>(Arrays.asList(name2));
		System.out.println("Input 1 --> " + names1ist1);
		System.out.println("Input 2 --> " + nameslist2);
		System.out.println("Unique Names  --> "+ new UniqueArrayList().displayUniqueList(names1ist1, nameslist2));
	}
}
