package apurvaJun20;

public class SwapNumbers {
	

	 void swapNum(int x, int y) {
	        System.out.println("Originally Given Numbers:-\nNumber1 -> "+x+"     Number2 -> "+y);
	        x = x + y; 
	        y = x - y; 
	        x = x - y; 
	        System.out.println("\nSwapped Numbers:-\nNumber1 -> "+x+"     Number2 -> "+y);
	    }

	    public static void main(String[] args) {
	        int x=10, y=20;
	        new SwapNumbers().swapNum(x, y);
	    }
	}

