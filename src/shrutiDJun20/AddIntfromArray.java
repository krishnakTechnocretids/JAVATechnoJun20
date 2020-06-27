//String input = "1Hh9PR34QP";
//Hint : 1+9+3+4 [all digits]
//output : 17

package shrutiDJun20;

public class AddIntfromArray {
	int sum = 0;
	String num = "";
	void sumOfInt(String input){
		for(int i=0;i<input.length();i++){
			char ch = input.charAt(i);
			if(Character.isDigit(ch)){
				num = String.valueOf(ch);
				int number = Integer.parseInt(num);	
				sum = sum+number;
		}
		}
		System.out.println("Sum of all integer from String is "+sum);
	}	
	public static void main(String[] args) {
		AddIntfromArray addIntfromArray = new AddIntfromArray();
		addIntfromArray.sumOfInt("1Hh9PR34QP");
		
	}

}
