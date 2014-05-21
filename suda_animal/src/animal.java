class animal{
   private String species;
   private String name;
   private String color;
   private String gender;
   
   animal(String species,String name){
      this.species=species;
      this.name=name;
   }
   
   void speak(){
   }
   
   void move(){
   }

   void setColor(String color){
      this.color=color;
   }

   void setGender(String gender){
      this.gender=gender;
   }
   
   String getColor(){
      return this.color;
   }

   String getGender(){
      return this.gender;
   }
   
   String getName(){
      return this.name;
   }
   
   String getSpecies(){
      return this.species;
   }
}
