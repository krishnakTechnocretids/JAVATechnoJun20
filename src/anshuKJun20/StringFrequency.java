package anshuKJun20;
/*Find Frequency of every word in a given String.
Rules:
a) Word should be compare without case sensitivity.
b) Word should be compare without special character. [use replace method]

    Input = "Tech_no Hi T_EchNo H_I Tech hi_"
    output : 
    Frequency of every word:
              techno -> 2
              hi -> 3
              tech -> 1 */
public class StringFrequency {
  void findFrequency(String name){
	 
	String newname=   name.toLowerCase().replace("_", "");
	String[] newarr = newname.split(" ");
	  for(int i = 0;i < newarr.length;i++) {
		   int count =1;
		   if(!newarr[i].equals("*")) {
		   for (int j =(i+1);j< newarr.length;j++) {
			   if(newarr[i].equals(newarr[j])) {
				   count++;
				   newarr[j]="*";
			   }
			 }
		    System.out.println(newarr[i]+"-->"+count);
		   }
		}
	
	}
	     
  public static void main(String[] args) {
    	StringFrequency stringfrquencymethod = new StringFrequency();
    	String name = "Tech_no Hi T_EchNo H_I Tech hi_";
    	stringfrquencymethod.findFrequency(name);
      }
}
