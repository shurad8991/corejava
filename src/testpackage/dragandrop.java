package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandrop {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver wb=new ChromeDriver();
	     wb.get("https://material.angular.io/cdk/drag-drop/overview");
	     WebElement from=wb.findElement(By.xpath("//div[text()='Iron age']"));
	     WebElement to=wb.findElement(By.xpath("//div[text()='Bronze age']"));
	     Actions a=new Actions(wb);
	     a.clickAndHold(from).moveToElement(to).release(to).build().perform();
	     System.out.println("complete");	
	     
	}

}
