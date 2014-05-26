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
}
