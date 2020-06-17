package yashCJun20;
class MathOperation{
	
	
	double sum (double d1,double d2,double d3){
		
		double answer;
		answer=d1+d2+d3;
		return answer;
		
	}
	
	double average (double a1,double a2,double a3){
		
		
		double answer;
		answer=sum(a1,a2,a3)/3;
		return answer;
		
		
	}
	
	static boolean isAnswerAboveExpecation(double answer){
		
		if(answer>50)
			
		   return true;
	    else
			return false;
		
		
	}
	
	static boolean isEligible(double answer){
		
		if(answer>50||answer%2==0)
		
			return true;
		else
			return false;
			
		
	}
	
	static String getYourGrade(double answer){
		
		if(answer>80)
		
			return "A Grade";
		else
			return "B Grade";
	}
	
	public static void main(String[] args){
		
	 MathOperation mathOperation = new MathOperation();
	 double ans=mathOperation.average(20.00,30.00,40.00);
	 isAnswerAboveExpecation(ans);
	 if (isEligible(ans) == true)
		 System.out.println ("Student is eligible");
	 else
		 System.out.println ("Not eligible");
	 
	 System.out.println ("Student received " +getYourGrade(ans));
	 
	 
		
		
	}
	
	
	
	
	
	
}