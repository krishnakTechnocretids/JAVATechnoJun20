package abhijitMJun20;

public class Indexofuse {
	void indexuseof(String name){
		for(int index=0;index<name.length();index++){
			char ch= name.charAt(index);
			if(index==name.indexOf(ch)) {
			System.out.println(ch+" First index "+name.indexOf(ch) +" Last index "+name.lastIndexOf(ch)  );
			}
		}	
		/*for(int index=0;index<name.length();index++)
		{
			int count=0;
			char ch= name.charAt(index);
			if(index==name.indexOf(ch)) {
			  for(int i=0;i<name.length();i++)
			  {
				  if(ch==name.charAt(i)) {
					  count++;
				  }
				  
			  }
			  System.out.println(ch +"" +count);
			}
			//System.out.println(ch +"  "+ name.indexOf(ch));
		}*/
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="abhijitmali";
		Indexofuse indexofuse= new Indexofuse();
		indexofuse.indexuseof(name);
	}
}
