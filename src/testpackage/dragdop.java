package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver wb=new ChromeDriver();
	     wb.get("https://jqueryui.com/droppable/");
	     wb.switchTo().frame(0);
	     Thread.sleep(4000);
	     WebElement from=wb.findElement(By.xpath("//div[@id='draggable']"));
	     WebElement to=wb.findElement(By.xpath("//div[@id='droppable']"));
	     Actions a=new Actions(wb);
	     a.dragAndDrop(from, to).perform();
	     System.out.println("complete");	

	}

}
