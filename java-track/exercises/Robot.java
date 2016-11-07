
public class Robot {
	private String name;
	private int position;
	private int speed;
	private String orientation;
	
	public Robot (String name, int position, int speed, String orientation){
		this.name = name;
		this.position = position;
		this.speed = speed;
		this.orientation = orientation;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getPosition(int x, int y){
		return this.position;
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
	public int getOrientation(){
		return this.orientation;
	}
	
	public int rotateRobot(){
		
	}
	
	public int moveRobot(){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
