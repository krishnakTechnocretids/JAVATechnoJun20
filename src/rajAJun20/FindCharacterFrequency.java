package rajAJun20;

public class FindCharacterFrequency {
	
	void oneCharFreq(String name , char character) {
		int count = 0;
		for(int index = 0 ; index < name.length() ; index++) {
			if(name.charAt(index) == character)
				count ++;
		}
		System.out.println(character + " -> " +count+ " time in " + name);
		System.out.println("                               ");
		System.out.println("                             ");

	}
	
	void allCharFequency(String name) {
		for(int index=0;index<name.length();index++) {
			oneCharFreq(name,name.charAt(index));
		}
		System.out.println("                             ");
	}

	void allCharFequencyInArray(String[] input) {
/* for array size */	for(int index=0;index<input.length;index++) {
/* for string size*/		for(int i=0;i<input[index].length();i++) {
								oneCharFreq(input[index],input[index].charAt(i));
							}
								System.out.println("                           ");
						}
	}
	
	public static void main(String[] args) {
		FindCharacterFrequency findCharacterFrequency = new FindCharacterFrequency();
		String str = "technocredits";
		char ch = 'e';

        String str2 = "aakanksha";
        String[] array = {"raj","aarya","aavruti","shruti"};
		findCharacterFrequency.oneCharFreq(str , ch);
		findCharacterFrequency.allCharFequency(str2);
		findCharacterFrequency.allCharFequencyInArray(array);		
		
	} 
}
