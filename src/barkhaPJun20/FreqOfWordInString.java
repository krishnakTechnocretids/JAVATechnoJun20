package barkhaPJun20;

public class FreqOfWordInString {
	
	void findWordFreq(String name) {
		     name=name.replace("_","").toLowerCase();   //name="techno hi techno hi tech hi"
		    // name=name.toLowerCase();
		     
		     String[] words=name.split(" ");  //String[] words=["techno", "hi", "techno", "hi", "tech", "hi"]
		     
		     System.out.println("Frequency of Every Character:");
		     
		     for (int outerIndex=0; outerIndex<words.length; outerIndex++) {
		    	 int count=1;
		    	 if (!words[outerIndex].equals("REPEAT")) {
		    		 for (int innerIndex=(outerIndex+1); innerIndex<words.length; innerIndex++) {
		    			 if (words[outerIndex].equals(words[innerIndex])) {
		    				 count++;
		    				 words[innerIndex]="REPEAT";
		    				 
		    			 }
		    			 
		    		 }
		    		 System.out.println(words[outerIndex]+"==>"+count);
		    	 }
		    	
		     }
	}		    	
	public static void main(String[] args) {
		FreqOfWordInString freq=new FreqOfWordInString();
		
		String inputName="Tech_no Hi T_EchNo H_I Tech hi_";
		
		freq.findWordFreq(inputName);
		
	}

}						
		     

		
			
	
			
		
	


	

	
		
			
		
	
					
				
			
			
	
		
	
		
		
	
	
	
