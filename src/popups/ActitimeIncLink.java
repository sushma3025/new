package popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeIncLink {

	public static void main(String[] args)  
	{
		System.setProperty("webdriver.chrome.driver", "C:/DriverSoftware/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		Set<String> a = driver.getWindowHandles();
		System.out.println(a.size());
		ArrayList<String> al = new ArrayList<>(a);
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[.='Try Free']")).click();
		driver.findElement(By.id("first-name")).sendKeys("Sushma");
		driver.findElement(By.id("last-name")).sendKeys("Daroju");
		driver.close();
		driver.switchTo().window(al.get(0));
		System.out.println(driver.getTitle());
		driver.close();

		
		
				
		
		
	}

}
