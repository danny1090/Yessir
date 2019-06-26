package GroupTask;

public class RegistrationTest {

	public static void main(String[] args) {
		
		Registration obj=new Registration();
		obj.setEmail("johnsmith@gmail.com");
		obj.setUserName("johnsmith");
		obj.setPassword("Pasword678");
		
		System.out.println(obj.getEmail()+" is your valid email and "+obj.getUserName()
		+" is your User Name and "+obj.getPassword()+" is your password");
		
		
		
	}

}
