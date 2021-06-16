package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:/DriverSoftware/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		driver.findElement(By.xpath("//input[@class ='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("sushma");
		//driver.findElement(By.xpath("//div[@class='commitButtonPlaceHolder']")).click();
		
	
		driver.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
		//driver.findElement(By.id("logoutLink")).click();
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		//alt.dismiss();
		

	
}
}