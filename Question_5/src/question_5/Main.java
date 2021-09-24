package question_5;

class Vehicle{
	private int no_of_seats;
	private int no_of_wheels;
	public Vehicle(int nseats, int nwheels) {
		this.no_of_seats = nseats;
		this.no_of_wheels = nwheels;
	}
	public int getNo_of_seats() {
		return no_of_seats;
	}
	public int getNo_of_wheels() {
		return no_of_wheels;
	}
	
}

public class Main {

	public static void main(String[] args) {
		int seats,wheels;
		Vehicle vl=new Vehicle(23,45);
		seats=vl.getNo_of_seats();
		wheels=vl.getNo_of_wheels();
		System.out.println("No of Seats: "+seats);
		System.out.println("No of Wheels: "+wheels);
		
		Vehicle vl1=new Vehicle(78,87);
		seats=vl1.getNo_of_seats();
		wheels=vl1.getNo_of_wheels();
		System.out.println("No of Seats: "+seats);
		System.out.println("No of Wheels: "+wheels);
		

	}

}
