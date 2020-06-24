package vaishnaviVJun20_arrayExamples;

public class Frequency {
	
	void findOneCharFrequency(String name, char ch) {
		int count=0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index) == ch)
				count++;
		}
		System.out.println(ch +"-->" +count + " times in "+name);
	}
	
	void findAllCharFequency(String name) {
		for(int index=0;index<name.length();index++) {
			findOneCharFrequency(name,name.charAt(index));
		}
		System.out.println("==============================");
	}
	
	void findAllCharFequencyInArray(String[] input) {
		for(int index=0;index<input.length;index++) {
			for(int i=0;i<input[index].length();i++) {
			findOneCharFrequency(input[index],input[index].charAt(i));
			}
			System.out.println("=======================");
		}
	}

	public static void main(String[] args) {
		Frequency frequency = new Frequency();
        String name = "technocredits";
        char ch = 'e';
        String name1= "aakanksha";
        String[] array = {"raj","aarya","aavruti","shruti"};
        frequency.findOneCharFrequency(name,ch);
        frequency.findAllCharFequency(name1);
        frequency.findAllCharFequencyInArray(array);
	}

}
