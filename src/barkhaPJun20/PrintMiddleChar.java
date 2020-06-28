package barkhaPJun20;

public class PrintMiddleChar {
	
	void findMiddleChar(String name) {
		String[] array=name.split(" ");  //String[] array=["Harsh" "Maulik"]
		
		for (int index=0; index<array.length;index++) {
			String nameFromArray=array[index];  //nameFromArray=Harsh   nameFromArray=Maulik
			int ans=(nameFromArray.length()/2);
			
					if (nameFromArray.length()%2!=0) {
					char ch=nameFromArray.charAt(ans);
					System.out.println("Middle Character of "+nameFromArray+" is "+ch);
					
				}else {
					char ch=nameFromArray.charAt(ans-1);
					System.out.println("Middle Character of "+nameFromArray+" is "+ch);
				}
			}
		}
	public static void main(String[] args) {
		 PrintMiddleChar  printmiddlechar=new  PrintMiddleChar();
		 
		 String inputName="Harsh Maulik";
		 printmiddlechar.findMiddleChar(inputName);	
	}	
}
	
	
		 
	


