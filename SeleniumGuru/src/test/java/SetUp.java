import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SetUp {
	private WebDriver mydriver;
	private boolean Comparacion;
	
	public WebDriver setUpDriver(String url) {
		//System.setProperty("webdriver.chrome.driver", System.getenv("CHROMEDRIVER"));
		mydriver = new ChromeDriver();
		mydriver.manage().window().maximize();
		mydriver.get(url);
		
		return mydriver;
		
	}
	public void click (WebElement element)
	{
		element.click();
	}
	
	public void ExitApp() {
		
		mydriver.quit();
	}
	
	
	public void Comparar(WebElement elementoWeb, String texto) {
		
		Assert.assertEquals(elementoWeb.getText(), texto, "No se encontró el elemento.");
	}
	
	public void comparaTexto(String textoCompleto, String buscarCoincidencia){
		Boolean comparacion = textoCompleto.contains(buscarCoincidencia);
		if (comparacion) {
			System.out.println("El Código Postal '05348' SI se encuentra.");
		}else {
			System.out.println("El Código Postal '' NO se encuentra");
		}
	}
	
}
