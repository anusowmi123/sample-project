package TestNGTestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDRopExample {
@Test
	public void dragDropn() {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
	WebElement drag=driver.findElement(By.id("myImage"));
	
	WebElement drop=driver.findElement(By.id("targetDiv"));

	Actions action = new Actions(driver);
	
	action.dragAndDrop(drag, drop).perform();
	
	driver.quit();
	}

}
