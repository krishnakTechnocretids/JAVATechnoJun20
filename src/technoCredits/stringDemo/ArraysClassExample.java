package technoCredits.stringDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysClassExample {

	void findSecondMax(int[] arr) {
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
		System.out.println(Arrays.toString(arr));
		
		String[] msg = {"Hi","Hello","Abhishek"};
		
//	    List<String> list= Arrays.asList(msg);
//	    Collections.sort(list);
//	    System.out.println(list);
	}
	
	public static void main(String[] args) {
		int[] num = {33,22,19,88,76};
		new ArraysClassExample().findSecondMax(num);
	}
}
