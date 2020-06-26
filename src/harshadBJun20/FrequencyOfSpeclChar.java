package harshadBJun20;
/*Program 3 : 
Count total special characters like _ , [ { ] } from every word, do not use any loop.
Hint : Use replace method [Think about it, how it can help].

Input :  Kr[i{s]hn}_a,Tech
Output : total special characters are 6*/

public class FrequencyOfSpeclChar {
	public static void main(String[] args) {
		String str="Kr[i{s]hn}_a,Tech";
		//int strCount = str.length();
		
		int freqCount = 0;
		String strNew =	str.replace("[", "").replace("{","").replace("]","").replace("}", "").replace("_", "").replace(",", "");
		freqCount = str.length() - strNew.length();
		
		System.out.println("Total special characters are: "+freqCount);
	}
}
