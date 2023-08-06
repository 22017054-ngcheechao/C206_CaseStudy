
public class Registration {

    private String name;
    private String email;
    private String contact;
    private String emerContact;
    private int age;

    public Registration(String name, String email, String contact, String emerContact,int age) {
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.emerContact=emerContact;
        this.age=age;
    }

    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public String getContact() {
    	return contact;
    }
    public String getEmerContact() {
    	return emerContact;
    }
    public int getAge() {
    	return age;
    }


	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Phone No: "+contact);
		System.out.println("Age: "+age);
		
	}
    
    

}
