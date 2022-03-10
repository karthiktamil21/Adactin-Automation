package adaction.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends LibraryGlobal {
	

	public SelectHotelPage() {
		PageFactory.initElements(driver, this);

	}
	
	//Radiobutton-findelement
		//Continuebutton- findelement
		
		@FindBy(xpath = " //input[@name='radiobutton_0']")
		private WebElement radiobutton;
		
		@FindBy(xpath = "//input[@name='continue']")
		private WebElement continueButton;

		public WebElement getRadiobutton() {
			return radiobutton;
		}

		public WebElement getContinueButton() {
			return continueButton;
		}
		
		public void SelectHotel() {
			click(radiobutton);
			click(continueButton);
		}
		
	}