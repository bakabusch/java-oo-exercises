package blogz;

import java.util.Random;


public abstract class Entity {
	private final int uid;
	protected static int counter = 0;	
	public Entity(){
		
		//Generates a number between 0 and 999999 and then adds one
		counter ++;
		this.uid = counter;
		
				//new Random().nextInt(1000000) +1;
	}
	
	public int getUid(){
		return this.uid; 
	}
}