package jagadeeshMJun20;
import java.util.Scanner;
public class FrequencyOfChar1 {
	int getFrequency(String[] name, char ch) {
		int count=1;
		for(int index=0;index<name.length;index++) {
			for(int i=0;i<name[index].length();i++) {
			if(name[index].charAt(i) == ch)
				count++;
			}
		}	
		return count;
	}
	public static void main(String[] args) {
		FrequencyOfChar1 frequencyOfChar1 = new FrequencyOfChar1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size = scanner.nextInt();
		String[] name = new String[size];
		System.out.println("Enter the character whose frequency to be verified:");
		char ch = (scanner.next()).charAt(0);
		for(int index=0; index<name.length;index++) {
			System.out.println("Enter name at index "+(index+1)+":");
			name[index]=scanner.next();
		}
			scanner.close();
			System.out.println(frequencyOfChar1.getFrequency(name,ch));
	}
}
