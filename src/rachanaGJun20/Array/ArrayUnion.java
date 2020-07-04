/*Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)*/
package rachanaGJun20.Array;

public class ArrayUnion {

	int count = 0;

	// method will find out unique elements from Two given array and forming a union
	// of these two in a third array.
	void getUnionOfArray(double[] arr1, double[] arr2) {
		boolean flag = true;
		int arrlength = arr1.length + arr2.length;
		double[] unionOfTwoArr = new double[arrlength];
		//first take the unique elements of arr1 insert in resultant union of array.
		for (int outerindex = 0; outerindex < arr1.length; outerindex++) {
			for (int innerindex = 0; innerindex <= count; innerindex++) {
				if (unionOfTwoArr[innerindex] != arr1[outerindex]) {
					flag = isNumberUnique(unionOfTwoArr, arr1[outerindex]);
					if (!flag) {
						unionOfTwoArr[count] = arr1[outerindex];
						count++;
						break;
					}
				}
			}
		}
		//take unique elements from second array arr2 and insert in resultant union of array
		for (int outerindex = 0; outerindex < arr2.length; outerindex++) {
			for (int innerindex = count; innerindex <= count; innerindex++) {
				if (unionOfTwoArr[innerindex] != arr2[outerindex]) {
					flag = isNumberUnique(unionOfTwoArr, arr2[outerindex]);
					if (!flag) {
						unionOfTwoArr[count] = arr2[outerindex];
						count++;
						break;
					}
				}
			}
		}
		displayArrayUnion(unionOfTwoArr); 
	}
	//display union of nonzero elements of array  
	void displayArrayUnion(double[] arr3) {

		double[] unionArr = new double[count];
		for (int index = 0; index < count; index++) {
			unionArr[index] = arr3[index];
		}
		System.out.println("Union of two array is ::");
		System.out.print("{");
		for (int index = 0; index < unionArr.length; index++) {
			System.out.print(" "+unionArr[index]+" ");
			if (index < unionArr.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("}");
	}

	boolean isNumberUnique(double[] unionOfTwoArr, double num) {

		boolean flag = false;
		for (int index = 0; index <= count; index++) {
			if (unionOfTwoArr[index] == num) {
				flag = true;
				break;
			}
		}
		if (flag)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		ArrayUnion arrayunion = new ArrayUnion();
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		System.out.println("Input:");
		System.out.println("{ 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 }");
		System.out.println("{17.20, 13.30, 10.45, 18.35, 84.33, 13.30 }");
		arrayunion.getUnionOfArray(arr1, arr2);
	}
}
