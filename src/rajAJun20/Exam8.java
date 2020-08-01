package rajAJun20;

import java.util.ArrayList;

public class Exam8 {
	

	void showPrimeNumber(int start , int end) {
		
		ArrayList<Integer> primeNumber = new ArrayList<Integer>();
		for(int index = start ;index<= end ;index++) {
			boolean flag = true;
			for(int innerindex = 2;innerindex<=index/2;innerindex++) {
				if(index%innerindex == 0) {
					flag = false;
				}	
			}
			if(flag) {
				primeNumber.add(index);
			}
		}
		System.out.println(primeNumber);

	}

	public static void main(String[] args) {
		new Exam8().showPrimeNumber(2,100);
	}

}
