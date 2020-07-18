//Replace second last Globant with Technocredits.

package aavrutiDJun20;

public class ReplaceSecondLastOccurence {

	void replaceSecondLastOccurenceOfString(String input,String replaceInput,String orgValue) {
		System.out.println("Input --> " + input);
		String newInput = input.substring(0,input.lastIndexOf(orgValue));
		if(newInput.contains(orgValue)) {
			String tempValue1 = input.substring(input.lastIndexOf(orgValue));
			String newInput2 = newInput.substring(0,newInput.lastIndexOf(orgValue));
			String tempValue2 = newInput.substring(newInput.lastIndexOf(orgValue)+orgValue.length());
			newInput2 += replaceInput + tempValue2 + tempValue1;
			System.out.println("Output --> " + newInput2);
		}else {
			System.out.println("There is only one occurence of " + orgValue + " in given String");
		}
	}
	
	public static void main(String[] args) {
		ReplaceSecondLastOccurence replaceSecondLastOccurence = new ReplaceSecondLastOccurence();
		String input ="Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		String orgValue = "Globant";
		String replaceInput = "Technocredits";
		replaceSecondLastOccurence.replaceSecondLastOccurenceOfString(input,replaceInput,orgValue);
	}
}
