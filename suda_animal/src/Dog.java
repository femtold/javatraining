<<<<<<< HEAD
class dog extends animal{
	private String species;
	private String name;
	dog(String species,String name){
		super(species,name);
	}
	void speak(){
		System.out.println(this.name +  " barks");
	}
	void move(){
		System.out.println(this.name +" runs on four feet");
	}
=======
package src;

public class Dog extends Animal {

	Dog(String species, String name) {
		super(species, name);
	}
	
	String speak(){
		return this.getName() +" "+"barks";
	}
	
	String move(){
		return this.getName() +" "+"runs on four feet";
	}

>>>>>>> 0928bb14118c8b28dc7b7b347b1b17934943ccda
}
