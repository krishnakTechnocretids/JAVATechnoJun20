package abhijitMJun20;

public class DivisibleandRange {

	void EvenNumbers(int start,int index){
		System.out.println("\nEven numbers are: ");
		for( int i=start; i<=index;i++){
			int iStoreValue= i;
			if ( iStoreValue%2==0){
				
				System.out.println(+iStoreValue);
			}
		}
	}
	void rangeFivePrint(int start, int index){
		System.out.println("\nDivisible by 5, numbers are: ");
		for( int i=start; i<=index;i++){
			int iStoreValue=i;
			if(iStoreValue%5==0){
				System.out.println(iStoreValue);
			}
		}
	}
	void rangeFiveandThreePrint(int start, int index){
		System.out.println("\nDivisible by 5 & 3, numbers are: ");
		for( int i=start; i<=index;i++){
			int iStoreValue=i;
			if(iStoreValue%5==0 && iStoreValue%3==0){
				System.out.println(iStoreValue);
			}
		}
	}
	void rangeSevenandThirteenPrint(int start, int index){
		System.out.println("\nDivisible by 7 & 13, numbers are: ");
		for( int i=start; i<=index;i++){
			int iStoreValue=i;
			int numberSeven=7,numberThirteen=13;
			if(iStoreValue%numberSeven==0 ){
				System.out.println(iStoreValue + " is divisible by " +numberSeven);
			}
			if(iStoreValue%numberThirteen==0){
				System.out.println(iStoreValue + " is divisible by " +numberThirteen);
			}
		}
	}
	public static void main(String[] args){
		DivisibleandRange divisibleRange= new DivisibleandRange();
		divisibleRange.EvenNumbers(10,15);
		divisibleRange.rangeFivePrint(10,30);
		divisibleRange.rangeFiveandThreePrint(5,18);
		divisibleRange.rangeSevenandThirteenPrint(5,40);
		
	}
	

}
