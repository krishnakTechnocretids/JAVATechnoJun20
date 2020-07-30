/*Exam-8:
Q2) find prime numbers between 1 -> 100 and return an arraylist. */
package jagadeeshMJun20;
import java.util.ArrayList;

public class Code_Exam_8 {
	ArrayList <Integer> primeList = new ArrayList<Integer>();
	ArrayList <Integer> findPrime(int input) {	
		for(int num=2;num<input; num++) {
			boolean flag =false;	
				for(int index=2; index<11; index++) {
				if(num!=index && num%index == 0) 
					flag =true;
				}
				if(flag == false) {
					primeList.add(num);
				}
		}		
		return primeList;
	}	
	public static void main(String[] args) {
		System.out.println("Prime numbers --> "+ new Code_Exam_8().findPrime(100));
	}

}
