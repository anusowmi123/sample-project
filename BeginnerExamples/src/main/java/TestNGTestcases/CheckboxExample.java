package TestNGTestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxExample {
   @Test
	public void checkBox()throws InterruptedException {
		
   WebDriverManager.chromedriver().setup();
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://artoftesting.com/samplesiteforselenium");
   
//	 Scenario :click the checkbox and check which is selected;
	 
	  WebElement box1 = driver.findElement(By.className("Automation"));
	  box1.click();
	  System.out.println("Automation is selected");
	  
	  WebElement box2 = driver.findElement(By.className("Performance"));
	  box2.click();
	  System.out.println("Performance is selected");
	  
	// for unselect the Checkboxes
		   box2.click();
		   
		   
		Thread.sleep(1000);
		   
	//Checking wheather its off
		    if(!box2.isSelected()) {
		    	System.out.println("Performance Testing is Unselected");
		    }
		
	 
	 driver.close();
	}
	}
