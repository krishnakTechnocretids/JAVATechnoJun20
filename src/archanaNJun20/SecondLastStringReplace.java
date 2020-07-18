package archanaNJun20;
public class SecondLastStringReplace {
	void replaceSecondLastString(String input){
		if(input.contains("Globant")){
			String tempString=input.substring(0,input.lastIndexOf("Globant"));
			//Divide String in to 2 Parts
			String string1stPart=tempString.substring(0,tempString.lastIndexOf("Globant"));
			String string2ndPart=input.substring(tempString.lastIndexOf("Globant"),input.length());
			//replace first string from 2nd part of String
			String replaceString=string2ndPart.replaceFirst("Globant", "Technocredits");
			//Concat and print firstString with 2nd replaced String
			System.out.println("Output-->"+string1stPart.concat(replaceString));
		}
		else
			System.out.println("Given String is not present in String");
	}
	public static void main(String[] args) {
		SecondLastStringReplace secondLastStringReplace=new SecondLastStringReplace();
		String input="Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		System.out.println("Input-->"+input);
		secondLastStringReplace.replaceSecondLastString(input);
	}
}