/*Assignement 30 : 18th July 2020 (without using loop)
 
Replace second last globant with Technocredits. 
input-> Hi Globant Hello Globant Hi Globant GM Globant Hi Globant

output->  Hi Globant Hello Globant Hi Globant GM Technocredits Hi Globant

*/
package rachanaGJun20.String;

public class ReplaceSecondLastStr {

	// method will replace second last occurrence of Globant by "Technocredits" from the given input string;
	void replaceSecondlastWord(String str) {
		int index = str.lastIndexOf("Globant");
		String strtemp1 = str.substring(0, index);
		String strtemp2 = str.substring(index);
		int lastindex = strtemp1.lastIndexOf("Globant");
		String strtemp3 = strtemp1.substring(lastindex).replace("Globant", "Technocredits");
		strtemp1 = strtemp1.substring(0, lastindex);
		str = strtemp1 + strtemp3 + strtemp2;
		System.out.println(str);
	}

	public static void main(String[] args) {
		String str = "Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		System.out.println(str);
		new ReplaceSecondLastStr().replaceSecondlastWord(str);
	}

}
