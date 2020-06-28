package vireshJJun20.Assignment19;

public class StringArrayComparison { //// returns the string values of mismatching index post comparing 2 string arrays.
	int index= 0;
	boolean flag= true;
	void arrayIndex(String[] ar1, String[] ar2) {
		if (ar1.length==ar2.length) {
			for (int i= 0; i<ar2.length; i++) {
				if(!(ar1[i].equals(ar2[i]))) {
					flag= false;
					String a= ar1[i];
					String b= ar2[i];
					System.out.println("Values are not matching at index " + i + "," + " [arr1 value is " + a + "," + " arr2 value is " + b + "]" );	
				}
			}
		}	
	}
	
	public static void main(String[] args) {
		StringArrayComparison arrayComparison= new StringArrayComparison();
		String[] ar1 = {"Maulik", "Harsh", "Krishna", "Technocredits"};
		String[] ar2=  {"Maulik","Harsh","Technocredits","Krishna"};
		arrayComparison.arrayIndex(ar1, ar2);
	}
}
