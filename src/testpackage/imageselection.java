package testpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class imageselection {

	public static void main(String[] args) throws AWTException {
		 System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Downloads/chromedriver_win32/chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		 d.get("https://pqina.nl/filepond/");
		
		 d.findElement(By.xpath("(//span[@tabindex='0'])[1]")).click();
		 StringSelection p=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(p,null);
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_V);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 System.out.println("complete");
		 
		 

	}

}
