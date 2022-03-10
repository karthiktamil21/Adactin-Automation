package adactin.testNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookhotelPage extends LibraryGlobal {

	public BookhotelPage() {
		PageFactory.initElements(driver, this);

	}

	// FirstName - findelement-typeandenter
	// lastname - findelement-typeandenter
	// Billing Address - findelement-typeandenter
	// creitCardNumber- findelement-typeandenter
	// CreditCrdtype- findelement-selectdropdown
	// Expirymonth- findelement-selectdropdown
	// ExpiryYear-findelement-selectdropdown
	// CVV number-findelement-typeandenter
	// Booknow=Findelement-Click

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastName;
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement billingAddress;
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement creditcard;
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement creditcardtype;
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expirymonth;
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expiryYear;
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvvNumber;
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement booknow;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public void bookHotel(String Firstname, String LastName, String BilingAddress, String creditcard, String CVV,
			int cardtype, int expmonth, int expyear) {
		// BusinessLogics

		typeAndEnter(getFirstName(), Firstname);
		typeAndEnter(getLastName(), LastName);
		typeAndEnter(getBillingAddress(), BilingAddress);
		typeAndEnter(getCreditcard(), creditcard);
		selectOptionByIndex(creditcardtype, cardtype);
		selectOptionByIndex(expirymonth, expmonth);
		selectOptionByIndex(expiryYear, expyear);
		typeAndEnter(getCvvNumber(), CVV);
		click(booknow);

	}

}
