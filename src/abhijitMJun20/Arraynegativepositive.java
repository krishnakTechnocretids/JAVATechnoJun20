package abhijitMJun20;

import java.util.Scanner;

public class Arraynegativepositive {
	int negativecount,positivecount;
	int negativesum,positivesum;
	void countnegativepositive(int[] countnp){
		for(int index=0;index<countnp.length;index++) {
			if(countnp[index]<0) {
				negativecount++;
				negativesum=negativesum+countnp[index];
			}else {
				positivecount++;
				positivesum=positivesum+countnp[index];
				}
		}
		System.out.println("Negative count : " + negativecount);
		System.out.println("Positive count : "+ positivecount);
	}
	int retunsum(){ 
	 return positivesum+negativesum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraynegativepositive arraynegativepositive=new Arraynegativepositive();
		System.out.println("How many number you want");
		Scanner scanner= new Scanner(System.in);
		int number=scanner.nextInt();
    	int []num= new int[number];
    	System.out.println("Enter you number");
    	for(int index=0;index<num.length;index++){
    		num[index]= scanner.nextInt();	
    	}
    	arraynegativepositive.countnegativepositive(num);
	System.out.println("Difference of positive and negative number is : " +arraynegativepositive.retunsum());
	scanner.close();
	}
}
