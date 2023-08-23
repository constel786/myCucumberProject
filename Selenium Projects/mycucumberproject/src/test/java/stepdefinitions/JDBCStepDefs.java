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
        String query = "select "+column+" from "+table+""; //This is dynamic. Hardcode SQL is: select * from jhi_user
        DBUtils.executeQuery(query); //Going to the table
    }
    @And("user reads all the column {string} data")
    public void userReadsAllTheColumnData(String column) throws Exception {
//        going to the new row
        DBUtils.getResultset().next(); //1st row
        Object object1 = DBUtils.getResultset().getObject(column); //returns the data on that 1st row
        System.out.println(object1.toString()); //printing that data
        DBUtils.getResultset().next();//2nd row
        Object object2=DBUtils.getResultset().getObject(column);
        System.out.println(object2.toString());
        int rowCount = 2;
        while (DBUtils.getResultset().next()){
            rowCount++;
            Object currentData = DBUtils.getResultset().getObject(column);
            System.out.println( rowCount + " : " + currentData.toString());
        }

        System.out.println("Row Count: " + DBUtils.getRowCount()); //To get the number of rows printed
    }
}
