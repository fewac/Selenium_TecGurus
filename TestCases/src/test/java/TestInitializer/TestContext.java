package TestInitializer;
import MainContext.FrameworkContext;


public class TestContext{
	public static String GetUrl() {
	return FrameworkContext.GetJsonString("WebUrl");
	}
}