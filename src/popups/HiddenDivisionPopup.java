package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HiddenDivisionPopup {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https:/www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement link = driver.findElement(By.xpath("//span[.='Electronics']"));
		Actions act = new Actions(driver);
		act.moveToElement(link).perform();
		
	}

}
