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
	}
}
