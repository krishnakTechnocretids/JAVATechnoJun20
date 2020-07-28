/*String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
output : [Palak, Viresh, Yash, Aavruti,Deavina,Nikhil]

Note : use collection concepts here and raise PR. For more practice write a code in notepad without using collection. */
package barkhaPJun20;

import java.util.ArrayList;
import java.util.Arrays;

public class Collection_RetrieveUniqueNamesAndCombined {
	
	void acceptUniqueNamesandFormNewArrayList(ArrayList<String> arrayList1,ArrayList<String> arrayList2) {
		arrayList2.removeAll(arrayList1);                         //[Aditya,Shobha,Aniket]
		arrayList1.addAll(arrayList2);
		System.out.println("\nUnion of Araays(ArrayLists) with Unique Values is: "+arrayList1);
	}	
	public static void main(String[] args) {
		Collection_RetrieveUniqueNamesAndCombined retriveUniqueNames=new Collection_RetrieveUniqueNamesAndCombined();
		String[] name1= {"Barkha","Megha","Tarun","Piyush","Atul"};
		String[] name2= {"Aditya","Barkha","Shobha","Piyush","Aniket"};
		
		ArrayList<String> nameArray1=new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> nameArray2=new ArrayList<String>(Arrays.asList(name2));
		
		System.out.println("First Array(ArrayList): "+nameArray1);
		System.out.println("Second Array(ArrayList): "+nameArray2);
		
		retriveUniqueNames.acceptUniqueNamesandFormNewArrayList(nameArray1,nameArray2);
	}
}