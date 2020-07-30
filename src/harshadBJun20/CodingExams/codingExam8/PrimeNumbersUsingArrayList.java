package harshadBJun20.CodingExams.codingExam8;

import java.util.ArrayList;

/*Exam-8:
Q2) find prime numbers between 1 -> 100 and return an arraylist.*/
public class PrimeNumbersUsingArrayList {
	
	boolean CheckIsPrimeNumber(int number) {
		boolean flag=true;	
		for(int index=2;index<=Math.sqrt(number);index++) {
			if(number % index == 0) {
				flag=false;
				break;
			}
		}	
		return flag;
	}
	
	ArrayList<Integer> findPrimeNumbersAndReturn(int lastNumber) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		boolean flag;
		for(int index=2;index<lastNumber;index++) {
			flag = CheckIsPrimeNumber(index);
			if(flag==true) {
				arrayList.add(index);
			}
		}
		return arrayList;
	}
	public static void main(String[] args) {
		System.out.println("Prime Numbers between 1 to 100 are: ");
		System.out.println(new PrimeNumbersUsingArrayList().findPrimeNumbersAndReturn(100));
	}
}
