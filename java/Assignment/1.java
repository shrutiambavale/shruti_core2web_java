
//Hierachical Inheritance

class HeroHonda{
	HeroHonda(){
		System.out.println("Hero Honda Motor Company");
	}
}
class Hero extends HeroHonda{
	Hero(){
		System.out.println("Hero Motor Company");
	}
}
class Honda extends HeroHonda{
	Honda(){
		System.out.println("Honda Motor Company");
	}
	public static void main(String[] args){
		Hero obj1=new Hero();
		Honda obj2=new Honda();
	}
}


//Multilevel Inheritance


class Character{
	Character(){
		System.out.println("Constructor of Character class");
	}
}
class CharacterArray extends Character{
	CharacterArray(){

		System.out.println("Constructor of CharacterArray class");
	}
}
class Str extends CharacterArray{
	Str(){
		System.out.println("Constructor of Str(String) class");
	}
	public static void main(String[] args){
		Str a=new Str();
	}
}





