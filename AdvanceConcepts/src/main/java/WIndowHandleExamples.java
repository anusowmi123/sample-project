import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WIndowHandleExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("https://www.amazon.in/");
		
	//same like windowhandles output .	
//	WebElement cards=	driver.findElement(By.linkText("Refrigerators"));
//	cards.click();
//	
//	WebElement newwindow =	driver.findElement(By.linkText("Samsung 183 L, 4 Star, Digital Inverter, Direct-Cool Single Door Refrigerator (RR20C1824CR/HL,"
//				+ " Red, Camellia Purple, Base Stand Drawer, 2024 Model)"));
//	newwindow.click();
//	
		
		
		
	// getwindowhandle is for save old window;	
		
	 String oldwindow = driver.getWindowHandle();
	 WebElement cards=	driver.findElement(By.linkText("Refrigerators"));
	 cards.click();
	 
	//saving old and new windows	 
	 Set <String> handles =	driver.getWindowHandles();
	
  //for each loop		
   for (String Newwindow : handles) {
	driver.switchTo().window( Newwindow);
}

WebElement newwindow =	driver.findElement(By.linkText("Samsung 183 L, 4 Star, Digital Inverter, Direct-Cool Single Door Refrigerator (RR20C1824CR/HL,"
		+ " Red, Camellia Purple, Base Stand Drawer, 2024 Model)"));
newwindow.click();


//driver.close();

 driver.switchTo().defaultContent();



	}
	}


