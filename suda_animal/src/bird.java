class bird extends animal{
	private String species;
	private String name;
	bird(String species,String name){
	super(species,name);
	}
	void speak (){
	System.out.println(this.name+"clucks");
	}

	void move(){
	System.out.println(this.name +"flies");
	}
}
