package yashCJun20;

public class CharOccurance {
	
	void Charindex(String name) {
		
		for(int i=0;i<name.length();i++)
		{
		char ch=name.charAt(i);
		if(i == name.indexOf(ch) && i!=name.lastIndexOf(ch)){
			System.out.print(ch+" -> first index = "+i);
		for(int index=0;index<name.length();index++) {
			if(index==name.lastIndexOf(ch)){
				System.out.println(" last index = "+index);
			}
		}
		
		}
		}
		
	}

	public static void main(String[] args) {
		
		CharOccurance charOccurance = new CharOccurance();
		String name ="technocredits";
		charOccurance.Charindex(name);
		
	
		}

}
