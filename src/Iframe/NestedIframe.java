package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demo.automationtesting.in/Frames.html");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	WebElement embedded = driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
	driver.switchTo().frame(embedded);
	Thread.sleep(2000);
	WebElement nested = driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
	driver.switchTo().frame(nested);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("avadhut");
}
}
