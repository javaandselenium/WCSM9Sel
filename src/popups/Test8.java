package popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) throws IOException  {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("wdgt-file-upload")).click();
		Runtime.getRuntime().exec("‪‪C://Users//QSP//Desktop//Autoit//fileuploadpopup8.exe");

	}

}
