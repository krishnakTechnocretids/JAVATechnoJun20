package yashCJun20;
public class CharacterFreq {
	
	void findOneCharFreq(String name,char ch) {
		int count=0;
		for(int i=0;i<name.length();i++) {
			
			if(name.charAt(i)==ch)
			count++;
		}
		System.out.println(ch +" ->" + count+" times in "+name);
		
	}
	
	void findAllCharFreq(String uname) {
		int count=0;
		for(int i=0;i<uname.length();i++) {
	    findOneCharFreq(uname,uname.charAt(i));	
			
		}
		System.out.println("***************************************");
	}
 
	
	void findAllCharFreqUsingArr(String[] input) {
		
		for(int i=0;i<input.length;i++) {
		findAllCharFreq(input[i]);
		}
		
	}

	public static void main(String[] args) {
		
		CharacterFreq characterFreq = new CharacterFreq();
		String name ="technocredits";
		char ch ='e';
		characterFreq.findOneCharFreq(name, ch);
		String uname="aakanksha";
        characterFreq.findAllCharFreq(uname);	
        String[] names = {"Yash","Shubham","Dheeraj"};
        characterFreq.findAllCharFreqUsingArr(names);
	}

}
