package anupSJun20;

import java.util.Arrays;

/*String input = "Globant";
output : Globant
         Lobant
		 Obant
		 Bant
		 Ant
		 Nt
		 T*/
public class PrintStringCorrectSequence {

		void findtheprintcorrectorder(String str) {
			for(int index = 0;index <str.length()-1 ;index++) {
				System.out.println(str);
				str = str.substring(index+1,index+2).toUpperCase()+str.substring(index+2,str.length());
				index--;
				}
		}
		public static void main(String[] args) {
			PrintStringCorrectSequence printStringCorrectSequence = new PrintStringCorrectSequence();
			String str = "Globant";
			printStringCorrectSequence.findtheprintcorrectorder(str);
		}
	}
