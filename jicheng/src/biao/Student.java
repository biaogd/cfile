package biao;

public class Student extends Person{
	public String grade;
	public Student(){}
	public Student(String name,int age,int height,String grade) {
		super(name,age,height);
		this.grade=grade;
	}
	public void sayHello() {
		System.out.println("I am a student");
	}
}
