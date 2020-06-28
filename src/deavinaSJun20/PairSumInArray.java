package deavinaSJun20;

public class PairSumInArray {

	public static void main(String[] args) {
		int[] Arr = { 2, 4, 3, 5, 7, 8, 9, -1 };
		new PairSumInArray().pairSumInArray(Arr);
	}

	void pairSumInArray(int[] Arr) {
		for (int outerindex = 0; outerindex < Arr.length; outerindex++) {
			for (int innerindex = outerindex + 1; innerindex < Arr.length; innerindex++) {
				if (Arr[outerindex] + Arr[innerindex] == 7)
					System.out.println("(" + Arr[innerindex] + " , " + Arr[outerindex] + ")");
			}
		}
	}
}
