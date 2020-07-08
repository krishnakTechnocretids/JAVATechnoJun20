package technoCredits.abstraction;

import java.util.TreeMap;

public abstract class AbstractWithAllAbstract extends Child implements InterfaceA{
	
	final void m5() {
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put(null, "Hi");
	
	}
	
}
