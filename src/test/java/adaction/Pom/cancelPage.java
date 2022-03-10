package adaction.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cancelPage extends LibraryGlobal {

	public cancelPage() {
		PageFactory.initElements(driver, this);

	}

	// Click
	// find the ID
	// clickGo
	// clickID
	// Cancel

	@FindBy(xpath = "//a[@href='BookedItinerary.php']")
	private WebElement cancellink;

	@FindBy(xpath = "//input[@name='order_id_text']")
	private WebElement searchID;

	@FindBy(xpath = "//input[@name='search_hotel_id']")
	private WebElement Go;

	@FindBy(xpath = "//input[@name='ids[]']")
	private WebElement radiobutton;

	@FindBy(xpath = "//input[@name='cancelall']")
	private WebElement cancel;

	// getters
	public WebElement getCancellink() {
		return cancellink;
	}

	public WebElement getSearchID() {
		return searchID;
	}

	public WebElement getGo() {
		return Go;

	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getCancel() {
		return cancel;
	}

	// Businesslogic
	public void cancel(String data) throws InterruptedException {
		click(cancellink);
		typeAndEnter(getSearchID(), data);
		click(Go);
		click(radiobutton);
		click(cancel);
		
		simpleAlert();
		typeAndEnter(getSearchID(), data);
		click(Go);

	}
}
