public class Weapon {

	String name; 
	int attack; 
	
	Weapon(){
		attack = 0; 
	}
	
	Weapon(String wname,  int nattack){
		name = wname; 
		attack = nattack; 
	}
	
	int getAttack(){
		return attack; 
	}
	
	void setAttack(int attk){
		attack = attk; 
	}
	
	String getName(){
		return name; 
	}
	void setName(String nme){
		name = nme;
	}
	
	
}
