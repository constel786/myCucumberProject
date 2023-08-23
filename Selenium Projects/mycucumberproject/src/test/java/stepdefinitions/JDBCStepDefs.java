package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.DBUtils;

import java.sql.SQLException;

public class JDBCStepDefs {
    @Given("user connects to the application database")
    public void user_connects_to_the_application_database() {
        DBUtils.createConnection();
    }
    @And("user gets the column {string} from the table {string}")
    public void userGetsTheColumnFromTheTable(String column, String table) {
        String query = "select "+column+" from "+table+"";
        DBUtils.executeQuery(query);
    }
    @And("user reads all the column {string} data")
    public void userReadsAllTheColumnData(String column) throws SQLException {
//        going to the new row
        DBUtils.getResultset().next(); //1st row
        Object object1 = DBUtils.getResultset().getObject(column);//returns the data on that 1st row
        System.out.println(object1.toString());//printing that data
    }
}
