import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/samplesiteforselenium");

 // Scenario : click any one in option,check which option is selected in console;	
		
 //For clicking option one 
		
//	 WebElement option1=driver.findElement(By.xpath("//*[@id=\"male\"]"));
//	 option1.click();
//	 option1.isSelected();
	
// For clicking the second option	
	 
	 WebElement option2=driver.findElement(By.xpath("//*[@id=\"female\"]"));
	 option2.click();
	 option2.isSelected();	
	 
	 if(option2.isSelected()) {
		 System.out.println("Option 2 is Selected:");			 
		 }
	 else {
		 System.out.println("Option 1 is Selected:");			 
		 }

	 try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 driver.close();
	 
	 }
		
	

	}


