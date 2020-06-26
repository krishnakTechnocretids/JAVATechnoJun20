package anshuKJun20;

public class CharacterIndex {
	
 void findIndex(String name) {
	 for(int index = 0 ;index < name.length();index++){
		 char ch = name.charAt(index);
		   if(name.indexOf(ch)== index) {
		      if(name.indexOf(ch)!=name.lastIndexOf(ch)) {
		    	  System.out.println(ch+"--> first index : "+name.indexOf(ch)+" ,Last index : "+name.lastIndexOf(ch)+"\n");
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