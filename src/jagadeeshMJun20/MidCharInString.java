package jagadeeshMJun20;

public class MidCharInString {
	void displayMidChar(String name) {
		String arr[]=name.split(" ");
		for(int index=0;index<arr.length;index++) {
			int i = (arr[index].length())/2;
			if(i%2 == 0)
				System.out.println(arr[index].charAt(i)+" is the middle character of "+arr[index]);
			else
				System.out.println(arr[index].charAt(i-1)+" is the middle character of "+arr[index]);
	}
	}
public static void main(String[] agrs) {
	MidCharInString midCharInString = new MidCharInString();
	String name = "Harsh Maulik";
	midCharInString.displayMidChar(name);
}
}
