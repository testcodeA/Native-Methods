package demo1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndSetPositionBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		   WebDriver driver= new ChromeDriver();
		   System.out.println(driver.manage().window().getPosition());
		   Point p= new Point(50,70);
		   Thread.sleep(3000);
		   driver.manage().window().setPosition(p);
		   System.out.println(driver.manage().window().getPosition());

	}

}
