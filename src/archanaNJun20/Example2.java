package archanaNJun20;

public class Example2 {
	
		static int rno;
		String name;
		
		void DisplayData() {
			System.out.println(rno + " " + name);
		}
		
		public static void main(String[] args) {
			Example1 example1 = new Example1(); // name="M" [I] // rno=10 [S]
			example1.name = "Maulik";
		
			Example1 example2 = new Example1(); // name = "K" 
			example2.name = "Krishna";
			
			example1.displayData(); //
		}
}


