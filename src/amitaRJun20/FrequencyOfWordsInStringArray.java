package amitaRJun20;

public class FrequencyOfWordsInStringArray {
	
	void frequencyOfEveryWord(){
		String str="Tech_no Hi T_EchNo H_I Tech hi_";
		System.out.println("The Input string is :"+str);
		str=str.toLowerCase().replace("_", "");
		String[] array=str.split(" ");
		System.out.println("Frequency of every word : ");
		for(int index=0;index<array.length;index++){	
			int count=1;
			if(!array[index].equals("0")) {
				for(int j=index+1;j<array.length;j++){
					if(array[index].equals(array[j])){
						count++;
						array[j]="0";
					}
				}
				System.out.println(array[index]+" --> "+count);	
			}		
		}
	}
	public static void main(String[] args) {
		FrequencyOfWordsInStringArray wordFrequency=new FrequencyOfWordsInStringArray();
		wordFrequency.frequencyOfEveryWord();
	}
}
