package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkclick {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver wb=new ChromeDriver();
	wb.get("https://www.nobroker.in/");
	WebElement e=wb.findElement(By.xpath("//a[@class='nb__3ctBx']"));
	e.click();
	System.out.println("completed");
	wb.close();
	
	}

}
