package archanaNJun20;

public class TestExam4 {

	 void findSecondMax(int[] number){
		int FirstMax=0;
		int SecondMax=0;
		for(int index=0;index<number.length;index++){
			if(number[index]>FirstMax ){
				SecondMax=FirstMax;
				FirstMax=number[index];	
			}
			else if(number[index]>SecondMax)
			{
				SecondMax=number[index];
			}
		}
		System.out.println("Second Max number "+SecondMax);
	}
	public static void main(String[] args) {
		TestExam4 testExam4= new TestExam4();
		int[] number= {10,33,56,43,99,21,79,100,89};
		testExam4.findSecondMax(number);
	}
}