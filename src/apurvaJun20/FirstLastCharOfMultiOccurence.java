package apurvaJun20;

public class FirstLastCharOfMultiOccurence {

		void displayCount(String str) {
			int upper = 0, lower = 0, digit = 0, special = 0; 

			for(int index=0;index<str.length();index++) {
				char ch=str.charAt(index);
				if(Character.isDigit(ch))
					digit++;
				else if(Character.isUpperCase(ch))
					upper++;
				else if(Character.isLowerCase(ch))
					lower++;
				else
					special++;
			}
			
			System.out.println("String Given: "+str+"\nTotal Digit:--------> "+digit + "\nTotal Letters:------> "+(upper+lower)+ "\nTotal UpperCase:----> "+upper+"\nTotal LowerCase:----> "+lower+"\nTotal SpecialChar:--> "+special);
		}

		public static void main(String[] args) {
			FirstLastCharOfMultiOccurence firstLastCharOfMultiOccurence= new FirstLastCharOfMultiOccurence();

			String str="1rRpd3F9#K(E";
			firstLastCharOfMultiOccurence.displayCount(str);
		}

}
