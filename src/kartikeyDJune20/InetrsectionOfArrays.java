package kartikeyDJune20;

import java.util.Arrays;

public class InetrsectionOfArrays {
	static void intersectionArray(double[] arrInput1, double[] arrInput2) {
		int lenTempArray = 0;
		if (arrInput1.length > arrInput2.length)
			lenTempArray = arrInput2.length;
		else
			lenTempArray = arrInput1.length;

		double[] tempIntersectionArry = new double[lenTempArray];
		int cnt = 0;
	//	Arrays.sort(arrInput1);
	//	Arrays.sort(arrInput2);
		for (int indexFirstArray = 0; indexFirstArray < arrInput1.length; indexFirstArray++) {
			boolean isNumDuplicateinFirstArray = false;
			for (int indexInnerFirst =0; indexInnerFirst < arrInput1.length; indexInnerFirst++) {
				if (arrInput1[indexFirstArray] != arrInput1[indexInnerFirst] || indexFirstArray==indexInnerFirst) {
					isNumDuplicateinFirstArray = false;
				}else
					isNumDuplicateinFirstArray = true;
					
			}
			if (isNumDuplicateinFirstArray == false) {

				for (int indexSecArray = 0; indexSecArray < arrInput2.length; indexSecArray++) {
					boolean isNumDupInSecondArray = false;
					for (int indexInnerSecond =0; indexInnerSecond < arrInput2.length; indexInnerSecond++) {
						if (arrInput2[indexSecArray] != arrInput2[indexInnerSecond] || indexSecArray==indexInnerSecond) {
							isNumDupInSecondArray = false;
						}else
							isNumDupInSecondArray = true;						
					}
					if (isNumDupInSecondArray == false) {
						if (arrInput1[indexFirstArray] == arrInput2[indexSecArray]) {
							cnt++;
							tempIntersectionArry[cnt - 1] = arrInput1[indexFirstArray];
						}
					}
				}
			}
		}
		double[] finalIntersectionArray=new double[cnt];
		System.out.println("Intersection of two array is :");
		for (int index = 0; index < finalIntersectionArray.length; index++) {
			finalIntersectionArray[index]=tempIntersectionArry[index];
			System.out.print(finalIntersectionArray[index] + " ");
		}

	}

	public static void main(String[] args) {
		double[] arrInput1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arrInput2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		InetrsectionOfArrays.intersectionArray(arrInput1, arrInput2);
	}
}
