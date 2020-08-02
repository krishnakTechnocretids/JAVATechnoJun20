package technoCredits.collectionDemo.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListEnsureCap {

	public static void main(String[] args) {
		ArrayList<String> temp = new ArrayList<String>(); // 10
		temp.ensureCapacity(100);
		
		LinkedList<String> list = new LinkedList<String>();
		list.removeFirstOccurrence(new Integer(10));
		
		/*ChromeDriver driver = new ChromeDriver(); // 80 + 20
		WebDriver driver = new ChromeDriver(); // 80
		WebDriver driver = new WebDriver();// Interface
		
		FirefoxDriver driver = new FirefoxDriver(); // 80 + 10
		InternetExplorerDriver driver = new InternetExplorerDriver(); // 80 + 0
*/	}
}
