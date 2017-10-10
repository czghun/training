package Oop;

class Person{
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking.");
	}
	
	void eat() {
		System.out.println(email);
	}
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class Demo {
	public static void main (String[] args) {
		Person person1= new Person();
		person1.name= "Joe";
		person1.email= "joe@bananaz.com";
		person1.phone= "12323332";
		
		person1.walk();
		person1.eat();
		person1.sleep();
		
		
		
		
		/*String name= "Dóri";
		String email= "dori@testmail.com";
		String phone= "01331244124";
		
		//System.out.println(name +" is walking.");
		walking(name);;
		System.out.println(name +" is eating.");
		
		String name2= "Gábor";
		String email2= "gabor@testmail.com";
		String phone2= "01424512624";
		
		//System.out.println(name2 +" is walking.");
		walking(name2);
		System.out.println(name2 +" is eating.");
		
	}
	static void walking(String name){
		System.out.println(name +" is walking.");
		*/
		
	}
}
