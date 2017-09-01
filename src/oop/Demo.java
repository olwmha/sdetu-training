package oop;


//Instead of creating individual objects with each of these attributes can create a class with all the attributes 
class Person {
		String name;
		String email;
		String phone;
		
		
		//add void in front of functions to make them methods in the class
		void walk(){
			System.out.println(name + "is walking");
		}
		
		void eat(){
			System.out.println(email);
		}
		
		void sleep(){
			System.out.println(name + "is sleeping");
		}
	}

	
public class Demo {
	//Instatiating an object. Create a variable and point it to the class defined above and the keyword new is Java making space for that variable.
	public static void main(String[] args){
	Person person1 = new Person();
	//Define properties in the object
	person1.name = "Joe";
	person1.email = "joe@gmail.com";
	person1.phone = "0827812841";
	
	//abstraction: only want elements necessary for the time
	person1.walk();
	person1.eat();
	
	Person person2 = new Person();
	
	person2.name = "Olwethu";
	person2.email = "olwmha@gmail.com";
	person2.phone = "0713525722";
	
	person2.walk();
	person2.eat();
	}
}
