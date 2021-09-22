package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		//to go back
		driver.navigate().back();
		
		//to go forword
		driver.navigate().forward();
		
		//refresh
		driver.navigate().refresh();


		
		driver.close();
		
		
		

	}

}
