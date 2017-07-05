
public class Enemy {

	private Player pEN = new Player(); 
	private int attack; 
	private int hp; 
	private int dropGold;
	private int dropXP; 
	

	Enemy(){
		
	}
	Enemy(int sattack, int shp){
		attack = sattack; 
		hp = shp; 
		dropGold = (int) (((Math.random()*pEN.getLevel())*12)+(5));
		dropXP = (int) (((Math.random()*pEN.getLevel())*20)+(5));
	}
	
	int getAttack(){
		return attack; 
	}
	
	void setAttack(int attk){
		attack = attk; 
	}
	
	int getHP(){
		return hp; 
	}
	
	void setHP(int nhp){
		hp = nhp; 
	}
	
	int getDropGold(){
		return dropGold; 
	}
	
	void setDropGold(int dg){
		dropGold = dg; 
	}
	
	int getDropXP(){
		return dropXP; 
	}
	
	void setDropXP(int dxp){
		dropXP = dxp; 
	}
	void updateDropGold(){
		dropGold = (int) (((Math.random()*pEN.getLevel())*12)+(5));
	}
	void updateDropXP(){
		dropXP = (int) (((Math.random()*pEN.getLevel())*20)+(5));
	}
	void updateEnemy(){
		updateDropXP(); 
		updateDropGold(); 
	}
	
}
