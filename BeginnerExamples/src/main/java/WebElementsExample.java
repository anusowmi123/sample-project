import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.google.com/");
		
	//click,Sendkeys,clear commends	
		
		driver.findElement(By.linkText("Sign in")).click();
		
		WebElement email =driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		
		email.sendKeys("anu@gmail.com");
		email.clear();
		
		driver.quit();
	}

}
