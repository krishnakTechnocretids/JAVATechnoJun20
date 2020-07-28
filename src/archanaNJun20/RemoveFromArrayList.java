package archanaNJun20;

import java.util.ArrayList;

public class RemoveFromArrayList {
	void removeTechno(ArrayList<String> input){
		while(input.contains("Techno")){
			input.remove("Techno");
		}
		System.out.println("output String : "+input);
	}
	public static void main(String[] args){
		RemoveFromArrayList removeFromArrayList=new RemoveFromArrayList();
		ArrayList<String> input= new ArrayList<String>();
		input.add("Maulik");
		input.add("Techno");
		input.add("Krishna");
		input.add("Techno");
		input.add("Credits");
		input.add("Techno");
		System.out.println("Input string : "+input);
		removeFromArrayList.removeTechno(input);
	}
} 