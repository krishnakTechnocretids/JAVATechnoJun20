package barkhaPJun20;

public class StringIsNotMatchingInArray {
	
	void findAllDiffIndex(String[] name1, String[] name2) {
		if (name1.length==name2.length) {
			for (int index=0; index<name2.length; index++) {
				if (name1[index]!=name2[index]) {
					System.out.println("Both Arrays are not matching at Index:"+index);
				}
			}
			
		}else
			System.out.println("Both Arrays are not matching.");
		
	}
	public static void main(String[] args) {
		StringIsNotMatchingInArray indexNotMatching=new StringIsNotMatchingInArray();
		String[] arr1= {"Maulik","Harsh","Krishna","Technocredits"};
		String[] arr2= {"Maulik","Harsh","Technocredits","Krishna"};
		indexNotMatching.findAllDiffIndex(arr1, arr2);
	}

}
