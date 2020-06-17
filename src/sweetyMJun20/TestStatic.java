package sweetyMJun20;

public class TestStatic {
	    static double ans;
		static double avg;
		double sum(double n1,double n2, double n3){
			ans=n1+n2+n3;
			return ans;
		}
		double average(double n1,double n2,double n3){
			avg=sum(n1, n2, n3)/3;
			return avg;
		}
		static boolean isAnswerAboveExpecation( double isans1){
			if (isans1>=50){
				return true;
			}
			else{
				return false;
			}
		}
		static boolean isEligible(double isans){
			if (isans>=50 || isans/2==0)
				return true ;
			else
				return false;
		}
		static String getYourGrade(double isans){
			if(isans>=80)
				return "A Grade";
			else
				return "B Grade";
		}
		
		public static void main(String[] args){
			TestStatic teststatic1=new TestStatic();
			double isans1=teststatic1.average(30.00,20.00,50.00);
			System.out.println(isAnswerAboveExpecation(isans1));
			if (isEligible(isans1)==true)
				System.out.println(" is eligible");
			else
				System.out.println(" is not eligible");
			System.out.println(getYourGrade(isans1));
			}
	}


