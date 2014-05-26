<<<<<<< HEAD
class bird extends animal{
	private String species;
	private String name;
	bird(String species,String name){
	super(species,name);
	}
	void speak (){
	System.out.println(this.name+" clucks");
	}

	void move(){
	System.out.println(this.name +" flies");
=======
package src;
class Bird extends Animal{
	
	Bird(String species,String name){
	super(species, name);
	}
	
	String speak (){
		return this.getName() + " "+"clucks";
	}

	String move(){
		return this.getName()+ " " +"flies";
>>>>>>> 0928bb14118c8b28dc7b7b347b1b17934943ccda
	}
}
