package amitaRJun20;

public class PrintMiddleCharOfWord {
	
	void findMiddleChar() {
		String input="Harsh Maulik";
		System.out.println("print middle character of : "+input);
		String[] array=input.split(" ");
		for(int index=0;index<array.length;index++) {
			String name=array[index];
			int middleChar=(name.length())/2;
			if(name.length()%2==0) 
				middleChar=((name.length()/2)-1);
			else
				middleChar=name.length()/2;			
			char ch=name.charAt(middleChar);
			System.out.println(ch+" is the middle character of "+name);
		}		
	}
	public static void main(String[] args) {
		PrintMiddleCharOfWord middleChar=new PrintMiddleCharOfWord();
		middleChar.findMiddleChar();
	}
}
