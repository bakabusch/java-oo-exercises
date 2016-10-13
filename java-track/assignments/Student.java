
public class Student {
	//fields
	private String Name;
	private int StudentID;
	private int Credits;
	private double GPA;
	
	
	//create student
	public Student(String firstName, String lastName, int StudentID){
		this.Name = firstName + " " + lastName;
		this.StudentID = StudentID;
		this.Credits = 0;
		this.GPA = 0;
	}
	
	public String getName(){
		return this.Name;
	}
	
	public int getStudentID(){
		return this.StudentID;
	}
	
	public double getGPA(){
		return this.GPA;
	}
	
	public int getCredits(){
		return this.Credits;
	}
	
	
	public String getClassStanding(){
		if(this.Credits >= 90){
			return "Senior";
		}else if(this.Credits >= 60){
				return "Junior";
			}else if(this.Credits >= 30){
				return "Sophomore";
			}else{
					return "Freshman";
				}
	} 
	
	public double submitGrade(double cGrade, int cCredit)
	{
		double g = (cGrade * cCredit) + (this.GPA * this.Credits);
		this.Credits = this.Credits + cCredit;
		
		double p = g/ this.Credits;
		this.GPA = (Math.round(p*1000)/1000.0);
		return this.GPA;
		
	}			
	public double computeTuition()
	{
		int c = (this.Credits / 15 * 20000); 
		double d = (this.Credits % 15 * 1333.33);
		double tuition = (c + d);
		return tuition;
	}
	
	public Student createLegacy(Student s1, Student s2 ){
		String dad = s1.getName(); 
		String mom = s2.getName();
		int ID = s1.getStudentID() + s2.getStudentID();
		Student punk = new Student(dad, mom, ID);
		punk.GPA = (s1.getGPA() + s2.getGPA())/2;
		if (s1.getCredits() > s2.getCredits()){
			punk.Credits = s1.getCredits();
			}else {
				punk.Credits = s2.getCredits();
		}
		return punk;
		
	}
	
	public String toString() {
		return (this.Name + " " + this.StudentID);
	}
	
	
	

}
