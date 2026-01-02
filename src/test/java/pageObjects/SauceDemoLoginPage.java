package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SauceDemoLoginPage {
	protected WebDriver driver;
	protected WebDriverWait wait;

	@FindBy(id = "user-name")
	private WebElement UserName;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement Password;

	// : Use XPath for multiple classes
	@FindBy(xpath = "//input[contains(@class, 'submit-button') and contains(@class, 'btn_action')]")
	private WebElement Submit;

	@FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-backpack']")
	private WebElement AddToCart;

	@FindBy(xpath = "//a[@data-test='shopping-cart-link']//span")
	private WebElement cart_Link;

	@FindBy(xpath = "//button[text()='Checkout']")
	private WebElement Checkout;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement first_Name;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement Last_Name;
	
	@FindBy(xpath="//input[@placeholder='Zip/Postal Code']")
	private WebElement zip_Code; 
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continue_BTN;
	
	@FindBy(xpath="//button[text()='Finish']")
	private WebElement Finish;
	
	@FindBy(xpath="//h2[text()='Thank you for your order!']")
	private WebElement ThankYouText;

	public SauceDemoLoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}

	public void SetUserName(String User) {
		wait.until(ExpectedConditions.elementToBeClickable(UserName));
		UserName.clear();
		UserName.sendKeys(User);
	}

	public void SetPassword(String Pass) {
		wait.until(ExpectedConditions.elementToBeClickable(Password));
		Password.clear();
		Password.sendKeys(Pass);
	}

	public void ClickOnSubmit() {
		wait.until(ExpectedConditions.visibilityOf(Submit));
		Submit.click();
	}

	public void ClickOnAddToCart() {
		wait.until(ExpectedConditions.visibilityOf(AddToCart));
		AddToCart.click();

	}

	public void VerifyPageTitleOfProductPage() {
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		cart_Link.click();
	}

	public void ClickOnCheckout() throws InterruptedException {
		
		 wait.until(ExpectedConditions.visibilityOf(Checkout));
		Checkout.click();
	}
	
	public void inputCheckoutInfo(String FirstName, String LastName, String Zip) {
		wait.until(ExpectedConditions.visibilityOf(first_Name));
		first_Name.sendKeys(FirstName);
		Last_Name.sendKeys(LastName);
		zip_Code.sendKeys(Zip);
		
	}
	
	public void ClickOnContinue() {
		continue_BTN.click();
	}
	
	public void ClickOnFinishAndValidateText() {
		Finish.click();
		Assert.assertTrue(ThankYouText.isDisplayed());
		
	}
	
	
	
}
