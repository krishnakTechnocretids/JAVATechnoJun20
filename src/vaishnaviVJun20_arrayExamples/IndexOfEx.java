package vaishnaviVJun20_arrayExamples;

public class IndexOfEx {
	
	void printFirstAndLastIndex(String s) {
		for(int index=0;index<s.length();index++) {
			char ch = s.charAt(index);
			int count=0;
			if(index == s.indexOf(ch)) {
				for(int i=0;i<s.length();i++) {
					if(ch== s.charAt(i))
						count++;				
				}
				if(count>1)
					System.out.println(ch +"--> first index= " +s.indexOf(ch) +" and Last index=" +s.lastIndexOf(ch) );
			}
		}
	}

	public static void main(String[] args) {
		IndexOfEx indexOfEx = new IndexOfEx();
        String s = "technocredits";
        indexOfEx.printFirstAndLastIndex(s);
	}

}
