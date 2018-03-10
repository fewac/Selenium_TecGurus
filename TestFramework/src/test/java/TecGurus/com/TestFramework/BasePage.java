package TecGurus.com.TestFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage extends BaseBrowser{
	protected WebDriver driver;
	protected BasePage(){
		InitBrowser();
		PageFactory.initElements(driver, this);
		
	}

	
	private void InitBrowser(){
		driver = setUpDriver();
	}
}
