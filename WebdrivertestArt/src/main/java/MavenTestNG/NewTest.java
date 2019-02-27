package MavenTestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver=null;
  @Test
  public void f() {
	  
	  driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		AssertJUnit.assertTrue(title.contains("Demo Guru99 Page"));
  }
  @BeforeTest
  public void beforeTest() {
	  System. setProperty("webdriver.chrome.driver", "C:\\Users\\UC233822\\Downloads\\Katalon_Studio_Windows_64-5.5\\Katalon_Studio_Windows_64-5.5\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");
  	driver= new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
