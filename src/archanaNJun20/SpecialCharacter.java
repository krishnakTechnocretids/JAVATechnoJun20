package archanaNJun20;

public class SpecialCharacter {

	public static void main(String[] args) {
		String input=  "Kr[i{s]hn}_a,Tech";
		String name = input.replace("{", "").replace("[", "").replace("}", "").replace("_", "").replace(",", "").replace("]", "");
		int count=(input.length())-(name.length());
		System.out.println("total special characters are " +count);
	}
}
