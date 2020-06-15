
public class Area {
	void rectangle(int l, int b){
		System.out.println("Area of Rectangle is " + (l*b)); 
		System.out.println("Perimeter of Rectangle is " + 2*(l+b));
		System.out.println("");
		
	}
	
	void circle(double pi, double r){
		System.out.println("Area of Circle is " + (pi*r*r));
		System.out.println("Perimeter of Rectangel is " + (2*pi*r));
	}
	
	public static void main (String[] args){
		Area area = new Area();
		area.rectangle(10,20);
		area.circle(3.1416, 3.5);
	}

}
