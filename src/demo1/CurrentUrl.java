package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://www.facebook.com");
		 /*  String currentUrl= driver.getCurrentUrl();
		   System.out.println(currentUrl);*/
		   System.out.println(driver.getCurrentUrl());
		   

	}

}
