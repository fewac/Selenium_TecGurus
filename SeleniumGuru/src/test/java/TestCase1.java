import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;

//import java.awt.List;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import java.util.regex.*;

public class TestCase1 {
	
	WebDriver CurrentDriver;  //Creo mi variable de tipo WebDriver
	SetUp InitDriver = new SetUp(); //Creo mi objeto del tipo SetUp()
	
	
	
	@BeforeMethod
	  public void beforeMethod() {
		 
		  
	  }
	
  @BeforeTest
	public void beforeTest() {
	  CurrentDriver = InitDriver.setUpDriver("https://www.amazon.com.mx/");
	}
	
  @Test
  public void microsoft() {
	  //System.setProperty("webdriver.chrome.driver", System.getenv("CHROMEDRIVER"));
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  //driver.get("https://www.microsoft.com/es-mx/windows/view-all-devices");
	  driver.get("https://www.microsoft.com");
	  
	  driver.findElement(By.xpath("//ul/li/a[@id='shellmenu_1']")).click();
	  driver.findElement(By.xpath("//div/button[@id='shellmenu_34']")).click();
	  driver.findElement(By.xpath("//a[@id='shellmenu_35']")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'COMPARAR TODOS LOS DISPOSITIVOS')]")).click();
	  WebElement text = driver.findElement(By.xpath("//div/h1[contains(text(),'Las PCs nuevas hacen más cosas')]"));
	  String str = text.getText();
	  System.out.println(str);
	  //El text 'Error inesperado' se imprimiría sólo si ocurriera un error.
	  Assert.assertEquals("Las PCs nuevas hacen más cosas", str, "Error inesperado.");
	  
	 
	  
	  
	  /*
	  String[] elements = new String[6];
	  elements[0] = driver.findElement(By.linkText("Windows Hello")).getText();
	  elements[1] = driver.findElement(By.linkText("Cortana")).getText();
	  elements[2] = driver.findElement(By.linkText("Windows Ink")).getText();
	  elements[3] = driver.findElement(By.linkText("Pantalla táctil")).getText();
	  elements[4] = driver.findElement(By.linkText("Seguridad"))
	  System.out.println(elements[0]);
	  */
	  
	  
	  List<WebElement> miLista = driver.findElements(By.xpath("//ul[@id='icons']//child::a"));
	  
	  for (WebElement item: miLista) {
		  System.out.println(item.getText());
	  }
	  
