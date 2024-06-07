package TestNGTestcases;

import org.testng.annotations.Test;

public class pirorityExample {
@Test(priority = 1)
	public void SignUp() {
		System.out.println("SignUp");
	}
@Test(priority = 2)
public void Login() {
	System.out.println("Login");
}
@Test(priority = 3)
public void Search() {
	System.out.println("Search");
}
@Test(priority = 4)
public void logout() {
	System.out.println("logout");
}

}
