package anshuKJun20;

public class CountMultipleCharacter {
   void findcharcter(char[] ch) {
	   int countdigit =0,countSpecialChar=0, countUpperCase=0,countLowerCase =0,countletters =0;
	   for(int index = 0; index<ch.length;index++) {
		   if(Character.isDigit(ch[index])==true) {
			   countdigit++;
		   } else if(Character.isLetter(ch[index])){
			   countletters++;
			   if(Character.isLowerCase(ch[index])==true) {
				   countLowerCase++;
				} if(Character.isUpperCase(ch[index])==true) {
					countUpperCase++;
			   }
			   
		   }else {
			   countSpecialChar++;
		   }
	   }
	   
	   System.out.println("Total Digit is:"+countdigit+"'\n' Total Letters:"+countletters+"'\n' Total Upper Case:"+countUpperCase+"'\n' Total Lower Case:"+countLowerCase+"'\n' Total Special character:"+countSpecialChar);
   }
   public static void main(String[] args) {
	   CountMultipleCharacter countmultiplecharcter = new CountMultipleCharacter();
	   char[] ch = {'1','2','k','r','#','E','f','(','F','3','&'};
	      countmultiplecharcter.findcharcter(ch);
}
}

