package MainContext;
import java.io.FileReader;
import org.json.simple.JSONObject;
import com.google.gson.JsonParser;



public class FrameworkContext {
	public static String GetJsonString(String Parameter){
		String Value = "";
		JsonParser parser = new JsonParser();
		try {
			Object obj = parser.parse(new FileReader("C:\\Users\\fewac\\eclipse-workspace\\TestCases\\src\\test\\java\\Config.json"));
			JSONObject jsonObject = (JSONObject) obj;
			Value = (String) jsonObject.get(Parameter);
		}
		catch(Exception e){
			System.out.println("No se pudo localizar el parametro que necesitas");
			System.out.println(e.getMessage());
		}
		return Value;
	}
}
