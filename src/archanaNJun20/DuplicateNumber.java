package archanaNJun20;

public class DuplicateNumber {
	void printDuplicateNumber(int array1[]){
		for(int i=0;i<array1.length;i++) {
			for(int j=i+1;j<array1.length;j++){
				if(array1[i]==array1[j])
					System.out.println("Duplicate Number in array is :"+array1[j]);
			}
		}
	}
	public static void main(String[] args) {
		DuplicateNumber duplicateNumber=new DuplicateNumber();
		int array1[]={1,2,3,4,5,6,7,8,9,3,10,1};
		duplicateNumber.printDuplicateNumber(array1);
	}
}