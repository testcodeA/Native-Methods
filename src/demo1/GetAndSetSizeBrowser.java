package demo1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndSetSizeBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		   WebDriver driver= new ChromeDriver();
		   System.out.println(driver.manage().window().getSize());
		   Dimension d= new Dimension(520,520);
		   Thread.sleep(3000);
		   driver.manage().window().setSize(d);
		   System.out.println(driver.manage().window().getSize());
		   
		   

	}

}
