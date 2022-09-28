package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteAllCookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://youtube.com");
		   driver.manage().deleteAllCookies();
		   System.out.println("Deleted all cookies successfully");

	}

}
