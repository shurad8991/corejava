package testpackage;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadimage {
		static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		
		
			 System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Downloads/chromedriver_win32/chromedriver.exe");
		 d=new ChromeDriver();
		 d.get("https://demoqa.com/alerts");
			 okclick();
			 Thread.sleep(2000);
	    	 dismiss();
			 Thread.sleep(2000);
			 ok_cancel();
			 
	    
		 
		
		
	}
	public static void okclick() throws InterruptedException 
	{ 
		
		d.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);
		Alert a=d.switchTo().alert();
		a.accept();
		
	}
	public static void ok_cancel() throws InterruptedException 
	{
		
		d.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(2000);
		Alert a=d.switchTo().alert();
		Thread.sleep(2000);
		a.sendKeys("shubhangi");
		
		a.accept();
		
		
	}
	public static void dismiss() throws InterruptedException 
	{
		
		d.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(2000);
		Alert a=d.switchTo().alert();
		Thread.sleep(2000);
		
		a.dismiss();
		
	}
	

}
