package anshuKJun20;

public class CharacterIndex {
	
 void findIndex(String name) {
	 for(int index = 0 ;index < name.length();index++) {
		 int count=0;
		 char ch = name.charAt(index);
		 if(name.indexOf(ch)== index) {
		    for(int i =0;i<name.length();i++) {
		        if(name.charAt(i)== ch) {
			      count++;
			        if(count>1) {
				       System.out.println("Index of "+ch+name.indexOf(ch)+"last index of"+ch+name.lastIndexOf(ch));
				        break;
			        }
		          }
		       }
		     }
	      }
       }
		 
		 
    public static void main(String[] args) {
	 CharacterIndex charcterindex = new CharacterIndex();
	 String name = "technocredits";
	 charcterindex.findIndex(name);
}
}
