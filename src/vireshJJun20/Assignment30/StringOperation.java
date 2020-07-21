/*
Assignement 30 : 18th July 2020
 
Replace second last globant with Technocredits. 
input-> Hi Globant Hello Globant Hi Globant GM Globant Hi Globant

output->  Hi Globant Hello Globant Hi Globant GM Technocredits Hi Globant
*/
package vireshJJun20.Assignment30;

public class StringOperation {

	void replaceString(String ipStr, String word, int lastNth) {
		int cnt = 0;
		String[] ipArr = ipStr.split(" ");
		if (ipStr.length() >= (word.length() * 2) + 1 && cnt == 0) {
			ipStr = "";
			for (int index = ipArr.length - 1; index >= 0; index--) {
				if (ipArr[index].equals(word)) {
					cnt++;
					if (cnt == lastNth) {
						ipArr[index] = "Technocredits";
					}
				}
				ipStr = String.valueOf(ipArr[index]) + " " + ipStr;
			}
			System.out.println();
		}
		if (cnt >= lastNth) {
			System.out.print("Output String : " +ipStr);
			//System.out.println(ipStr);
		} else
			System.out.println("The word " + word + " is not repeated for " + lastNth + " times in the given string.");
	}

	public static void main(String[] args) {
		String str = "Hi Globant Hello Globant Hi Globant GM Globant Hi Globant"; // Globant GlobantGlobant
		String word = "Globant";
		int lastNth = 6; // 6- Negative Scenario
		System.out.print("Input String  : " +str);
		//System.out.println(str);
		new StringOperation().replaceString(str, word, lastNth);
	}

}
