package popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriPopup {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:/DriverSoftware/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		Set<String> a = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<>(a);
		System.out.println(al.size());
		driver.switchTo().window(al.get(1));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a")).click();
		
   		
		Set<String> a2 = driver.getWindowHandles();
		System.out.println(a2.size());
		ArrayList<String> a2l = new ArrayList<>(a2);
		
		driver.switchTo().window(a2l.get(4));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		


		



		
		

		

		

		
		
		
		
		
		
		

		


		
		
		
	}

}
