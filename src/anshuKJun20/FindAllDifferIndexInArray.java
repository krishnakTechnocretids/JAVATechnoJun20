package anshuKJun20;

public class FindAllDifferIndexInArray {
 void findAllDifferIndex() {
   int[] arr = {10,2,9,14,3};
   int[] arr1 = {10,2,18,14,13};
   
   if(arr.length == arr1.length)
   {
	  for(int i = 0; i< arr.length;i++)
	  {
		  if(arr[i]!=arr1[i])
		  {
			  System.out.println("values are not matching at index--->"+i);
		  }
		  
	  }
   }
   else
	   System.out.println("All values are not identical ");
 }
 public static void main(String[] args) {
	 FindAllDifferIndexInArray findalldiffer = new FindAllDifferIndexInArray();
	 findalldiffer.findAllDifferIndex();
}
}
