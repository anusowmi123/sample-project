package TestNGTestcases;

import org.testng.annotations.Test;

public class dependsonMethodExample {

	//Ensuring specific tests run only after others have succeeded
	
   @Test
   public void SignUp() {
	System.out.println("SignUp");
	}
		
	@Test(dependsOnMethods = "SignUp") 
	public void Login() {
		System.out.println("Login");
		throw new RuntimeException(); 
	}

	@Test(dependsOnMethods ="Login" )
	public void Search() {
		System.out.println("Search");
	}
	
	@Test
	public void logout() {
		System.out.println("logout");
	}
	}


