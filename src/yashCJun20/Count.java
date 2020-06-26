package yashCJun20;

public class Count {
	
	void count (String s){
		
		int digitCnt=0;
		int upperCaseCnt=0;
		int lowerCaseCnt=0;
		int specialCharCnt;
		
		
		for (int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(Character.isDigit(ch)==true)
				digitCnt++;
			
			if(Character.isUpperCase(ch)==true)
				upperCaseCnt++;
			
			if(Character.isLowerCase(ch)==true)
				lowerCaseCnt++;
			
			
			
		}
			
			System.out.println("Total digit:" +digitCnt);
			System.out.println("Total Letters:"+(upperCaseCnt+lowerCaseCnt));
			System.out.println("Total Uppercase:"+upperCaseCnt);
			System.out.println("Total Lowercase:"+lowerCaseCnt);
			System.out.println("Total Special char:"+(specialCharCnt=s.length()-upperCaseCnt-lowerCaseCnt-digitCnt));
			
			
		}
		
	
	public static void main(String[] args) {
		
		String s="1rRpd3F9#K(E";
		Count count = new Count ();
		count.count(s);

	}

}
