package apurvaJun20;

public class Armstrong {

		static void checkArmstrong(int a) {
			int total = 0;
			int number = a;
			for (; number != 0; number /= 10)
				// total += (number % 10) * (number % 10) * (number % 10);
				total += Math.pow((number % 10), 3);

			if (total == a)
				System.out.println(a + " is an Armstrong number");
			else
				System.out.println(a + " is not an Armstrong number");
		}

		public static void main(String[] args) {

			int a = 153;
			checkArmstrong(a);
		}
	}


