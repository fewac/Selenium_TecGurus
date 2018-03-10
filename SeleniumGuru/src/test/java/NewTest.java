import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void TestCaseONe() {
	  //System.setProperty("webdriver.chrome.driver", System.getenv("CHROMEDRIVER"));
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  driver.findElement(By.xpath("//div/input[@name='q']")).sendKeys("Selenium Test");
	  //driver.findElement(By.name="btnK").click();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @AfterClass
  public void afterClass() {
  }

}

/*
Boolean flag= false;
while ((!flag) && count < 10) {
	try
	{}
	catch
	{}
}
*/