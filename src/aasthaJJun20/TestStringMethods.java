package aasthaJJun20;

class TestStringMethods{
	void findFrequecyOfWordInString(String input){
		String[] inputArr = input.toLowerCase().replace("_","").split(" ");
		System.out.println("Frequency of every word:");
		for(int index = 0; index<inputArr.length;index++){
			int count = 1;
			if(!inputArr[index].equals("*")){
				for(int innerIndex = index+1; innerIndex<inputArr.length; innerIndex++){
					if(inputArr[index].equalsIgnoreCase(inputArr[innerIndex])){
						count++;
						inputArr[innerIndex] = "*";
					}
				}
				System.out.println(inputArr[index]+" -> "+count);
			}
		}
	}
	
	void displayMiddleLetter(String input){
		String[] inputArr = input.split(" ");
		for(int index = 0; index<inputArr.length;index++){
			System.out.println("'"+inputArr[index].charAt((inputArr[index].length()-1)/2)+"' is the middle letter of "+inputArr[index]);
		}
	}
	
	void displayCountOfSpecialChar(String input){
		System.out.println("Total special characters are : "+(input.length() - (input.replace("[","").replace("{","").replace("]","").replace("}","").replace("_","").replace(",","")).length()));
	}
	
	void displayReverseOfString(String input){
		for(int index = input.length()-1; index >= 0; index--){
			System.out.print(input.charAt(index));
		}
	}
	
	public static void main(String[] args){
		TestStringMethods testStringMethods = new TestStringMethods();
		System.out.println("Program-1 output-----------------------------------------");
		testStringMethods.findFrequecyOfWordInString("Tech_no Hi T_EchNo H_I Tech hi_");
		System.out.println("Program-2 output-----------------------------------------");
		testStringMethods.displayMiddleLetter("Harsh Maulik");
		System.out.println("Program-3 output-----------------------------------------");
		testStringMethods.displayCountOfSpecialChar("Kr[i{s]hn}_a,Tech");
		System.out.println("Program-4 output-----------------------------------------");
		testStringMethods.displayReverseOfString("Hello this is technocredits");
	}
}
