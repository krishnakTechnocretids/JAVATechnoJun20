package jagadeeshMJun20;
import java.util.Scanner;
public class ArrayBiggestName {
//Method to get biggest name from array
		String maxName(String[] name) {
			String max= name[0];
				for (int index=0; index<name.length; index++) {
					if( name[index].length() > max.length() ) 
						max = name[index];
				}
				return max;
		}
		public static void main (String [] args) {
			ArrayBiggestName arrayBiggestName = new ArrayBiggestName();
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter array size:");
			int size =scan.nextInt();
			String[] name = new String[size];
			for(int count=0; count <size; count++) {
			System.out.println("Enter name of Person: " + (count+1));
			name[count] = scan.next();
			}
			scan.close();
			System.out.println("Biggest Name of All is :"+arrayBiggestName.maxName(name));
			
		}
}
