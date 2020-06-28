package archanaNJun20;

public class MissingInteger {
	void printMissingInteger(int array[],int n){
		int total=((n*(n+1))/2);
		int sum=0;
		for(int index=0;index<array.length;index++){
			sum=sum+array[index];
		}
		int differnce=total-sum;
		System.out.println("Missing number in array is: "+differnce);
	}
	public static void main(String[] args) {
		MissingInteger missingInteger=new MissingInteger();
		int array1[]={1,2,3,6,7,8,9,10,5};
		int n=10;
		missingInteger.printMissingInteger(array1,n);
	}
}