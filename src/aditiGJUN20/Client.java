/*
 Assignment 10 : 18th Jun Assignment : 
 write a code based on above figure, [create 4 classes and 1 client class having main method]. 
 From main method you will call m1 method of call A as mentioned in figure.
 */

package aditiGJUN20;

public class Client {
	
	
	public static void main(String[] args) {
		Service1 service1 = new Service1();
		System.out.println("From main method of client class calling non-static method m4() of Service1 Class.");
		service1.m1();// Calling non-static method m1() of Service1 class 
	}

}
