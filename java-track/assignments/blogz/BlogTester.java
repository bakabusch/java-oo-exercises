package blogz;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class BlogTester {

/**	@Test
	public void CreateUser() {
		//int uid = new Random().nextInt(1000000) +1;
		//System.out.println(uid);
		User bob = new User("bob", "rat" );
		User fred = new User("fred", "pig");
		User kim = new User("kim", "dog");
		System.out.println(bob.getUid());
		System.out.println(fred.getUid());
		System.out.println(kim.getUid());
		assertEquals(bob.getUid(), 3, .01 );
		assertEquals(fred.getUid(), 4, .01 );
		assertEquals(kim.getUid(), 5, .01 );
	}
*/	
	@Test
	public void CreatePost(){
		User ted = new User("ted", "rat" );
		Post egg = new Post("ham", "bacon", ted );
		System.out.println(egg.getTitle());
		assertTrue(egg.getTitle().equals("ham"));
	}
	

}
