package anshuKJun20;

public class FindMaxValueAtDifferIndex {
 void findMaxValue(){
	 int[] arr = {10,2,9,14,3};
	   int[] arr1 = {10,2,18,14,3}; 
	  if(arr.length == arr1.length)
	   {
		  for(int i = 0; i< arr.length;i++)
		  {
			  if(arr[i]!=arr1[i])
			  {
				  System.out.println("values are not matching at index--->"+i);
				  if(arr[i]>arr1[i])
				  {
					  System.out.println(arr[i]+" is maximun value of differed array in "+(arr[i]+"and"+(arr1[i])));
				  }
				  else
					  System.out.println(arr1[i]+" is maximun value of differed array in "+(arr[i]+"and"+(arr1[i])));
			  }
			  
		  }
	   }
	   else
		   System.out.println("All values are not identical ");
 }
 public static void main(String[] args) {
	 FindMaxValueAtDifferIndex findmaxdiffer = new FindMaxValueAtDifferIndex();
	 findmaxdiffer.findMaxValue();
}
}
