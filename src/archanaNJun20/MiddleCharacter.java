package archanaNJun20;

public class MiddleCharacter {

	public static void main(String[] args) {
		String input = "Harsh Maulik";
		String array[]=input.split(" ") ;
		for(int index=0;index<array.length;index++){
			if(array[index].length()%2==0){				
				int middle=(array[index].length()/2)-1;
				char ch=array[index].charAt(middle);
				System.out.println(ch +" is "+"Middle character in " +array[index] );
			}
			else{
				int middle=(array[index].length()/2);
				char ch=array[index].charAt(middle);
				System.out.println(ch +" is "+"Middle character in " +array[index] );
			}
		}
	}
}
