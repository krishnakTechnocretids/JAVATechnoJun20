package technoCredits.collectionDemo.list;

import java.util.ArrayList;

public class Example9 {

	void printListUsingForLoop(ArrayList<String> listOfNames) {
		ArrayList<String> tempList = new ArrayList<String>(listOfNames);
		
		for(int index=0;index<listOfNames.size();index++) {
			String name = listOfNames.get(index);
			if(name.startsWith("A"))
				tempList.remove(name);
		}
		System.out.println(tempList);
	}
	
	
	// failfast
	void printListUsingEnhanceForLoop(ArrayList<String> listOfNames) {
		ArrayList<String> tempList = new ArrayList<String>(listOfNames);
		tempList.add("Techno");
		
		for(String name: tempList) {
			if(name.startsWith("A")) {
				tempList.remove(name);
				System.out.println(name);
			}
		}
		System.out.println(tempList);
	
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Madhura"); // 0 --> 0
		listOfNames.add("Ajit"); // 1 --> 1
		listOfNames.add("Pranita"); // 2 -->1
		listOfNames.add("Abhishek"); // 3 -->2
		listOfNames.add("Amita");  // 4 -->3 -->2
		listOfNames.add("Shruti"); // 5 -->4 -->3
		
		//new Example9().printListUsingEnhanceForLoop(listOfNames);
		//new Example9().printListUsingEnhanceForLoop(listOfNames);
		
		ArrayList<String> temp = new ArrayList<String>();
		temp.add("Techno"); //0
		temp.add("Technocredits"); //1 - >0
		
		for(String item : temp) { // 0,1,2 --> 1
			if(item.length()<=6) {
				temp.remove(item);
				System.out.println(item); // techno
			}
		}
		System.out.println("End");
	}
}
// 1. index & total size has to compared if we want to iterate on next element, if logically it is not correct
//     4 --> 3, 3 --> 3 [4] [removal] &&
// 2. total 4 --> 1 index but modification count get changed then again it will throw exception.