	  //Cierra la sesión de chrome, es buena práctica para no alentar la computadora.
	  driver.quit();
	 
	  
	  

  }
  
    @Test
	public void face_book(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://es-es.facebook.com/");
		WebElement crear_btn = null; //botón para crear la cuenta
		WebElement nombre = null; //input para introducir el nombre del usuario
		WebElement apellido = null;
		WebElement correo = null;
		WebElement pass = null;
		Select dropDay = null;
		Select dropMonth = null;
		Select dropYear = null;
		WebElement male = null;
		int piv = 1;
		
		
		crear_btn = driver.findElement(By.xpath("//div/button[contains(text(),\"Terminado\")]"));
		nombre = driver.findElement(By.xpath("//div/input[@aria-label=\"Nombre\"]"));
		apellido = driver.findElement(By.xpath("//div/input[@aria-label=\"Apellidos\"]"));
		correo = driver.findElement(By.xpath("//div/input[@aria-label=\"Número de móvil o correo electrónico\"]"));
		pass = driver.findElement(By.xpath("//div/input[@aria-label=\"Contraseña nueva\"]"));
		dropDay = new Select(driver.findElement(By.xpath("//span/select[@aria-label=\"Día\"]")));
		dropMonth = new Select(driver.findElement(By.xpath("//select[@name=\"birthday_month\"]")));
		dropYear = new Select(driver.findElement(By.xpath("//select[@name=\"birthday_year\"]")));
		dropDay.selectByValue("30");
		dropMonth.selectByValue("12");
		dropYear.selectByValue("1970");
		
		
	}
  
  
    @Test
    public void amazonAssert() {
    	CurrentDriver.findElement(By.xpath("//div/a[contains(text(),'Promociones')]")).click();
    	String Outlet = "Outlet";
    	String LosMas = "Los más vendidos";
    	String Meses = "Meses sin intereses";
    	String Envio = "Envío gratis";
    	String Ofertas = "Ofertas Kindle";
    	String Kindle = "Kindle Unlimited";
    	
    	WebElement OutletWeb = CurrentDriver.findElement(By.xpath("//a/span[contains(text(),'Outlet')]"));
    	WebElement LosMasWeb = CurrentDriver.findElement(By.xpath("//a/span[contains(text(),'Los más vendidos')]"));
    	WebElement MesesWeb = CurrentDriver.findElement(By.xpath("//a/span[contains(text(),'Meses sin intereses')]"));
    	WebElement EnvioWeb = CurrentDriver.findElement(By.xpath("//a/span[contains(text(),'Envío gratis')]"));
    	WebElement OfertasWeb = CurrentDriver.findElement(By.xpath("//a/span[contains(text(),'Ofertas Kindle')]"));
    	WebElement KindleWeb = CurrentDriver.findElement(By.xpath("//a[@href=\"/gp/kindle/ku/sign-up/ref=sv_gb_5\"]//child::span"));
    	   	
    	
    	//Assert.assertEquals(OutletWeb.getText(), Outlet, "No se encontró el elemento.");
    	InitDriver.Comparar(OutletWeb, Outlet);
    	Assert.assertEquals(LosMasWeb.getText(), LosMas, "No se encontró el elemento.");
    	Assert.assertEquals(MesesWeb.getText(), Meses, "No se encontró el elemento.");
    	Assert.assertEquals(EnvioWeb.getText(), Envio, "No se encontró el elemento.");
    	Assert.assertEquals(OfertasWeb.getText(), Ofertas, "No se encontró el elemento.");
    	Assert.assertEquals(KindleWeb.getText(), Kindle, "No se encontró el elemento.");
    	
    }
    
  
    @Test
    public void amazonAccount() {
    	WebElement Identificate;
    	Identificate = CurrentDriver.findElement(By.xpath("//div/a[@id='nav-link-yourAccount']"));
    	
    	Actions action = new Actions(CurrentDriver);
    	
    	action.moveToElement(Identificate).perform();
    	WebElement subElement = CurrentDriver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']/a"));
    	action.moveToElement(subElement);
    	action.click();
    	action.perform();
    	
    	WebElement nombre;
    	WebElement correo;
    	WebElement password;
    	nombre = CurrentDriver.findElement(By.xpath("//div/input[@id='ap_customer_name']"));
    	correo = CurrentDriver.findElement(By.xpath("//div/input[@id='ap_email']"));
    	password = CurrentDriver.findElement(By.xpath("//div/input[@id='ap_password']"));
    	nombre.sendKeys("Playing");
    	correo.sendKeys("test@with.com");
    	password.sendKeys("something");
    	CurrentDriver.findElement(By.xpath("//span/input[@id='continue']")).click();
    	WebElement error;
    	error = CurrentDriver.findElement(By.xpath("//div[@class='a-alert-content']/ancestor::div[@id='auth-passwordCheck-missing-alert']"));
    	String text = error.getText();
    	System.out.println(text);
    	InitDriver.Comparar(error, "Vuelva a escribir su contraseña");
    	CurrentDriver.findElement(By.linkText("Aviso de Privacidad")).click();
    	
    	// Validate Zipcode
    	
    	String ComparaZipcode = "05348";
    	String texto = CurrentDriver.findElement(By.xpath("//div/pre")).getText();
    	// A continuación se compara si existe el Código Postal en la cadena de caracteres:
    	
    	InitDriver.comparaTexto(texto, ComparaZipcode);
    	
    	// Eliminar espacios, tabuladores y retornos de carro en un String:
    	
//    	System.out.println(text.replaceAll("^\\s*",""));
    	
    	String EspaciosEliminados = "";
    	EspaciosEliminados = texto.replaceAll("\\s", "");
    	System.out.println(EspaciosEliminados);
    	String NumerosEliminados = "";
    	NumerosEliminados = EspaciosEliminados.replaceAll("[0-9]", "");
    	System.out.println(NumerosEliminados);
    	String CaracEspEliminados = "";
    	CaracEspEliminados = NumerosEliminados.replaceAll("\\p{Punct}", "");
    	System.out.println(CaracEspEliminados);
    	System.out.println(CaracEspEliminados.length());
//    	String a = "Usuario0072";
//    	a.replaceAll("[0-9]", "");
    	
    	
    }
    
    /*
    action.moveToElement(element).perform();
    WebElement subElement = driver.findElement(By.linkText("iPads"));
    action.moveToElement(subElement);
    action.click();
    action.perform();
  */

  @AfterMethod
  public void afterMethod() 
  {
	  InitDriver.ExitApp();
	  
  }


  @AfterClass
  public void afterClass() {
  }

}
