package yashCJun20.Assignment19;

public class FindMaxValue {
	
void toFindMaxValue (int [] arr1,int [] arr2){
		
		for (int i=0;i<arr1.length;i++) {
			
        	if (arr1[i]!=arr2[i]) 
                System.out.println("Values are not matching at index ->"+ i +"," +"From "+"("+arr1[i] + " " + arr2[i] +") " +"max value is " +Math.max(arr1[i], arr2[i]) );
        }
			
        }

	public static void main(String[] args) {
		FindMaxValue findMaxValue = new FindMaxValue();
		int array1[]={10,2,9,14,3};
		int array2[]={10,2,18,14,3};
		findMaxValue.toFindMaxValue(array1, array2);

	}

}
