package question_4;

import java.util.Scanner;
class Rectangle{
	private float l;
	private float b;
	public float area_rec;
	

	public Rectangle(float len, float bre) {
		this.l = len;
		this.b = bre;
	}

	public float area_rec() {
	
		area_rec=l*b;
		return area_rec;
		
	}
	
	
}

public class Main {

	public static void main(String[] args) {
		float rec_Area;
		Rectangle rec=new Rectangle(4,5);
		rec_Area=rec.area_rec();
		System.out.println("Area of First Rectangle: "+rec_Area);
		
		Rectangle rec1=new Rectangle(5,8);
		rec_Area=rec1.area_rec();
		System.out.println("Area of Second Rectangle: "+rec_Area);
		
		
		

		
		
		

	}

}
