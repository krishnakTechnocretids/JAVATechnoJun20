package archanaNJun20;

public class AlldDifferString {
		static void printAllDifferString(String[] arr1, String[] arr2){
				if(arr1.length==arr2.length) {
			for(int index =0; index <arr1.length; index++){
				if(arr1[index].length()!=arr2[index].length()){
					System.out.println("Values are not matching at index " +index+"[arr1 value is "+arr1[index]+" ,arr2 value is "+arr2[index]+"]");
				}
			}
		}
		else
			System.out.println("array are identical");
	}
	public static void main(String[] args) {
				String[] arr1= {"Maulik", "Harsh", "Krishna", "Technocredits"};
		String[] arr2={"Maulik","Harsh","Technocredits","Krishna"};
		printAllDifferString(arr1, arr2);
	}
}
