package TecGurus.com.TestFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

// La única funcion del BasePage es inicializar el browser
// 

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
