package barkhaPJun20;

public class ReplaceSecondLastWordInString {
	
	void replaceSecondLastWord(String input) {
		int count=0;
		String[] array=input.split(" "); //["Hi","Globant","Hello","Globant","Hi","Globant","GM","Globant","Hi","Globant"]
		for (int index=array.length-1; index>=0; index--) {
			if (array[index].equals("Globant")) {
				count++;
				if (count==2)
					array[index]="TECHNOCREDITS";
			}	
		}
		arrayToString(array); //[Hi, Globant, Hello, Globant, Hi, Globant, GM, Tech, Hi, Globant]
	}	
	void  arrayToString(String[] arr) {
		String temp="";
		for (int i=0; i<arr.length; i++) {
			temp+=arr[i]+" ";
		}
		System.out.println();
		System.out.println("New String After replacing second last word (Globant): ");
		System.out.println(temp);
	}
	public static void main(String[] args) {
		ReplaceSecondLastWordInString replaceSecondLastWord=new ReplaceSecondLastWordInString();
		String str="Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		System.out.println("Please Replace Second Last word (Globant) with TECHNOCREDITS in below given String: ");
		System.out.println(str);
		replaceSecondLastWord.replaceSecondLastWord(str);
		}		
}			