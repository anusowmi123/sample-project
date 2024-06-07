package TestNGTestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsExample {
	//invocationcount runs the same testcases for 3 time in 1 after 1 flow.
	
//@Test(invocationCount = 3,invocationTimeOut = 20000)
	
@Test(invocationCount = 3,threadPoolSize = 3)

// threadpoolsize runs the same testcases for 3 time parallely different tabs 

	public void WebElement() {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get(" https://www.google.com/");
		
	//click,Sendkeys,clear commends	
		
		driver.findElement(By.linkText("Sign in")).click();
		
		WebElement email =driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		
		email.sendKeys("anu@gmail.com");
		email.clear();
		
		driver.quit();
	}

}
