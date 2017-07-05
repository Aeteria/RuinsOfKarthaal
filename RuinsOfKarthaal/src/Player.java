
public class Player {

	private int gold; 
	private int health;
	private int magicka; 
	private int experience; 
	private int xpCap; 
	private int level;  
	private String[] inventory;  
	//private int exCode; 
	
	Player(){	
		gold = 0; 
		health = 0; 
		magicka = 0; 
		inventory = new String[15] ; 
		xpCap = 100; 
		level = 1; 
	}
	
	Player(int sgold, int shealth, int smagicka){
		gold = sgold; 
		health = shealth; 
		magicka = smagicka; 
		inventory = new String[15] ;
		xpCap = 100; 
		level = 1; 
	}
	
	int getHealth(){
		return health; 
	}
	
	void setHealth(int nh){
		health = nh;  
	}
	
	int getMagicka(){
		return magicka; 
	}
	
	void setMagicka(int nm){
		magicka = nm; 
	}
	
	int getGold(){
		return gold; 
	}
	
	void setGold(int ng){
		gold = ng; 
	}
	int getXP(){
		return experience; 
	}
	
	void setXP(int nxp){
		experience = nxp; 
	}
	
	int getLevel(){
		return level; 
	}
	
	void setLevel(int lvl){
		level = lvl; 
	}
	
	void updateLevel(){
		if(experience >= xpCap){
			experience -= xpCap; 
			level++;
		}
	}
	void updateXpCap(){
		if(experience >= xpCap){
			xpCap *= 1.5; 
		}
	}

	void printInventory(){
		for(int i = 0; i < inventory.length; i++ ){
			if(i%3 == 0){
				System.out.println(); 
			}
			System.out.print("[" + (i + 1) + "] " + inventory[i] + "  ");
		}
	}
	
	void printMenu(){
		System.out.println("[1] Inventory");
		System.out.println("[2] Exit");
	}

}
