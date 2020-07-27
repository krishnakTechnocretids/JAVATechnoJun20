/*String input="Globant";
output=Globant
	   Lobant
	   Obant
	   Bant
	   Ant
	   Nt
	   T*/
package barkhaPJun20;

public class CodingExam_6 {
	
	void printMethod(String input) {
		for (int index=0; index<input.length(); index++) {
		String str=input.substring(index, input.length());
		str=str.replace(str.charAt(0), Character.toUpperCase(str.charAt(0)));
		System.out.println(str);
		}
	}
	public static void main(String[] args) {
		new CodingExam_6().printMethod("Globant");
	}
}