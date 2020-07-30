package technoCredits.collectionDemo.list;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Student {

	int rno;
	String name;
	
	public Student(int rno, String name) {
		this.rno = rno;
		this.name = name;
	}

	void display() {
		System.out.println(name + ":" + rno);
	}
	
	public static Predicate<Student> isStudentAllowed() 
	{
	    System.out.println("-----------");
		return p -> p.rno > 10;
	}
	
	void m2() {
		String x = "abcde";
		String y = "deabc";
		int count = 1;
		for(int index=0;index<x.length();index++) {
			x = x.substring(x.length()-1) + x.substring(0,x.length()-1);
			System.out.println(x);
			if(x.equals(y)) {
				System.out.println("Total iteration required to match a string " + count++);
				break;
			}
			
		}
		System.out.println("Total iteration " + count);
		
	}
	
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(9,"Maulik"));
		al.add(new Student(11,"Krishna"));
		al.add(new Student(12,"Harsh"));
		
		al.removeIf(p -> p.rno>10);
		System.out.println(al.size());
		new Student(10, "").m2();
	}
}
