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
	}
}
