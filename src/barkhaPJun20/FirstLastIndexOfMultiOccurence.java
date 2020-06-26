package barkhaPJun20;

public class FirstLastIndexOfMultiOccurence {
	
	void findFirstLastIndex(String name) {
		for(int index=0; index<name.length(); index++) {
			char ch=name.charAt(index);
			
			if(index==name.indexOf(ch)) {
				
				if (name.indexOf(ch)!=name.lastIndexOf(ch))
			System.out.println(ch+""+"(" +name +") -> First Index in String is: "+name.indexOf(ch) +" & Last Index in String is: "+name.lastIndexOf(ch));	
				}
			}
		}
		
	public static void main(String[] args) {
		FirstLastIndexOfMultiOccurence occurenceIndex=new FirstLastIndexOfMultiOccurence();
		
		String inputName="technocredits";
		
		occurenceIndex.findFirstLastIndex(inputName);
		
	}

}

			
			
				
		
				
		

	
