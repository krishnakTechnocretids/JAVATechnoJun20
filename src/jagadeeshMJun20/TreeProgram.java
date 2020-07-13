package jagadeeshMJun20;

public class TreeProgram {
 void display(int[] arr) {
	 int count =1;
	 int max = arr[0];
	 for (int i=1; i<arr.length;i++) {
		 if(arr[i]>max) {
			 count++;
			 max = arr[i];
		 }  
	 
 }
	 System.out.println(count);
 }
 public static void main(String[] agrs) {
	 int[] arr = {3,5,5,11,9,10,13};
	 new TreeProgram().display(arr);
 }
}
