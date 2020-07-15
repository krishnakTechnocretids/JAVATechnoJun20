package aadeshJun20;

public class FirstAndLastIndex {

		void firstAndLastIndex(String str) {
			for(int index=0; index<str.length();index++) {
				char ch = str.charAt(index);
				if(index == str.indexOf(ch)) {
					if(str.indexOf(ch) !=  str.lastIndexOf(ch)) {
						System.out.println(ch+ "-> First index = " +str.indexOf(ch)+ " , Last index = "+str.lastIndexOf(ch));
					}
				}
			}			
		}

		public static void main(String [] args) {
			FirstAndLastIndex firstAndLastIndex = new FirstAndLastIndex();
			String str = "technocredits";
			firstAndLastIndex.firstAndLastIndex(str);
		}
	}

