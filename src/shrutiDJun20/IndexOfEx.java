package shrutiDJun20;

public class IndexOfEx {
// find index no of all char in a string
	
	void findindex(String name){
		for(int index = 0; index<name.length(); index++){
			char ch= name.charAt(index); //we got the cahrecter values 
			//System.out.println("Index of "+ ch+" is "+ name.indexOf(ch));//	name.indexOf(ch) gives the index no. of char in that string
					int count = 0;
					if(index== name.indexOf(ch)){
					for(int innerindex=0;innerindex<name.length();innerindex++){
						if(ch==name.charAt(innerindex))
								count++;
			}
					System.out.println(ch +"-->"+ count);
					}
					
		}

	}
	
	public static void main(String[] args) {
		IndexOfEx indexOfEx = new IndexOfEx();
		indexOfEx.findindex("shrutishr");
	}
	
	
}
