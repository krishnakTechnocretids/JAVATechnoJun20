package maheshKJun20.StringExamples;

public class StringPyramid1 {
	
	void displaystrPyramid(String str) {
		
		for (int index=0;index<str.length();index++) {
			System.out.println(str.substring(index, index+1).toUpperCase() + str.substring(index+1, str.length()));	
		}
	}
	
	public static void main(String[] args) {
		StringPyramid1 stringPyramid1 = new StringPyramid1();
		stringPyramid1.displaystrPyramid("Globant");
	}

}
