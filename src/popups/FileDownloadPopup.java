package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadPopup {

	public static void main(String[] args) throws AWTException, InterruptedException 
	
	{
		System.setProperty("webdriver.gecko.driver", "C:/DriverSoftware/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://filehippo.com/");
		driver.findElement(By.xpath("//a[.='Popular software']")).click();
		driver.findElement(By.xpath("//span[@title='uTorrent']")).click();
		driver.findElement(By.xpath("(//a[@title='Download Latest Version'])[1]")).click();
		driver.findElement(By.xpath("//a[@title='Close']")).click();
		Robot r = new Robot();
		for(int i=0;i<2;i++)
		{
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_TAB);

		}
		r.keyPress(KeyEvent.VK_ENTER);		
		
		

	}

}
