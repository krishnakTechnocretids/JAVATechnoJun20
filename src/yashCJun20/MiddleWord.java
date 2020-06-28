package yashCJun20;
public class MiddleWord {
		
	void toFindMiddleChar(String m) {
		
		String[] array = m.split(" ");
		
		for(int i=0;i<array.length;i++) {
			int mdl=0;
			if(array[i].length() %2 ==0) {
				mdl=(array[i].length()/2)-1;
				System.out.println(array[i].charAt(mdl)+" is middle character in "+array[i]);
			}
				else {
					mdl=(array[i].length()/2);
					System.out.println(array[i].charAt(mdl)+" is middle character in "+array[i]);
					}
			
			
			}	
	}

	public static void main(String[] args) {
		
		MiddleWord middleWord = new MiddleWord();
		String m = "Harsh Maulik";
		middleWord.toFindMiddleChar(m);
	}

}