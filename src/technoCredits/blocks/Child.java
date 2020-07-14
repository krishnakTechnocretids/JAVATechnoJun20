package technoCredits.blocks;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Child extends Parent{
	int x = 10;
	
	{
		System.out.println("Child NS block"); // 10
		
	}
	
	public Child() { //3
		super();// 4 //9
		System.out.println("Child Constructor"); // 11
	}
	
	
	public static void main(String[] args) {
		System.out.println("Start"); // 1
		Child child = new Child(); // 2 //12
		System.out.println("End"); //13
	}
}
