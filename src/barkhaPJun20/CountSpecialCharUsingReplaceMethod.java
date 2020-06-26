package barkhaPJun20;

public class CountSpecialCharUsingReplaceMethod {
	
	void findSpecialChar(String name) {
		
		String name1=name.replace("{", "").replace("[", "").replace("]", "").replace(",", "").replace("}", "");						
				
			//String name1=name.replace("{", "");
			//String name2=name1.replace("[", "");
			//String name3=name2.replace("]", "");
			//String name4=name3.replace(",", "");
			//String name5=name4.replace("}", "");
	
	System.out.println("Length of Special Character is: "+(name.length()-name1.length()));
	}
	public static void main(String[] args) {
		CountSpecialCharUsingReplaceMethod count=new CountSpecialCharUsingReplaceMethod();
		 String name="Kr[i{s]hn}a,Tech";
		 
		 count.findSpecialChar(name);
	}

}		
		
		
	
