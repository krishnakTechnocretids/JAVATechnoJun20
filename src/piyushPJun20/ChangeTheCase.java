package piyushPJun20;

public class ChangeTheCase {
	
		String changeCase(String str) {
			
			String caseChangedStr="";
			
			for(int index=0; index<str.length(); index++) {
				
				if(str.charAt(index) >= 'a' && str.charAt(index) <= 'z') {
					
					caseChangedStr +=  (char)(str.charAt(index)-32);
				}else if(str.charAt(index) >= 'A' && str.charAt(index) <= 'Z') {
					
					caseChangedStr += (char)(str.charAt(index)+32);
				}
			}
			return caseChangedStr;
		}

		void displyArray(String[] strArray) {
			System.out.print("{ ");
			
			for(int index=0; index<strArray.length; index++) {
				System.out.print("\""+strArray[index]+"\", ");
			}
			
			System.out.print("}");
		}

		public static void main(String[] args) {
			
			ChangeTheCase changeTheCase = new ChangeTheCase();
			
			String[] strArray = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};
			
			
			System.out.println("Original elements of the given array of string is:-");
			changeTheCase.displyArray(strArray);
			
			for(int index=0; index<strArray.length; index++) {
				strArray[index] = changeTheCase.changeCase(strArray[index]);
			}
			
			System.out.println("\n\nArray elements with changed case:- ");
			changeTheCase.displyArray(strArray);
		}
	

}
