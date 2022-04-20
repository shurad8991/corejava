package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchframe {

	static WebDriver d;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Downloads/chromedriver_win32/chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/frames");
		d.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		Thread.sleep(2000);

		 d.switchTo().frame("frame-bottom");
		
		 d.quit();

		
	}
}
