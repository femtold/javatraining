<<<<<<< HEAD
class duck extends animal{
	private String species;
        private String name;
	duck(String species,String name){
		super(species,name);
	}
	void speak(){
		System.out.println(this.name+"  lucks");
	}
 	void move(){
		System.out.println(this.name+"  swims");
=======
package src;

class Duck extends Animal{
	
	Duck(String species,String name){
	super(species, name);
	}
	String speak (){
		return this.getName() +" "+ "clucks";
	}

	String move(){
		return this.getName() +" " +"swims";
>>>>>>> 0928bb14118c8b28dc7b7b347b1b17934943ccda
	}
}
