package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import TecGurus.com.TestFramework.BasePage;
import TestInitializer.TestContext;

public class WinHomePage extends BasePage{
  public WinHomePage(){
	  super();  //sintaxis para llamar al constructor de la clase padre
  }
  
  //Esta es una notación del Page Factory, sirve para encontrar un elemento por medio
  //de un ID, name, xpath, etc. Y a este elemento le ponemos un nombre, en este caso
  // "WindowsMenu"
  @FindBy(id="shellmenu_1")
  public WebElement WindowsMenu;
  
  @FindBy(id="JuegosMenu_67")
  public WebElement JuegosMenu;
  
  @FindBy(id="search")
  public WebElement Search;
  
  //click llamando a browser
  public WinHomePage ClickOn(WebElement element){
	  DoClick(element);
	  return this;
  }
  
  //enter text llamando a baseBrowser
  public WinHomePage sendText(WebElement element, String text) {
	  EnterText(element, text);
	  return this;
  }
  
  //GoTo - llamando a baseBrowser - llamando a la propiedad de geturl
  public WinHomePage OpenWebPage(){
	  GoTo(TestContext.GetUrl());
	  return this;
  }
  
  // validatitulo - lo que trae browser vs lo esperado
  public WinHomePage ValidateTitle(WebElement element, String text) {
	  ComparaTextCompleto(element, text);
	  return this;
  }
  
  // waitForElemento llamando al baseBrowser
  public WinHomePage WaitFor() {
	  
  }
  
  // Utilizando return this en todos los métodos
  
  public WinHomePage ValidaTitulo(String ExpectedTitle) {
	  String DriverTitle = driver.getTitle();
	  Assert.assertTrue(DriverTitle.contains(ExpectedTitle));
	  System.out.println("El título es correcto: " + DriverTitle);
	  return this;
  }
  
 
  
  
  
}
