package testpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cromedriver  
{

	public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver d=new ChromeDriver();
	//	d.get("https://www.facebook.com/");
//		WebElement login=d.findElement(By.name("login"));
//		login.click();
//		d.navigate().to("https://www.google.com/");
//		Thread.sleep(3000);
//      d.close();
		
		
//		d.get("https://www.amazon.in/");
//		WebElement op= d.findElement(By.xpath("//select[@name='url']"));
//		Select s=new Select(op);
//		s.selectByIndex(1);
//		//s.selectByValue("saab");
////		Thread.sleep(4000);
//		//s.selectByVisibleText("Saab");
//		Thread.sleep(4000);
//		d.close();

		
		
		d.get("https://www.shopforschool.in/Products/Products?sch_id=25");
		WebElement e=d.findElement(By.xpath("//input[@id='chk_male']"));
		boolean display=e.isDisplayed();
		if(display==true)
		{
			System.out.println("diplay");
		}
		else
		{
			System.out.println("Not display");
		}
		boolean selected=e.isSelected();
		if(selected==true)
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Not selected");
		}
		
		
		
		}
		
		
	}


