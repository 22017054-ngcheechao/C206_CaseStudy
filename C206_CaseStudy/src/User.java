
public class User {
private String username;
private String password;
private String email;
private String description;
private boolean isAdmin;
public User(String username, String password, String email, String description, boolean isAdmin) {
	super();
	this.username = username;
	this.password = password;
	this.email = email;
	this.description = description;
	this.isAdmin = isAdmin;
}
public String getUsername() {
	return username;
}
public String getPassword() {
	return password;
}
public String getEmail() {
	return email;
}
public String getDescription() {
	return description;
}
public boolean isAdmin() {
	return isAdmin;
}
public void display() {
    System.out.println("Username: " + username);
    System.out.println("Password: " + password); 
    System.out.println("Description: " + description);
}
}
