package suparnaNJune20.Assignment_23;
public class IntersectOfArray {
	double[] getIntersectOfArray(double[] arr1, double[] arr2) {

		int innerIndex, outerIndex, indexCnt = 0;
		boolean flag = false;
		if (arr1.length > arr2.length)
			indexCnt = arr1.length;
		else
			indexCnt = arr2.length;
		double[] arr3 = new double[indexCnt];
		indexCnt = 0;
		for (outerIndex = 0; outerIndex < arr2.length; outerIndex++) { // copy matching value from both arry in arr3
			flag = false;
			for (innerIndex = 0; innerIndex < arr1.length; innerIndex++) {

				if (arr2[outerIndex] == arr1[innerIndex]) {
					flag = true;
					break;
				}
			}
			if (flag) {
				arr3[indexCnt] = arr2[outerIndex];
				indexCnt++;
			}
		}
		double[] intersectArr = new double[indexCnt];
		for (outerIndex = 0; outerIndex < indexCnt; outerIndex++)
			intersectArr[outerIndex] = arr3[outerIndex];
		return new UnionOfArray().findDuplicatNo(intersectArr); // return array by removing duplicate elements
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Example 1:");
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		double[] intersectArr1 = new IntersectOfArray().getIntersectOfArray(arr1, arr2);
		System.out.print("Input: arr1 -> { ");
		new UnionOfArray().display(arr1);
		System.out.print("\nInput: arr2 -> { ");
		new UnionOfArray().display(arr2);
		System.out.print("\nOutput : Intersection of Array -> { ");
		new UnionOfArray().display(intersectArr1);
		System.out.println("\nExample 2:");
		double[] arr11 = { 0.0 };
		double[] arr22 = { 0.0, 0.0, 0.0 };
		double[] intersectArr22 = new IntersectOfArray().getIntersectOfArray(arr11, arr22);
		System.out.print("Input: arr11 -> { ");
		new UnionOfArray().display(arr11);
		System.out.print("\nInput: arr22 -> { ");
		new UnionOfArray().display(arr22);
		System.out.print("\nOutput : Intersection of Array -> { ");
		new UnionOfArray().display(intersectArr22);
		System.out.println("\nExample 3:");
		double[] arr111 = { 1, 1, 1, 1, 1, 0 };
		double[] arr222 = { 1 };
		double[] intersectArr333 = new IntersectOfArray().getIntersectOfArray(arr111, arr222);
		System.out.print("Input: arr111 -> { ");
		new UnionOfArray().display(arr111);
		System.out.print("\nInput: arr222 -> { ");
		new UnionOfArray().display(arr222);
		System.out.print("\nOutput : Intersection of Array -> { ");
		new UnionOfArray().display(intersectArr333);
	}
}
