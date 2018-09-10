package biao;

public class Person {
	public String name;
	protected int age;
	private int height;
	public static byte buffer; 
	public Person() {}
	public Person(String name,int age,int height) {
		this.name=name;
		this.age=age;
		this.height=height;
	}
	static {
		buffer=20;
	}
	public int getHeight(){
		return this.height;
	}
	public void sayHello() {
		System.out.println("hellow world");
	}
}
