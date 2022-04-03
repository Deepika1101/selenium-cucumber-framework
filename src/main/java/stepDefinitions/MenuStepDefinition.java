package stepDefinitions;

import Utility.CommenLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class MenuStepDefinition extends CommenLibrary {

    @Given("Iam on the home page {string}")
    public void iam_on_the_home_page(String url) {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String expectedUrl = url;
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        WebElement cookieButton =driver.findElement(By.id(""));
        cookieButton.click();
    }
    @When("I hoover over the menu option {string}")
    public void i_hoover_over_the_menu_option(String string) {

    }
    @When("I clicked the link")
    public void i_clicked_the_link() {


    }
    @Then("I should navigate to the women screen")
    public void i_should_navigate_to_the_women_screen() {

    }

}
