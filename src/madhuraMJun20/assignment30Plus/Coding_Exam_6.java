package madhuraMJun20.assignment30Plus;
/*Globant
Globant
Lobant
Obant
Bant
Ant
Nt
T 	  */
public class Coding_Exam_6 {
	void printString(String input) {
		String str = input;
		for(int index=0;index<input.length();index++) {
				str=input.substring(index);
				String temp1 = str.substring(1);
				String temp=str.substring(0,1).toUpperCase();
				str = temp + temp1;
				System.out.println(str);
		}
	}
	public static void main(String [] args) {
		new Coding_Exam_6().printString("Globant");
	}
}