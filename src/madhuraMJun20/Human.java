package madhuraMJun20;

public class Human {
	
		String name;
		boolean canSpeak;
		int age;
		
		void humanName(String humanName)
		{
			name = humanName;
		}
		void canSpeak(boolean flag)
		{
			canSpeak = flag;
		}
		void humanAge(int humanAge)
		{
			age = humanAge;
		}
		void showDetails()
		{
			System.out.println("Name of human is : " + name);
			System.out.println("Can speak : " + canSpeak);
			System.out.println("Age of the human is : " + age);
		}
		public static void main(String[] args)
		{
			Human human = new Human();
			human.humanName("Prasad");
			human.canSpeak(true);
			human.humanAge(29);
			human.showDetails();
		}
}


