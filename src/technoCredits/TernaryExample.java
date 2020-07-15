package technoCredits;

// ? : operator
public class TernaryExample {

	int getMaxNumber(int x, int y) {
		/*if(x>y)
			return x;
		return y;*/
		//int len = arr1.length > arr2.length ? arr1.length : arr2.length;
		return x > y ? x : y;
	}
	
	int getMaxNumberFromInputs(int x, int y, int z) {
		return (x>y && x>z) ? x : (y>z) ? y : z; 
	}
	
	public static void main(String[] args) {
		TernaryExample ternaryExample = new TernaryExample();
		System.out.println(ternaryExample.getMaxNumber(10, 20));
		
	}
}
