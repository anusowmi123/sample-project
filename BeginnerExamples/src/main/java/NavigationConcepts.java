import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcepts {

	public static void main(String[] args) {
	
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
	
    //finding the Web ELement by locator 
    
    WebElement btn =  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]"));
    btn.click();
    
    driver.navigate().refresh();
    driver.navigate().back();
    driver.close();
		
	}

}
