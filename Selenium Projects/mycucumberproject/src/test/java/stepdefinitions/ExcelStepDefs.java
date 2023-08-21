package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.DataTablesPage;
import utilities.Driver;
import utilities.ExcelUtils;
import java.util.List;
import java.util.Map;
import static utilities.WaitUtils.waitFor;
public class ExcelStepDefs {
    DataTablesPage dataTablesPage;
    ExcelUtils excelUtils;
    List<Map<String,String>> dataList;
    @Given("user navigates to {string} and enters data from {string} from {string} excel")
    public void user_navigates_to_and_enters_data_from_from_excel(String url, String sheet, String excel) {
//      String excelPath="./src/test/resources/test_data/data_sheet.xlsx";
        String excelPath="./test_data/data_sheet.xlsx"+excel+"";
        excelUtils = new ExcelUtils(excelPath, sheet);
        dataList = excelUtils.getDataList();
        System.out.println(dataList);
//        dataList java object has the excel data
        dataTablesPage = new DataTablesPage();
//        We are testing with multiple data so use a loop
        for (Map<String, String> data : dataList){
            waitFor(2);
            Driver.getDriver().get(url);
            waitFor(2);
            dataTablesPage.newButton.click();
            waitFor(2);
            dataTablesPage.firstname.sendKeys(data.get("first_name"));
            waitFor(2);
            dataTablesPage.lastname.sendKeys(data.get("last_name"));
            waitFor(2);
            dataTablesPage.position.sendKeys(data.get("position"));
            waitFor(2);
            dataTablesPage.office.sendKeys(data.get("office"));
            waitFor(2);
            dataTablesPage.extension.sendKeys(data.get("extension"));
            waitFor(2);
            dataTablesPage.startDate.sendKeys(data.get("start_date"));
            waitFor(2);
            dataTablesPage.salary.sendKeys(data.get("salary"));
            waitFor(2);
            dataTablesPage.createButton.click();
            waitFor(2);
            dataTablesPage.searchBox.sendKeys(data.get("first_name"));
            waitFor(2);
            Assert.assertTrue(dataTablesPage.nameField.getText().contains(data.get("first_name")));
            waitFor(2);
        }
    }
}



