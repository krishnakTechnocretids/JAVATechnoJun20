package vaishnaviVJun20_arrayExamples;

public class FreqWord {
	
	void findFreqOfEveryWord(String s) {	
		s= s.toLowerCase();
		String name=s.replace("_", "");
		String[] array = name.split(" ");
		System.out.println("Frequency of every word:");
		for(int index=0;index<array.length;index++) {
			int count =1;
			if(!array[index].equals("*")) {
			for(int i=index+1;i<array.length;i++) {
				if(array[index].equals(array[i]))	{				
    				count++;
				    array[i]="*";
				}
			}	
			System.out.println(array[index] +"-->" +count);
			}
		}		
	}

	public static void main(String[] args) {
		FreqWord freqWord = new FreqWord();
		String input= "Tech_no Hi T_EchNo H_I Tech hi_";
		freqWord.findFreqOfEveryWord(input);
	}

}
