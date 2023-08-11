import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class C206_CaseStudyTest {
	private Registration r1;
	private ArrayList<Registration> registrations;
	private ArrayList<User> userList;
	public static User currentUser;
	  


	@Before
	public void setUp() throws Exception {
		r1=new Registration("John Doe", "john@gmail.com", "12345678", "87654321", 30);
		registrations=new ArrayList<>();
		userList = new ArrayList<>();
	
	}
	

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	@Test
	public void testAddRegistration_NormalCase() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Registrations arraylist to add to", registrations);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
	    //The item just added is as same as the first item of the list
		simulateUserInput("John Doe", "john@example.com", "12345678", "87654321", 30);
		C206_CaseStudy.addRegistration(registrations);
		assertEquals("Check that Registration arraylist size is 1", 1, registrations.size());
		assertEquals("Check that name is same", "John Doe", registrations.get(0).getName());
	    
    }
	
	@Test
    public void testaddRegistration_invalidEmail() {
        // Test a valid email address
        String validEmail = "john@example.com";
        assertTrue(C206_CaseStudy.validEmail(validEmail));
	}
	 private void simulateUserInput(String name, String email, String phone, String emerContact, int age) {
	        System.setIn(new ByteArrayInputStream((name + "\n" + email + "\n" + phone + "\n" + emerContact + "\n" + age + "\n").getBytes()));
	    }
	@Test
    public void testDeleteRegistration_CancelDeletion() {
        // Add a registration for testing deletion
        registrations.add(new Registration("Bob Smith", "bob@example.com", "98765432", "12345678", 40));

        // Simulate user input for deletion cancellation
        SimulateUserInput("Bob Smith", "false");

        // Perform deletion cancellation
        C206_CaseStudy.deleteRegistration(registrations);

        assertEquals(1, registrations.size());
    }
	
	@Test
    public void testDeleteRegistration() {
	  registrations.add(new Registration("Paul", "paul789@gmail.com", "94562003", "85643446", 23));
	  
	  SimulateUserInput("Paul","true");

        // Perform deletion
        C206_CaseStudy.deleteRegistration(registrations);

        assertEquals(0,registrations.size());
    }
	
  
  @Test
    public void testDeleteRegistration_UserNotFound() {
        // Add a registration for testing deletion
        registrations.add(new Registration("Eve Johnson", "eve@example.com", "54321098", "12345678", 22));

        // Simulate user input for non-existing user
        SimulateUserInput("Milan Shaju", "true");

        // Perform deletion for a non-existing user
        C206_CaseStudy.deleteRegistration(registrations);

        assertEquals(1, registrations.size());
    }
  private void SimulateUserInput(String input, String input2) {
		// TODO Auto-generated method stub
	    	
	    	System.setIn(new java.io.ByteArrayInputStream((input + "\n" + input2 + "\n").getBytes()));
	}
		

   
        
}



	  