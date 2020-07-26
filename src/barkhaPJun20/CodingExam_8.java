//find prime numbers between 1 -> 100 and return an arraylist.

package barkhaPJun20;

import java.util.ArrayList;

public class CodingExam_8 {
	void printPrimeNum(int fromNum, int toNum) {
		ArrayList<Integer> primenumbers = new ArrayList<Integer>();
		for (int index=fromNum; index<=toNum; index++) {
			boolean flag=true;
			for (int innerIndex=2;innerIndex<=index/2; innerIndex++) {
				if (index%innerIndex==0) {
					flag=false;
					break;
				}
			}
			if (flag==true) {
				primenumbers.add(index);
				}	
			}	
		System.out.println("Prime Numbers between range "+fromNum +" to "+toNum+" is: ");
			for (int arrayListIndex=0; arrayListIndex<primenumbers.size(); arrayListIndex++) {
				System.out.println(primenumbers.get(arrayListIndex));
				}
		}		
	public static void main(String[] args) {
		CodingExam_8 CodingExam_8=new CodingExam_8();
		CodingExam_8.printPrimeNum(1,100);
	}
}						