public class ConvertCasetoASCII {
	void convertCase(String[] inputArray) {
		for (int index = 0; index < inputArray.length; index++) {
			String name = "";
			for (int innerIndex = 0; innerIndex < inputArray[index].length(); innerIndex++) {
				if (inputArray[index].charAt(innerIndex) >= 'A' && inputArray[index].charAt(innerIndex) <= 'Z') {
					name += (char) (inputArray[index].charAt(innerIndex) + 32);
				} else if (inputArray[index].charAt(innerIndex) >= 'a' && inputArray[index].charAt(innerIndex) <= 'z') {
					name += (char) (inputArray[index].charAt(innerIndex) - 32);
				}
			}
			inputArray[index] = name;
			System.out.print("\"" + inputArray[index] + "\",");
		}
	}

	public static void main(String[] args) {
		ConvertCasetoASCII convert = new ConvertCasetoASCII();
		String[] inputArray = { "AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh" };
		convert.convertCase(inputArray);

	}
}