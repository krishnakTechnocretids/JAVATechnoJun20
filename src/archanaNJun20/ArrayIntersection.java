package archanaNJun20;

public class ArrayIntersection {
	double[] getIntersectionOfArray(double[] array1, double[] array2){		
		int  arraycount=0;
		int length=0;
		if(array1.length<array2.length)
			length= array1.length;
		else
			length=array2.length;

		double array3[]=new double[length];
		for( int outerIndex = 0; outerIndex<array2.length;outerIndex++ ) {
			for( int innerIndex=0; innerIndex<array1.length; innerIndex++) {
				if(array2[outerIndex]==array1[innerIndex]) {
					array3[arraycount]=array2[outerIndex];
					arraycount++;
				}
			}
		}
		return array3;
	}		
	void printUniqueNumberArray(double array3[]){
		int innerIndex=0;
		boolean flag=true;
		System.out.print("Intersection of Arrays : ");
		for (int outerIndex = 0; outerIndex <array3.length; outerIndex++){
			for(innerIndex=0;innerIndex<outerIndex;innerIndex++){
				if(array3[outerIndex]==array3[innerIndex])
					flag=false;
			}
			if(flag)
				System.out.print(array3[innerIndex]+"  ");
		}
	}
	public static void main(String[] args) {
		ArrayIntersection arrayIntersection=new ArrayIntersection();
		double [] array1={10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double [] array2={17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		double[] array3 = arrayIntersection.getIntersectionOfArray(array1, array2);
		arrayIntersection.printUniqueNumberArray(array3);
	}
}