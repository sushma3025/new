package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/DriverSoftware/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.aa.com/");
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		driver.findElement(By.xpath("(//a[.='23'])[1]")).click();
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
		driver.findElement(By.xpath("(//a[.='20'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='icon icon-search'])[1]")).click();
		WebElement ListBox = driver.findElement(By.xpath("//select[@id='countryCode']"));
		ListBox.click();
		Select sel = new Select(ListBox);
		sel.selectByValue("IN");
		driver.findElement(By.xpath("//span[.='HYD']")).click();
		driver.findElement(By.xpath("(//span[@class='icon icon-search'])[2]")).click();
		WebElement ListBox2 = driver.findElement(By.xpath("//select[@id='countryCode']"));
		ListBox2.click();
		Select sel2 = new Select(ListBox2);
		sel2.selectByValue("US");
		
		WebElement ListBox3 = driver.findElement(By.xpath("//select[@id='stateCode']"));
		ListBox3.click();
		Select sel3 = new Select(ListBox3);
		sel3.selectByValue("OH");
		driver.findElement(By.xpath("//span[.='CMH']")).click();
		Thread.sleep(6000);
		WebElement ListBox4 = driver.findElement(By.xpath("//select[@id='flightSearchForm.adultOrSeniorPassengerCount']"));
		ListBox4.click();
		Select sel4 = new Select(ListBox4);
		sel4.selectByIndex(3);
		driver.findElement(By.id("flightSearchForm.button.reSubmit")).click();

		
		

		

		
		
		
		


		
		
	}

}
