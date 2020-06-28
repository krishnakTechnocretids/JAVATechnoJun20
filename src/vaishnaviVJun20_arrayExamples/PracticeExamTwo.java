package vaishnaviVJun20_arrayExamples;

public class PracticeExamTwo {
	
	void findSumEqualToGivenNumber(int[] array1,int num) {
		System.out.println("Integer numbers, whose sum is equal to value: "+num);
		 for(int index=0;index<array1.length;index++) {
			for(int i=1;i<array1.length;i++) {
			   if(array1[index]+array1[i] == num) {				   
			       System.out.println("("+array1[index] +","+array1[i] +")");
			   } 
			 }  
		 }	   
	}

	public static void main(String[] args) {
		PracticeExamTwo practiceExamTwo = new PracticeExamTwo();
		int[] array1 = {2,4,3,5,7,8,9,-1};
		int num = 7;
		practiceExamTwo.findSumEqualToGivenNumber(array1,num);
	}

}
