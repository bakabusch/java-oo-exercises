
package blogz;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class User extends Entity{
	private String username;
	private String password;
	private static final List<User> allUsers = new ArrayList<User>();
	private static boolean isValidUsername; 
	
	public User(String username, String password){
		super();
		this.username = username;
		this.password = hashPassword(password);
		allUsers.add(this);
	}
	
	public static String hashPassword(String password){
		return password;	
	}
	
	public static ArrayList<User> getAllUsers(){
		return (ArrayList<User>) User.allUsers;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public String getUsername(){
		while(this.username != null && isValidUsername == true);
			return this.username;
		}
					
	
	public static boolean isValidUsername(String username){
			if (Pattern.matches( "[a-zA-Z][a-zA-Z0-9_-]{4,11}", username)){
				return true;
			}else{
				return false;
			}
		}
	
	public boolean isValidPassword(String password){
		if(this.password == hashPassword(password)){
			return true;	
		}else{
			return false;
		}
		
	}
	
	
}

