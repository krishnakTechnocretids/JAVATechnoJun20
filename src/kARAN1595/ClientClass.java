package kARAN1595;
/*Assignment 10 : 18th Jun Assignment : 

Write a code based on the above figure, [create 4 classes and 1 client class having main method]. from the main method, you will call the m1 method of call A as mentioned in the figure.

For today's assignment for better clarity you can use FirstClass, SecondClass, ThridClass, ForthClass, Client as a class name.
Method name can be firstMethod, secondMethod and so on.

 */
public class ClientClass {

	public static void main(String[] args) {
		FirstClass first = new FirstClass();
		first.m1();
	}
}