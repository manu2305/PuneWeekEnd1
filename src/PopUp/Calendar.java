package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calendar {
	public static void main(String[] args) throws InterruptedException {
	ChromeOptions c_options = new ChromeOptions();
	c_options.addArguments("--disable-notifications");
	//open the the browser
		WebDriver driver=new ChromeDriver(c_options);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		driver.findElement(By.id("ddate")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='01/12/2024']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='divRtnCal']")).click();
		Thread.sleep(3000);
		for (;;) {
			try {
		    	driver.findElement(By.xpath("//li[@id='fst_6_01/03/2025']")).click();
		    	break;
			} catch (Exception e) {
				driver.findElement(By.cssSelector("#img2Nex")).click();
			}
			Thread.sleep(1000);
		}
	    
		
}
}
