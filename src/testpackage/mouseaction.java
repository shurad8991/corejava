package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Downloads/chromedriver_win32/chromedriver.exe");
     WebDriver wb=new ChromeDriver();
     wb.get("https://www.google.com/");
     WebElement rclick=wb.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
     Actions a=new Actions(wb);
    // a.contextClick(rclick).build().perform();     //right click
   //  a.doubleClick(rclick).build().perform();
     a.click(rclick).build().perform();
	}

}
