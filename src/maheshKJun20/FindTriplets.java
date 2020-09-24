//Find triplet having maximum sum.
//int[] num = {10,20,12,22,15,13,9,17,21}
//Max sum triplet is : 22,15,13 -> 50

package maheshKJun20;

public class FindTriplets {

	void displayTriplet(int[] intArray) {
		int count = 1, maxValue = 0, tempValue = 0;
				String setOfTriplet = "";
		for (int index = 0; index < intArray.length; index++) {
			tempValue += intArray[index];
			if (count == 3) {
				if (maxValue < tempValue) {
					maxValue = tempValue;
					setOfTriplet = intArray[index-2] + "," + intArray[index-1]+ "," + intArray[index];
				}
				count = 0;
				tempValue = 0;
			}
			count++;
		}
		System.out.println("Max sum triplet is : " + setOfTriplet + " -> " +  maxValue);
		 
	}

	public static void main(String[] args) {
		FindTriplets findTriplets = new FindTriplets();
		int[] intArray = { 10, 20, 12, 22, 15, 13, 9, 17, 21 };
		findTriplets.displayTriplet(intArray);
	}
}
