package maheshKJun20.StringExamples;

public class StringPyramid {
	
	void displaystrPyramid(String str) {
		for (int index=str.length();index>=0;index--) {
			System.out.println(str.substring(0, index));			
		}
	}
	
	public static void main(String[] args) {
		StringPyramid stringPyramid = new StringPyramid();
		stringPyramid.displaystrPyramid("Globant");
	}

}
