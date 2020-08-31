package shrutiDJun20CodeExams;

import java.util.ArrayList;

public class ATMpinVlidationCollection {
	
	boolean isDigit(String pin){
		for(int index =1; index < pin.length(); index++){
			
				if(!Character.isDigit(pin.charAt(index)))
					return false;
		}
		return true;
	}
	
	boolean isUnique(String pin){
		for(int index =1; index < pin.length(); index++){
		if(pin.indexOf(pin.charAt(index))== pin.lastIndexOf(pin.charAt(index))){
			return true;
			}
		}
		return false;
	}
	
	boolean isDescending(String pin) {
		for(int index =1; index < pin.length(); index++){
			if(pin.charAt(index)>pin.charAt(index-1))
				return false;
		}
		return true;
	}
	
	boolean isAscending(String pin) {
				for(int index =1; index < pin.length(); index++){
			if(pin.charAt(index)<pin.charAt(index-1))
				return false;
		}
		return true;
	}
	
		void validatePin(ArrayList<String> list){		
		for(int index=0; index<list.size(); index++){
			String pin = list.get(index);
			if(pin.length()==4)	{
				if(isDigit(pin) && isUnique(pin)&& isAscending(pin) || isDescending(pin) )
					System.out.println(pin + " is  valid");
				else
					System.out.println(pin + " is invalid");
			}	
			else
				System.out.println(pin + "- invalid pin. Should be a four digit number");
		}
		}
	public static void main(String[] args) {
		ATMpinVlidationCollection aTMpinVlidation = new ATMpinVlidationCollection();
		ArrayList<String> list = new ArrayList<>();
		list.add("9654");
		list.add("3578");
		list.add("97A2");
		list.add("9553");
		list.add("3687");
		list.add("98765");
		list.add("76$2");
		
		aTMpinVlidation.validatePin(list);
		
				
	}

}
