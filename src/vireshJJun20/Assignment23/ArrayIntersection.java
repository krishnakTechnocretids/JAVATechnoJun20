/*
Program 2: Find intersection(common elements) of two arrays.
Input:    arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 18.35
Method Signature : double[] getIntersectionOfArray(double[] arr1, double[] arr2)
*/


package vireshJJun20.Assignment23;

public class ArrayIntersection {

	static int count;
	boolean flag = false;

	double[] editArray(double[] ar) { // takes input array and removes duplicates and then returns.
		double[] temp = new double[ar.length];
		for (int outerIndex = 0; outerIndex < ar.length; outerIndex++) {
			for (int innerIndex = 0; innerIndex < ar.length; innerIndex++) {
				if (temp[innerIndex] != ar[outerIndex]) {
					flag = false;
				} else {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				temp[count] = ar[outerIndex];
				count++;
			}
		}
		return temp;
	}

	double[] trimArray(double[] input) { // resizes and returns the array post removing extra 0.0 values.
		double[] newAr = new double[count];
		for (int index = 0; index < newAr.length; index++) {
			newAr[index] = input[index];

		}
		count = 0;
		return newAr;
	}

	double[] getIntersection(double[] arr1, double[] arr2) {// returns the common values between both the arrays.
		boolean flag = false;
		double[] arr3 = new double[arr1.length];
		for (int innerIndex = 0; innerIndex < arr1.length; innerIndex++) {
			for (int outerIndex = 0; outerIndex < arr2.length; outerIndex++) {
				if (arr1[innerIndex] == arr2[outerIndex]) {
					flag = true;
					break;
				} else {
					flag = false;
				}
			}
			if (flag == true) {
				arr3[count] = arr1[innerIndex];
				count++;
			}
		}
		return arr3;
	}

	public static void main(String[] args) {

		double[] ar1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		System.out.println("Array 1: {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}");
		double[] ar2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		System.out.println("Array 2: {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}");
		double[] temp = new ArrayIntersection().editArray(ar1);
		double[] newAr1 = new ArrayIntersection().trimArray(temp);
		double[] temp1 = new ArrayIntersection().editArray(ar2);
		double[] newAr2 = new ArrayIntersection().trimArray(temp1);
		double[] Ar3 = new ArrayIntersection().getIntersection(newAr1, newAr2);
		double[] newAr3 = new ArrayIntersection().trimArray(Ar3);
		System.out.print("Intersection: {");
		for (int index = 0; index < newAr3.length; index++) {
			System.out.print(" " + newAr3[index]);
		}
		System.out.println(" }");
	}

}
