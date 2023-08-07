import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Registration r1;
	private Registration r2;
	
	private ArrayList<Registration> registrations;
	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
	
		
	}
	

	@After
	public void tearDown() throws Exception {
		r1 = null;
		r2 = null;
		registrations = null;
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	@Test
    public void testValidEmail() {
        // Test a valid email address
        String validEmail = "john@example.com";
        assertTrue(C206_CaseStudy.validEmail(validEmail));
    }
	 @Test
	    public void testRegister_UserExists() {
	        // Create a sample list of users
	        ArrayList<User> userList = new ArrayList<>();
	        userList.add(new User("Paul", "Paul@789", "paul789@gmail.com", "biker2", false));
	        boolean result = C206_CaseStudy.register(userList, "Paul");
	        assertTrue(result);
	    }

}