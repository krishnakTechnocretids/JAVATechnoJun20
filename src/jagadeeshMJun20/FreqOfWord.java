package jagadeeshMJun20;

public class FreqOfWord {
	void displayFrequency(String input) {
		System.out.println();
		input = input.toLowerCase().replaceAll("_","");
		String[] name = input.split(" ");
		for(int index=0;index<name.length;index++) {
			int count=1;
			if(!name[index].equals("*")) {
				for (int j=index+1;j<name.length;j++) {
					if(name[index].equals(name[j])) {
						count++;
						name[j]="*";	
					}
				}
				System.out.println(name[index]+" -> "+count);
			}
		}
	}
public static void main(String[] agrs) {
	FreqOfWord freqOfWord = new FreqOfWord();
	String input = "Tech_no Hi T_EchNo H_I Tech hi_";
	freqOfWord.displayFrequency(input);
}
}
