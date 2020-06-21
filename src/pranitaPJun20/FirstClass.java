/*Assignment 10 : 18th Jun Assignment : 
Write a code based on the above figure, [create 4 classes and 1 client class having main method]. 
from the main method, you will call the m1 method of class A as mentioned in the figure.
For today's assignment for better clarity you can use FirstClass, SecondClass, ThridClass, ForthClass, Client as a class name.
Method name can be firstMethod, secondMethod and so on.
You should write one print statement in every method like Inside First method or anything which can help you to understand 
which methods are being called in sequence. with PR number please share screenshot of output in skype.
*/

package pranitaPJun20;

public class FirstClass {
	void firstMethod(){
		System.out.println("In method M1");	
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("In method M2");	
		SecondClass.fourthMethod();
	}

}
