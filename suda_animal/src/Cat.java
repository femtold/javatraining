<<<<<<< HEAD
class cat extends animal{
	private String species;
	private String name;
	cat(String species,String name){
	super(species,name);
	}
	void speak(){
	System.out.println(this.name +" mews");
	}
	void move(){
	System.out.println(this.name + " runs on four feets");	
=======
package src;

class Cat extends Animal{
	

	Cat(String species,String name){
	super(species, name);
	}
	
	String speak (){
		return this.getName() +" "+"mews";
	}

	String move(){
		return this.getName() +" "+"runs on four feet";
>>>>>>> 0928bb14118c8b28dc7b7b347b1b17934943ccda
	}
}
