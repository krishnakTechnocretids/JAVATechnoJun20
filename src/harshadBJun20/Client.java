/*Assignment 10 : 18th Jun Assignment : write a code based on above figure, 
[create 4 classes and 1 client class having main method]. 
from main method you will call m1 method of call A as mentioned in figure.*/

package harshadBJun20;

public class Client{
	
	public static void main(String args[]){
		FirstClass firstClass = new FirstClass();
		System.out.println();
		System.out.println("From main method of Client class calling: ");
		firstClass.method1ofFirstClass();
		System.out.println();
	}
}