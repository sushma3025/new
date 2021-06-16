package popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriChildBrowser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:/DriverSoftware/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> a = driver.getWindowHandles();
		System.out.println(a.size());
		
		ArrayList<String> al = new ArrayList<>(a);
		System.out.println(al.size());
		
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(al.get(2));
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(al.get(3));
		driver.quit();
		System.out.println(driver.getTitle());

		
		
	}

}
