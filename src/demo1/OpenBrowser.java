package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		
   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
   WebDriver driver= new ChromeDriver();
   //get()
   //driver.get("https://www.facebook.com");
  // driver.navigate().to("https://www.facebook.com");
  /* Scenario-1
  1.Open chrome browser
  2. enter the url(flipkart) 
  3. enter url (myntra)
  4. refresh the page (myntra)
  5.move back (flipkart)
  6. move forward (myntra)*/ 
   driver.navigate().to("https://www.flipkart.com");
   driver.navigate().to("https://www.myntra.com");
   Thread.sleep(3000);
   driver.navigate().refresh();
   Thread.sleep(3000);
   driver.navigate().back();
   Thread.sleep(3000);
   driver.navigate().forward();
	}

}
