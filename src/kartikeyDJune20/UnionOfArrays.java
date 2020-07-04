package kartikeyDJune20;

import java.util.Arrays;

public class UnionOfArrays {

	static void unionOfArray(double[] arrInput1, double[] arrInput2) {
		double[] tempUnionArray = new double[arrInput1.length + arrInput2.length];
		Arrays.sort(arrInput1);
		Arrays.sort(arrInput2);
		int cnt = 0;
		for (int indexArray = 0; indexArray < arrInput1.length; indexArray++) {
			boolean flagFirstArray = true;
			for (int indexInnerArray = indexArray + 1; indexInnerArray < arrInput1.length; indexInnerArray++) {
				if (arrInput1[indexArray] == arrInput1[indexInnerArray]) {
					flagFirstArray = false;
					break;
				}
			}
			if (flagFirstArray == true) {
				cnt++;
				tempUnionArray[cnt - 1] = arrInput1[indexArray];
			}
		}
		for (int indexArray = 0; indexArray < arrInput2.length; indexArray++) {
			boolean flagSecArray = true;
			for (int indexInnerArray = indexArray + 1; indexInnerArray < arrInput2.length; indexInnerArray++) {
				if (arrInput2[indexArray] == arrInput2[indexInnerArray]) {
					flagSecArray = false;
					break;
				}
			}
			if (flagSecArray == true) {
				boolean flagTempUnionArray = true;
				for (int indexUnion = 0; indexUnion < tempUnionArray.length; indexUnion++)
					if (arrInput2[indexArray] == tempUnionArray[indexUnion]) {
						flagTempUnionArray = false;
						break;
					}
				if (flagTempUnionArray == true) {
					cnt++;
					tempUnionArray[cnt - 1] = arrInput2[indexArray];
				}
			}
		}
		// System.out.println(cnt);
		double[] finalUnionArray = new double[cnt];

		System.out.println("Union of Arrays is :");
		for (int indexFinalArray = 0; indexFinalArray < finalUnionArray.length; indexFinalArray++) {
			finalUnionArray[indexFinalArray] = tempUnionArray[indexFinalArray];
			System.out.print(finalUnionArray[indexFinalArray] + " ");
		}
	}

	public static void main(String[] args) {

		double[] arrInput1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };// 10,14,18, 18 54 88
		double[] arrInput2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		UnionOfArrays.unionOfArray(arrInput1, arrInput2);
	}

}
