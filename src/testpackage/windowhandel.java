package testpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandel 
{
	static WebDriver d;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Downloads/chromedriver_win32/chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		
		String m = d.getWindowHandle();
		System.out.println(m);
		 d.switchTo().window(m);
		 d.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Shubhangi");
		 d.findElement(By.xpath("//button[@name='websubmit']")).click();
		 d.quit();

		
		
	}

}
