package anshuKJun20;
/*Find all pairs on integer array whose sum is equal to given number?
Hint: You have given an integer array and a number, you need to write a program to find
all elements in the array whose sum is equal to the given number. Remember, the array
may contain both positive and negative numbers, so your solution should consider that.
Input:2, 4, 3, 5, 7, 8, 9 ,-1
Given sum:7
Integer numbers, whose sum is equal to value:7
(2, 5)
(4, 3)
(5, 2)
(3, 4)
(8, -1)
(-1, 8)*/
public class ExamCode2 {
  void calSum() {
  int[] arr = {2, 4, 3, 5, 7, 8, 9 ,-1};
	  for(int i =0;i< arr.length;i++)
	  {
		  for(int j =0;j<arr.length;j++)
		   {
			  int sum = arr[i]+arr[j];
			  if(sum == 7)
			  {
				  System.out.println(arr[i]+" and "+arr[j] +" equals  t0 7");
			  }
		  }
	  }
	  
  }
  public static void main(String[] args) {
	  ExamCode2 exam3 =  new ExamCode2 ();
	  exam3.calSum();
}
}
