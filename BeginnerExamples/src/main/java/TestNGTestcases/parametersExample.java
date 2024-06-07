package TestNGTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parametersExample {
	
	@Parameters({"Username","Password"})
	@Test
  public  void parameters(String name ,String pass) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://practicetestautomation.com/practice-test-login/");
	
   	driver.findElement(By.id("username")).sendKeys(name);
	
   driver.findElement(By.id("password")).sendKeys(pass);
  
   driver.findElement(By.className("btn")).click();
   
   driver.close();
	}

}
