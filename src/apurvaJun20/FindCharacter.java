package apurvaJun20;

public class FindCharacter {
    void findonechar(String input,char character) {
		int count=0;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index)==character ) {
				count++;
			}
		}
		 System.out.println( "Total count of " +character+ " in " +input + " is " +count+"\n" );
	}
	void allcharfind(String name){
		for(int index=0;index<name.length();index++) {
			findonechar(name,name.charAt(index));
		}	
	}
	void findeachString(String[] name)
	{ 
		for(int index=0;index<name.length;index++)
		{
		allcharfind(name[index]);
		}
	}

	public static void main(String[] args) {
		FindCharacter findcharacterarray= new FindCharacter();
		String name="Apurva";
		char character='a';
		System.out.println("--------Find one character---------\n");
	    findcharacterarray.findonechar(name,character);
	    String name1= "Shiro";
	    char character1='o';
	    findcharacterarray.findonechar(name1,character1);
	    System.out.println("----------Find all character-------------\n");
	    findcharacterarray.allcharfind(name1);
	    String[] allStringname= {"Apurva","Shiro"};
	    System.out.println("-----------Find character in String array-----------\n");
	    findcharacterarray.findeachString(allStringname);
	}

}
