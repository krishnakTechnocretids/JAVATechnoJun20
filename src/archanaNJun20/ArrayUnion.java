package archanaNJun20;

public class ArrayUnion {
	int arraycount=0;
	double[] getUnionOfArray(double[] array1,double[] array2){
		int arraycount=0;
		double[] array3 = new double[(array1.length + array2.length)];
		boolean flag;
		for (int outerIndex = 0; outerIndex < array1.length; outerIndex++) {
			flag = true;
			for (int innerindex = 0; innerindex < array3.length; innerindex++) {
				if (array3[innerindex] == array1[outerIndex]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				array3[arraycount] = array1[outerIndex];
				arraycount++;
			}
		}
		for (int outerIndex = 0; outerIndex < array2.length; outerIndex++) {
			flag = true;
			for (int innerindex = 0; innerindex < array3.length; innerindex++) {
				if (array3[innerindex] == array2[outerIndex]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				array3[arraycount] = array2[outerIndex];
				arraycount++;
			}
		}
		return array3;
	}
	void printUniqueNumberArray(double[] array3) {
		int innerIndex=0;
		boolean flag=true;
		System.out.print("Union of Arrays : ");
		for (int outerIndex=0;outerIndex<array3.length; outerIndex++){
			for(innerIndex=1;innerIndex<outerIndex;innerIndex++){
				if(array3[outerIndex]==array3[innerIndex])
					flag=false;
			}
			if(flag)
				if(array3[innerIndex]>0)
					System.out.print(array3[innerIndex]+" ");
		}
	}
	public static void main(String[] args) {
		ArrayUnion arrayUnion= new ArrayUnion();
		double[] array1= {10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double[] array2= {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};

		double[]  array3=arrayUnion.getUnionOfArray(array1,array2);
		arrayUnion.printUniqueNumberArray(array3);
	}
}