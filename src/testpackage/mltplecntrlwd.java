package testpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mltplecntrlwd {
	static WebDriver d; 
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Downloads/chromedriver_win32/chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://www.unipune.ac.in/");
		d.findElement(By.xpath("(//span[@class='rainbow'])[1]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("(//span[@class='rainbow'])[2]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("(//span[@class='rainbow'])[3]")).click();
		Thread.sleep(2000);
		Set<String> wl=d.getWindowHandles();
		List<String> l=new ArrayList<String>(wl);
		swithToWindow("University Gold Medals,Awards,Prizes 2021-22 - All Documents",l);
	
		
	}
	public static void swithToWindow(String windowtitle, List<String> l) {
		for(String e:l)
		{
			String title=d.switchTo().window(e).getTitle();
			if(title.equals(windowtitle))
			{
				System.out.println("correct window");
				
			}
			
			
		}
		
		
	}

}
