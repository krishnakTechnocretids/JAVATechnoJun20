package suparnaNJune20.Assignment_23;


public class IntersectOfArray {
	double[] getIntersectOfArray(double[] arr1, double[] arr2) {

		int innerIndex, outerIndex, indexCnt = 0;
		boolean flag;
		if (arr1.length > arr2.length)
			indexCnt = arr1.length;
		else 
			indexCnt = arr2.length;
		double[] arr3 = new double[indexCnt];
		indexCnt =0;
		
		for (outerIndex = 0; outerIndex < arr2.length; outerIndex++) {
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
		return intersectArr;
		
	}
	
	
double[] arr2 = {1,2,3};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		double[] intersectArr = new IntersectOfArray().getIntersectOfArray(arr1, arr2);
		System.out.print("Input: arr1 -> { ");
		new UnionOfArray().display(arr1);;
		System.out.print("\nInput: arr2 -> { ");
		new UnionOfArray().display(arr2);
		System.out.print("\nOutput : Intersection of Array -> { ");
		new UnionOfArray().display(intersectArr);

	}

}
