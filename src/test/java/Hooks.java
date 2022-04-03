import Utility.CommenLibrary;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommenLibrary {
    @Before
    public void beforeMethod() {
        openBrowser();
    }

    @After
    public void afterMethod() {
        closeBrowser();

    }

}
