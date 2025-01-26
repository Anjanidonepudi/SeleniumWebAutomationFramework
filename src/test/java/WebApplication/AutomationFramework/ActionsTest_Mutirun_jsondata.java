package WebApplication.AutomationFramework;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class ActionsTest_Mutirun_jsondata extends BaseTest {

    @Test(dataProvider = "getTestData")
    public void actionsConceptTest(HashMap<String,String> input) {
        try {
            driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

            ActionsPageObjectModelPage FlightSearchPage = new ActionsPageObjectModelPage(driver);
            FlightSearchPage.rightClickFindFlights();
            FlightSearchPage.enterTextInAutoSuggest(input.get("autoSuggestText"));

            Thread.sleep(3000); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @DataProvider
    public Object[][] getTestData() throws IOException {
    	 DataFromFileToHashMapWeb DataFromFileToHashMapWeb = new DataFromFileToHashMapWeb(driver);
    	 List<HashMap<String,String>> data = DataFromFileToHashMapWeb.getJsonData(System.getProperty("user.dir") + "\\src\\test\\java\\WebApplication\\AutomationFramework\\jsondata\\data.json");
        return new Object[][]{
            {data.get(0)},
            {data.get(1)},
            {data.get(2)}
        };
    }
}
