package anshuKJun20;

public class CountMultipleCharacter {
   void findcharcter(String name) {
	   int countdigit =0,countSpecialChar=0, countUpperCase=0,countLowerCase =0;
	   for(int index = 0; index<name.length();index++) {
		   char ch = name.charAt(index);
		   if(Character.isDigit(ch)==true) {
			   countdigit++;
		       }else if(Character.isLowerCase(ch)==true) {
				   countLowerCase++;
		       }else if(Character.isUpperCase(ch)==true) {
					countUpperCase++;
				}else {
			   countSpecialChar++;
			   }
	         }
	     System.out.println("Total Digit is:"+countdigit+"'\n' Total Upper Case:"+countUpperCase+"'\n' Total Lower Case:"+countLowerCase+"'\n' Total Special character:"+countSpecialChar);
   }
   public static void main(String[] args) {
	   CountMultipleCharacter countmultiplecharcter = new CountMultipleCharacter();
	   String letter = ("1rRpd3F9#K(E");
	   countmultiplecharcter.findcharcter(letter);
}
}

