package yashCJun20.CodingExam5;

public class CodingExam {

	void printName (String name) {
		int size =name.length();
		 char [] arr=name.toCharArray();
		for (int innerindex= size-1; innerindex>= 0; innerindex--)  
		{  
		for (int outerindex=0; outerindex<=innerindex; outerindex++)  
		{  
		System.out.print(arr[outerindex]);  
		}  
		
		System.out.println();
		}
	}
	public static void main(String[] args) {
		CodingExam codingexam = new CodingExam();
		codingexam.printName("Globant");
	}
}