/* Print Pattern
Globant 
Globan 
Globa 
Glob 
Glo 
Gl 
G 
 */
package ajitSJune20;

public class StringPattern {

	public static void main(String[] args) {
		String str="Globant";
			for(int outerIndex=str.length();outerIndex>0; outerIndex--) {
				for(int innerIndex=0;innerIndex<outerIndex; innerIndex++) {
					System.out.print(str.charAt(innerIndex));
				}
				System.out.println(" ");
			}
		}

	}
