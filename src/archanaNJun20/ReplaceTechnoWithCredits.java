package archanaNJun20;

import java.util.ArrayList;

public class ReplaceTechnoWithCredits{
	ArrayList<String> replaceTechnoWithCredits(ArrayList<String> input){
		System.out.print("Techno word index in given arrayList is  ");
		while(input.contains("Techno")){
			System.out.print(input.indexOf("Techno") + ",");
			input.set(input.indexOf("Techno"), "Credits");
		}
		/*for (int index = 0; index < input.size(); index++){
			if (input.contains("Techno")){
				System.out.print(input.indexOf("Techno") + ",");
				input.set(input.indexOf("Techno"), "Credits");
			}
		}*/
		System.out.println();
		return input;
	}
	void countWord(ArrayList<String> input){
		int count=0;
		for (int index = 0; index <= input.size(); index++){
			if (input.contains("Credits")){
				input.remove(input.indexOf("Credits"));
				count++;
			}
		}
		System.out.println("Total Credits words : "+count);
	}
	public static void main(String[] args){
		ReplaceTechnoWithCredits replaceTechnoWithCredits = new ReplaceTechnoWithCredits();
		ArrayList<String> input = new ArrayList<String>();
		input.add("Maulik");
		input.add("Techno");
		input.add("Krishna");
		input.add("Techno");
		input.add("Credits");
		input.add("Techno");
		System.out.println("Repalced list : "+replaceTechnoWithCredits.replaceTechnoWithCredits(input));
		replaceTechnoWithCredits.countWord(input);
	}
}