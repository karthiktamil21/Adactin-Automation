package adaction.Pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibraryGlobal {

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

//Username-findelemeent
//password-findelement
//ClickButton-findelement

	@FindBy(id = "username")
	private WebElement userNameBox;

	@FindBy(id = "password")
	private WebElement passWordBox;

	@FindBy(id = "login")
	private WebElement clickButton;

//gettere
	public WebElement getUserNameBox() {
		return userNameBox;
	}

	public WebElement getPassWordBox() {
		return passWordBox;
	}

	public WebElement getClickButton() {
		return clickButton;
	}

//Businesslogic
	public void Login(String string, String data) throws IOException {
		typeAndEnter(userNameBox, getData("Data", 1, 0));
		typeAndEnter(passWordBox, getData("Data", 1, 1));
		click(getClickButton());

	}

}
