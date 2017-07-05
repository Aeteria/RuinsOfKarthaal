
public class Potion {
	
	private String name; 
	private String description; 
	private int plusHealth; 
	private int plusMagic; 
	
	Potion(){
		plusHealth = 0; 
		plusMagic = 0; 
	}
	Potion(String pname, int ph, int pmaj){
		name = pname; 
		plusHealth = ph; 
		plusMagic = pmaj; 
	}
	
	int getPlusHealth(){
		return plusHealth; 
	}
	
	void setPlusHealth(int ph){
		plusHealth = ph; 
	}
	
	int getPlusMagic(){
		return plusMagic; 	
	}
	
	void setPlusMagic(int pmaj){
		plusMagic = pmaj; 
	}
	
	String getName(){
		return name; 
	}

	void setName(String pname){
		name = pname; 
	}
	
	String getDescription(){
		return description;  
	}
	
	void setDescription(String gd){
		description  = gd; 
	}
	
	
}
