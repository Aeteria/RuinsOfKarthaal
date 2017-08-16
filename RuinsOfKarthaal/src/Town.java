
public class Town {
	
	private Building[] bld; 
	private String adjective; 
	
	public Town(){
		
	}
	
	public Town(Building[] bldgs, String adj){
		bld = bldgs; 
		adjective = adj; 
	}
	
	public void printTown(){
		System.out.print("You enter a " + adjective + " Town. It contains a ");
		for(int i = 0; i < bld.length; i++){
			if(i == bld.length - 1 ){
				System.out.print("and a ");
			}
			 System.out.print(bld[i].getName());
			 if(i != bld.length  - 1){
				 System.out.println(", "); 
			 }
		}
	}
}
