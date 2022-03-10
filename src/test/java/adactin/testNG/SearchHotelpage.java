package adactin.testNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelpage extends LibraryGlobal {
	
	public SearchHotelpage() {
		PageFactory.initElements(driver, this);

	}

	// location-
	// Hotel-
	// Roomtype
	// NoofRooms
	// AdultsperRoom
	// ChildperRoom
	// Searchbutton

	@FindBy(id = "location")
	private WebElement locationdropdown;

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotelsdropdown;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomtypedropdown;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement roomnosdropdown;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adultdropdown;

	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement childdropdown;

	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement searchButton;

	public WebElement getLocationdropdown() {
		return locationdropdown;
	}

	public WebElement getHotelsdropdown() {
		return hotelsdropdown;
	}

	public WebElement getRoomtypedropdown() {
		return roomtypedropdown;
	}

	public WebElement getRoomnosdropdown() {
		return roomnosdropdown;
	}

	public WebElement getAdultdropdown() {
		return adultdropdown;
	}

	public WebElement getChilddropdown() {
		return childdropdown;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	// Business Logic

	public void searchHotel(int location, int Hotels, int Roomtype, int NoofRooms, int Adults, int Child) {
		selectOptionByIndex(locationdropdown, location);
		selectOptionByIndex(hotelsdropdown, Hotels);
		selectOptionByIndex(roomtypedropdown, Roomtype);
		selectOptionByIndex(roomnosdropdown, NoofRooms);
		selectOptionByIndex(adultdropdown, Adults);
		selectOptionByIndex(childdropdown, Child);
		click(searchButton);

	}

}
