package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {
	
	void add()
	{
		 WebDriver driver = new ChromeDriver();
	      // browser type and chromedrover.exe path as parameters
	      System.setProperty("webdriver.chrome.driver",
	      "C:\\Users\\mlaha\\Downloads\\chromedriver_win32.exe");
	      String url = " https://www.google.com/";
	      driver.get(url);
	}

}
