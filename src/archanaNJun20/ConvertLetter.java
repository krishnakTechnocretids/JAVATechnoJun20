package archanaNJun20;

public class ConvertLetter {
	void convertStringLetter(String [] array) {
		System.out.print("{");
		for(int outerIndex=0;outerIndex<array.length;outerIndex++) {
			String newString="";
			for(int innerIndex=0;innerIndex<array[outerIndex].length();innerIndex++) {
				if(array[outerIndex].charAt(innerIndex)>='A'&&array[outerIndex].charAt(innerIndex)<='Z')
					newString+=(char)(array[outerIndex].charAt(innerIndex) + 32);
				else
					newString+=(char)(array[outerIndex].charAt(innerIndex) - 32);
			}
			System.out.print(newString +",");
		}System.out.print("}");
	}
	public static void main(String[] args) {
		ConvertLetter convertLetter=new ConvertLetter();
		String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};
		convertLetter.convertStringLetter(array);
	}
}