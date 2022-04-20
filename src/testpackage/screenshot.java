package testpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	static WebDriver vb;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Downloads/chromedriver_win32/chromedriver.exe");
		vb=new ChromeDriver();
		vb.get("https://www.facebook.com/");
		
			screenshot.screenst("im");
			vb.close();
		
		
	}

	public static void screenst(String fname)throws IOException {
		File f=((TakesScreenshot)vb).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("C:\\Users\\Administrator\\eclipse-workspace\\test\\src\\pic\\"+fname+".jpg" ));
		
		
	}
}
