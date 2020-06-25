package barkhaPJun20;

public class FirstLastIndexOfMultiOccurence {
	
	void findFirstLastIndex(String name) {
		for(int outerIndex=0; outerIndex<name.length(); outerIndex++) {
			char ch=name.charAt(outerIndex);
			
			if(outerIndex==name.indexOf(ch)) {
				
				if (name.indexOf(ch)!=name.lastIndexOf(ch))
			System.out.println(ch+" -> First Index in String is: "+name.indexOf(ch) +" & Last Index in String is: "+name.lastIndexOf(ch));	
				}
			}
		}
		
	public static void main(String[] args) {
		FirstLastIndexOfMultiOccurence occurenceIndex=new FirstLastIndexOfMultiOccurence();
		
		String inputName="technocredits";
		
		occurenceIndex.findFirstLastIndex(inputName);
		
	}

}

			
			
				
		
				
		

	
