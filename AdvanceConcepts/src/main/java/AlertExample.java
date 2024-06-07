import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExample {

	private static By driver;


	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
      WebDriver driver=new	ChromeDriver();
      driver.manage().window().maximize();
      
      driver.get("https://artoftesting.com/samplesiteforselenium#google_vignette");
 //alert box     
      driver.findElement(By.xpath("//*[@id=\"AlertBox\"]/button")).click();
      Alert alert=driver.switchTo().alert();
      alert.accept();
      Thread.sleep(1000);
  //promt box    
      driver.findElement(By.xpath("//*[@id=\"ConfirmBox\"]/button")).click();
      driver.switchTo().alert();
      alert.dismiss();
      
      Thread.sleep(1000);
      
     driver.close();
      
	}
	
}
