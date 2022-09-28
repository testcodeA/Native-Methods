package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleOfWebPage {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://www.gsmarena.com");
		  /* String title=driver.getTitle();
		   System.out.println(title);*/
		   System.out.println(driver.getTitle());

	}

}
