/*WAP to convert case in all elements of array. 
Input : 
String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};

Output:
array = {"aAvRUTI", "nIkHIL","aDItI", "maHESH","aRCHAna","JAgaDEESH"};
A -> Z : 65 -> 90
a -> z : 97 -> 122
0 -> 9 : 48 -> 57

*/
package palakSJun20;
public class ArrayConvertCase {

	//Converting String characters.
	String convertCase(String str) {
		String result = "";
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) >= 65 && str.charAt(index) <= 90) {
				/*char ch = str.charAt(index); 
				 ch = (char)(ch + 32); 
				 result += String.valueOf(ch);
				 */
				result += (char) (str.charAt(index) + 32);
			} else if (str.charAt(index) >= 97 && str.charAt(index) <= 122) {
				/*char ch = str.charAt(index); 
				  ch = (char)(ch - 32); 
				  result += String.valueOf(ch);
				 */
				 result += (char) (str.charAt(index) - 32);
			} else
				System.out.println("Invalid String");
		}
		return result;
	}

	//Printing Array Element
	void display(String[] result) {
		System.out.print("{ ");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ",");
		}
		System.out.println("}");
	}
	

	public static void main(String[] args) {
		ArrayConvertCase arrayConvertCase = new ArrayConvertCase();
		String[] array = { "AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh" };
		System.out.print("Input Array : ");
		arrayConvertCase.display(array);
		
		//Calling convertCase Method and passing Array String Element 
		for (int i = 0; i < array.length; i++) {
			array[i] = arrayConvertCase.convertCase(array[i]);
		}
		
		System.out.print("Output Array: ");
		arrayConvertCase.display(array);
	}
}
