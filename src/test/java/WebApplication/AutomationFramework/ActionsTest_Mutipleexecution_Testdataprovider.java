package WebApplication.AutomationFramework;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActionsTest_Mutipleexecution_Testdataprovider extends BaseTest {

    @Test(dataProvider = "getTestData")
    public void actionsConceptTest(String searchText) {
        try {
            driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

            ActionsPageObjectModelPage FlightSearchPage = new ActionsPageObjectModelPage(driver);
            FlightSearchPage.rightClickFindFlights();
            FlightSearchPage.enterTextInAutoSuggest(searchText);

            Thread.sleep(3000); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @DataProvider
    public Object[][] getTestData() {
        return new Object[][]{
            {"india"},
            {"usa"},
            {"canada"}
        };
    }
}
