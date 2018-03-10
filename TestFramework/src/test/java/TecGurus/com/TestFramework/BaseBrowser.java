package TecGurus.com.TestFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class BaseBrowser {
	private WebDriver myDriver;

	// Crear DriverSetup
	// *********************************   CREAR DRIVER SETUP    ************************************
	public WebDriver setUpDriver() {
		myDriver = new ChromeDriver();
		myDriver.manage().window().maximize();
		return myDriver;
	}
	
	// ***********************************   CREAR GO TO    **************************************
	public WebDriver GoTo(String page){
		myDriver.get(page);
		return myDriver;
		
	}
	
	// ***********************************   CREAR CLICK    **************************************
	public void DoClick(WebElement element) {
		element.click();
	}
	

	// *****************************   CREAR ENTER TEXT - SEND KEYS    ************************************
	public void EnterText(WebElement element, String text){
		element.sendKeys(text);
	}
	
	
	// *****************************   CREAR ASSERT  ELEMENT    ************************************	
	public void ComparaTextCompleto(WebElement element, String texto){
		Assert.assertEquals(element.getText(), texto, "No se encontró el elemento.");
	}
	
//	public void WaitForeElement(WebElement element) {
//		boolean isDisplayed = false;
//		while (!isDisplayed) {
//			try
//			{
//				isDisplayed = element.isDisplayed();
//			}
//			catch ()
//			{
//				System.out.println
//			}
//		}
//	}
	
}
