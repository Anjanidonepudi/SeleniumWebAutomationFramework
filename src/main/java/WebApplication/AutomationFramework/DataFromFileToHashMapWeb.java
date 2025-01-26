package WebApplication.AutomationFramework;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.HashMap;

import java.io.File;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;



public class DataFromFileToHashMapWeb {

	
	private WebDriver driver;

	public DataFromFileToHashMapWeb(WebDriver driver) {
		this.driver = driver;

	}
	
	public List<HashMap<String, String>> getJsonData(String jsonFilePath) throws IOException {
		//System.getProperty("user.dir") + "src\test\java\WebApplication\AutomationFramework\jsondata\data.json"
	
	    // convert json file content to json string
	    String jsonContent = FileUtils.readFileToString(new File (jsonFilePath),StandardCharsets.UTF_8);

	    ObjectMapper mapper = new ObjectMapper();
	    List<HashMap<String, String>> data = mapper.readValue(jsonContent,
	        new TypeReference<List<HashMap<String, String>>>() {
	        });

	    return data;
	}
}
