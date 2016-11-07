package blogz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post extends Entity {
	
	private String title;
	private String body;
	private User author;
	private Date created;
	private static final List<Post> allPosts = new ArrayList<Post>();
	
	public Post(String title, String body, User author){
		super();
		this.title = title;
		this.body = body;
		this.author = author;
		this.created = new Date();
		allPosts.add(this);
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getBody(){
		return body;
	}
	
	
}
