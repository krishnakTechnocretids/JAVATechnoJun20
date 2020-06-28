/*
 * Program 3 : 
Count total special characters like _ , [ { ] } from every word, do not use any loop.
Hint : Use replace method [Think about it, how it can help].

Input :  Kr[i{s]hn}_a,Tech
Output : total special characters are 6 
 */
package pranitaPJun20;

public class CountSpecialChar18 {
	public static void main(String[] args) {
		String input = "Kr[i{s]hn}_a,Tech";
		System.out.println("Initial length is:"+input.length());
		int lengthOld=input.length();
		input=input.replace("[","").replace("{","").replace("]","").replace("}","").replace("_", "").replace(",", "");
		/*input=input.replace("{","");
		input=input.replace("]","");
		input=input.replace("}","");
		input=input.replace("_", "");
		input=input.replace(",", "");*/
		System.out.println("After replacement input: "+input);
		System.out.println("New length is:"+input.length());
		int lengthNew=input.length();
		System.out.println("Total special characters are:"+(lengthOld-lengthNew));
	}

}
