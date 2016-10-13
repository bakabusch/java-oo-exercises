import java.util.ArrayList;

public class Course {
	ArrayList<Student> RosterOfStudents  = new ArrayList<Student>();
	private String Name;
	private int Credits;
	private int remainingSeats;
	
	//create course:
	public Course(String Name, int Credits, int remainingSeats){
		this.Name = Name;
		this.Credits = Credits;
		this.RosterOfStudents = new ArrayList<Student>();
		this.remainingSeats = remainingSeats;
	}
	
	//create behaviors or methods:
	
	public String getName(){
		return this.Name;
	}
	
	public int getCredits(){
		return this.Credits;
	}
	
	public int getRemainingSeats() {
		return remainingSeats;
	}
	
	public boolean addStudent(Student s1){
		if (this.remainingSeats > 0 && RosterOfStudents.contains(s1) != true){
			RosterOfStudents.add(s1);
			this.remainingSeats = this.remainingSeats -1;
			return true;
			}else{
			//	System.out.println(s1);
				return false;
		}
		}

	public double averageGPA(){
		double butthead = 0.0;
		for(Student poindexter : RosterOfStudents){
			butthead = butthead + poindexter.getGPA();
		}
		double beavis = butthead / RosterOfStudents.size();
		//System.out.println(beavis);
		return beavis;	
	}
	
	
	public String toString() {
		return (this.Name + " " + this.Credits);
	}

	
/*
	public void setRemainingSeats(int remainingSeats) {
		this.remainingSeats = remainingSeats;
	}
*/	

}
