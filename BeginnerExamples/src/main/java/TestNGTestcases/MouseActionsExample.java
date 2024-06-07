package TestNGTestcases;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActionsExample {
@Test
	public void mouseActions() {

	WebDriverManager.chromedriver().setup();	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//Moused hover
	
	Actions  action = new Actions(driver);	
	action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"))).build().perform();
	
// click the click function
	action.moveToElement(driver.findElement(By.linkText("Amazon miniTV"))).click().build().perform();
	driver.navigate().back();
	
//doubleclick function	
	
//	action.moveToElement(driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"))).click().sendKeys("Ipad").doubleClick().build().perform();
	
	 WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	 search.click();
	 search.sendKeys("Ipad");
	 action.moveToElement(search).doubleClick().build().perform();
	 search.clear();
 
//by using double click with parameter function.	
	
  //  action.doubleClick(driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"))).click().sendKeys("Ipad").doubleClick().build().perform();
	 
	
//RightClick or Contentclick
    action.contextClick(driver.findElement(By.linkText("Amazon miniTV"))).click().build().perform();
    
    
    driver.quit(); 
	}

	
	
}
