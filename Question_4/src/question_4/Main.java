package question_4;

import java.util.Scanner;

class Student{
	private String name;
	private int age;
	private String address;
	Student() {
		this.name="unknown";
		this.age=0;
		this.address="not available";
	}
	public void setInfo(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void setInfo(String name,int age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void Disp() {
		System.out.println("name= " + name + " age=" + age + " address= " + address );
	}	
}


public class Main {

	public static void main(String[] args) {
		String name;
		int age;
		String address;
//		Student s1=null;
//		s1=new Student();
//		s1.Disp();
		Scanner sc=new Scanner(System.in);
		Student s1[]=new Student[10];
		
		for(int i=0;i<10;i++) {
			s1[i]=new Student();
//			System.out.println("Enter Name");
//			name=sc.next();
			System.out.println("Enter Age");
			age=sc.nextInt();
			System.out.println("Enter Address");
			address=sc.next();
			s1[i].setInfo(sc.next(), age, address);
			System.out.print("\n");
		}
		System.out.print("\n\n\n\n");
		for(int i=0;i<10;i++) {
			s1[i].Disp();
		}
	}
}


