package yashCJun20;

public class CharOccurance {
	
	void Charindex(String name) {
		
		for(int i=0;i<name.length();i++)
		{
		char ch=name.charAt(i);
		if(i == name.indexOf(ch) && i!=name.lastIndexOf(ch)){
			System.out.print(ch+" -> first index = "+name.indexOf(ch));
			System.out.println(" Last index = "+name.lastIndexOf(ch));
			
			}
		}
		
		}
		
	
	public static void main(String[] args) {
		
		CharOccurance charOccurance = new CharOccurance();
		String name ="technocredits";
		charOccurance.Charindex(name);
		
	
		}

}
