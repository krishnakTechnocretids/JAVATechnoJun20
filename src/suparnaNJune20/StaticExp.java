package suparnaNJune20;

public class StaticExp {
	double sumMethod(double cnt1, double cnt2, double cnt3) {
		// System.out.println("sum of "+ cnt1 + ","+ cnt2 +"," + cnt3 +"="+(cnt1+cnt2+cnt3));
		return (cnt1+cnt2+cnt3);
	}
	double avgMethod(double cnt1, double cnt2, double cnt3) {
		System.out.println("Avrage  of "+ cnt1 + ","+ cnt2 +"," + cnt3 +" is = "+ (sumMethod(cnt1,cnt2,cnt3)/3));
		return (sumMethod(cnt1,cnt2,cnt3)/3);
	}
	static boolean isAnswerAboveExpecation(double ans) {
		if (ans>50)
			return true;
		else
			return false;
	}
	static boolean isEligible(double ans) {
		if (ans>50 || ans %2 ==0)
			return true;
		else
			return false;
	}
	static String getYourGrade(double ans )	{
		if(ans>=80)
			return "A Grade";
		else return "B Grade";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExp exp1= new StaticExp();
		boolean ans;
		double avgAns;
		avgAns = exp1.avgMethod(127,348,136);
		ans = isAnswerAboveExpecation(avgAns);
		if (ans)
			System.out.println("Avg value is Above the expecation  as more than 50   ");
		else System.out.println(" Avg value is not Above the expecation  as not more than 50  ");

		ans = isEligible(avgAns);
		if (ans)
			System.out.println(" Avg  value is eligibal as more than 50 or divisible by 2  ");
		else System.out.println(" Avg value  is not eligibal as not more than 50 or not divisible by 2 ");
		System.out.print("Avg value gets:")	;
		System.out.println (getYourGrade(avgAns));
	}
}
