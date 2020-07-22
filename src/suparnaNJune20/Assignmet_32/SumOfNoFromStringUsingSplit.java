package suparnaNJune20.Assignmet_32;

public class SumOfNoFromStringUsingSplit {
	public void sumOfStringNoUsingSplit(String inputStr) {
		int sum = 0, num = 0;
		String[] inputArrya = inputStr.split(" ");

		for (int index = 0; index < inputArrya.length; index++) {
			try {
				num = Integer.parseInt(inputArrya[index]);

				sum += num;

			} catch (NumberFormatException numberFormatException) {
			} catch (Exception e) {
				System.out.println("Parent Exception occurs");
			}
		}
		System.out.println("Sum = " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input : I have 5 years 6 month exp");
		new SumOfNoFromStringUsingSplit().sumOfStringNoUsingSplit("I have 5 yeras 6 month Exp");
	}
}
