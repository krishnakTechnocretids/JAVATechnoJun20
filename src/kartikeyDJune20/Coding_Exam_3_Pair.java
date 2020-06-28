package kartikeyDJune20;

public class Coding_Exam_3_Pair {
	 void pair(int[] input) {
		 for(int index=0;index<input.length;index++) {
			 //input[index]
			 for(int indexInner=index+1;indexInner<input.length;indexInner++) {
				 if(input[index]+input[indexInner]==7) {
					 System.out.println("("+input[index]+","+input[indexInner]+")");
				 } 
			 } 
		 }	 
	 }
	public static void main(String[] args) {
		int[] input= {2,4,3,5,7,8,9,-1};
		Coding_Exam_3_Pair coding_Exam_3_Pair= new Coding_Exam_3_Pair();
		coding_Exam_3_Pair.pair(input);
	}

}
