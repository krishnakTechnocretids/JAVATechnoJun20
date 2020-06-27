package anshuKJun20;

public class FindAllDifferFromStringArray {
  void findDifferIndexInString() {
	  String[] arr = {"Maulik","Harsh","Technocredits","Krishna"};
	  String[] arr1 = {"Maulik","Harsh","Krishna","Technocredits"};
	  if(arr.length == arr1.length)
	  {
		  for(int stingindex = 0; stingindex<arr.length;stingindex++)
		  {
			  if(!arr1[stingindex].equals(arr[stingindex]))
			  {
				  System.out.println(stingindex+" is differ from another array");
				  System.out.println("arr1 value is "+arr1[stingindex]+" and arr value is "+arr[stingindex]);
			  }
		  }
	  }
  }
			  public static void main(String[] args) {
				  FindAllDifferFromStringArray findalldiffer = new FindAllDifferFromStringArray();
					 findalldiffer.findDifferIndexInString();
		  }
	  
  }
	  
  

