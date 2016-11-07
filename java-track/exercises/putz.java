import java.util.Random;

public class putz {
	private int uid;
	
	
	public putz(int uid){
		//Random a = new Random();
		this.uid = new Random().nextInt(100000) +1;
	}
	
	public int getUid(){
		return this.uid; 
	}
	public static void main(String[] args) {
		putz myPutz = new putz(uid);
		System.out.println(myPutz.getUid);

	}

}
