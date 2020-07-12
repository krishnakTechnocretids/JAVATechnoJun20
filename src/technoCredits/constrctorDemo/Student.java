package technoCredits.constrctorDemo;

 class Student {
	int rno;
	String name;
	
	public Student(int stdRno, String stdName){ //2
		rno = stdRno; //3
		name = stdName; //4
		// prime
	} //5
	
	private Student(int stdrno){ //17
		rno = stdrno; //18
	} //19
	
	Student(String stdName){ //12
		name = stdName; //13 
	} //14

	void display() { //8
		System.out.println(rno + ":" + name); //9
	} //10
	
	public static void main(String[] args) {
		Student student1 = new Student(1,"Maulik"); // 1 //6
		student1.display(); //7
		Student student2 = new Student("Techno"); //11 //15
		Student student3 = new Student(10); // 16 //20
		//student1.display();
	
	}
}
