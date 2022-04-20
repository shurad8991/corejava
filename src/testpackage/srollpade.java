package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

public class srollpade {
	static WebDriver d;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Downloads/chromedriver_win32/chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://www.facebook.com/");
		WebElement w=d.findElement(By.xpath("//a[text()='About']"));
		JavascriptExecutor jr=((JavascriptExecutor) d);
		jr.executeScript("arguments[0].scrollIntoView();",w);
		
		
		jr.executeScript("window.scrollBy(0,800)");
		
		jr.executeScript("window.scrollBy(0,-800)");
		Thread.sleep(4000);
		org.openqa.selenium.Point p=new org.openqa.selenium.Point(100, 500);
		d.manage().window().setPosition(p);
		
		System.out.println("complete");
		Thread.sleep(2000);
		Dimension d1=new Dimension(100,100);
		d.manage().window().setSize(d1);
		Thread.sleep(2000);
		d.close();
	}

}
