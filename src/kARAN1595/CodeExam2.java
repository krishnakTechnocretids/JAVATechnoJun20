package kARAN1595;

public class CodeExam2 {

	 public static void main(String args[])
	   {
		 int sum=0;
		
		 String temp="";
	      // Using charAt() method
	      String str = "1Hh9PR34QP";
	      for(int i=0; i<str.length();i++){
	        char ch = str.charAt(i);
	        //char to integer
			if(Character.isDigit(ch)) {
				temp= String.valueOf(ch);
				int number1=Integer.parseInt(temp);
				sum=sum+number1;
			     System.out.println("sum of integer"+sum );
			}
            }
	       
	      }
	      

	   }


