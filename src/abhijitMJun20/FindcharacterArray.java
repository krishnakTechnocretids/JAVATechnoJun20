package abhijitMJun20;

public class FindcharacterArray {
    
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
		FindcharacterArray findcharacterarray= new FindcharacterArray();
		String name="Abhijit";
		char charecter='i';
		System.out.println("--------Find one character---------\n");
	    findcharacterarray.findonechar(name,charecter);
	    String allname= "Rajkumar";
	    System.out.println("----------Find all character-------------\n");
	    findcharacterarray.allcharfind(allname);
	    String[] allStringname= {"Raj","Abhijit"};
	    System.out.println("-----------Find character in String array-----------\n");
	    findcharacterarray.findeachString(allStringname);
	}

}

