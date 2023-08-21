package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class Hooks {
    /*
    Hooks is used to run before or after each scenario
    this class should only have @Before or @After annotations
    by default these methods runs for all scenarios automatically
    but conditional hooks can be used for running specific tags @Before("@smoke")
    Note :
     */
    @Before
    public void setUpScenarios(){
        System.out.println("Before Hooks>>>>>>>>>");
    }
    @After
    public void tearDown(){
        System.out.println("After Hooks>>>>>>>>>>");
    }
}