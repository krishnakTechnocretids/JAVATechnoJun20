package apurvaJun20;

public class SecondLargest {
	
	static void print2largest(int num[],  int num1) { 
         int i, firstNum, secondNum; 
              if (num1 < 2) { 
                  System.out.print(" Invalid Input "); 
                      return; 
     } 

              firstNum = secondNum = Integer.MIN_VALUE; 
               for (i = 0;  i<num1 ; i++) { 
                    if (num[i] > firstNum) { 
                    	secondNum = firstNum; 
                       firstNum = num[i]; 
    } 


            else if (num[i] > secondNum && num[i] != firstNum) 
            	secondNum = num[i]; 
    } 

              if (secondNum == Integer.MIN_VALUE) 
                 System.out.print("There is no second largest"+ " element\n"); 
           else
                  System.out.print("The second largest element" + " is " + secondNum); 
    }

	
	     public static void main(String[] args) {
		    SecondLargest secondLargest = new SecondLargest();
		     int num[] = { 10,33,56,43,99,21};
		         int n = num.length;
		           print2largest(num, n);
	}

}
