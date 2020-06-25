package amitaRJun20;

public class FindIndexOfCharacters {
	
	void findIndexOfChar() {
		
		String name="technocredits";
		System.out.println("The given String is : "+name+"\n");		
		for(int index=0;index<name.length();index++) {
			char ch=name.charAt(index);
			if(index==name.indexOf(ch) ) {
				if(name.indexOf(ch) != name.lastIndexOf(ch))
				System.out.println(ch+"--> first index : "+name.indexOf(ch)+" ,Last index : "+name.lastIndexOf(ch)+"\n");
			}			
		}
	}
	public static void main(String[] args) {
		FindIndexOfCharacters findIndex=new FindIndexOfCharacters();
		findIndex.findIndexOfChar();
	}
}
