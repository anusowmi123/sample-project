import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleclickSAlertBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	      WebDriver driver=new	ChromeDriver();
	      driver.manage().window().maximize();
	      
	      driver.get("https://artoftesting.com/samplesiteforselenium#google_vignette");
	      
	 //double click the button for alert box, Accept and dismiss method is not avilable for action so used alert method.
	        
	   //  
	   //   action.doubleClick(driver.findElement(By.xpath("//*[@id=\"ConfirmBox\"]/button"))).click().build().perform(); 
	       
	
     WebElement button= driver.findElement(By.xpath("//*[@id=\"dblClkBtn\"]"));
     
     Actions action = new Actions(driver);
     action.doubleClick(button).build().perform();
     try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	    Alert alert=driver.switchTo().alert();  
	    alert.accept();
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
         driver.close();
}

}
