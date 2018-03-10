package TecGurus.com.TestFramework;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

// Esta clase contiene todos los métodos que vamos a usar a lo largo de nuestro proyecto
// Todos los métodos que vamos a usar, van a estar aqui
// Todo esto es para interactuar con el browser

public class BaseBrowser {
	private WebDriver myDriver;

	// Crear DriverSetup
	// *********************************   CREAR DRIVER SETUP    ************************************
	public WebDriver setUpDriver() {
		myDriver = new ChromeDriver();
		myDriver.manage().window().maximize();
		return myDriver;
	}
	
	// *******************************   CREAR GO TO WEB PAGE   **************************************
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
	
	// *****************************   CREAR ASSERT  ELEMENT    ************************************
	
	public void WaitForElement(WebElement element)
	{
		boolean isDisplayed = false;
		
		while(!isDisplayed)
		{
			try
			{
				isDisplayed = element.isDisplayed();
			}
			catch(NoSuchElementException e)
			{
				System.out.println("Element not found... searching...");
			}
		}
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
