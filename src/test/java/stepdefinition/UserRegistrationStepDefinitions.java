package stepdefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class UserRegistrationStepDefinitions {

    private WebDriver driver;

    @Given("user is on the user registration page")
    public void userIsOnUserRegistrationPage() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();

        // Replace the URL with the actual registration page URL
        driver.get("https://example.com/registration");
    }

    @When("user enters a valid user name")
    public void userEntersValidUserName() {
        WebElement userNameInput = driver.findElement(By.id("username"));
        userNameInput.sendKeys("valid_username");
    }

    @When("valid e-mail address")
    public void userEntersValidEmailAddress() {
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("valid_email@example.com");
    }

    @When("valid password")
    public void userEntersValidPassword() {
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("valid_password");
    }

    @When("valid confirmation password")
    public void userEntersValidConfirmationPassword() {
        WebElement confirmPasswordInput = driver.findElement(By.id("confirmPassword"));
        confirmPasswordInput.sendKeys("valid_password");
    }

    @When("valid Birth-date")
    public void userEntersValidBirthDate() {
        WebElement birthDateInput = driver.findElement(By.id("birthdate"));
        birthDateInput.sendKeys("01/01/1990");
    }

    @When("valid Gender")
    public void userEntersValidGender() {
        WebElement genderInput = driver.findElement(By.id("gender"));
        genderInput.sendKeys("Male");
    }

    @When("valid phone number")
    public void userEntersValidPhoneNumber() {
        WebElement phoneNumberInput = driver.findElement(By.id("phoneNumber"));
        phoneNumberInput.sendKeys("1234567890");
    }

    @Then("user registration should be successful")
    public void userRegistrationShouldBeSuccessful() {
        WebElement submitButton = driver.findElement(By.id("submit-button"));
        submitButton.click();

        // You should implement verification that the registration is successful
        // This might involve checking for a success message or navigating to the user's profile page.

        // For this example, we will assume a success message is displayed.
        WebElement successMessage = driver.findElement(By.id("success-message"));
        assertTrue(successMessage.isDisplayed());

        // Close the browser
        driver.quit();
    }
}

