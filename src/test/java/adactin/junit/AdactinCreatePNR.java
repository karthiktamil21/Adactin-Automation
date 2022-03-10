package adactin.junit;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class AdactinCreatePNR extends LibraryGlobal {

	@BeforeClass
	public static void before() {

		getdriver();
		loadUrl("https://adactinhotelapp.com/index.php");
		maximize();
	}

	@AfterClass
	public static void after() {
		// close();
	}

	@Test
	public void login() throws IOException, InterruptedException {

		WebElement userName = findElementByxpath("//input[@id='username']");
		type(userName, getData("Data", 1, 0));
		String name = getAttributeText(userName);
		Assert.assertEquals("Verify username", "Karthik2106", name);
		System.out.println("UserName:" + name);

		WebElement passWord = findElementByxpath("//input[@id='password']");
		type(passWord, getData("Data", 1, 1));
		String pass = getAttributeText(passWord);
		Assert.assertEquals("Verify password", "Moon@123.", pass);
		System.out.println("Password:" + pass);

		WebElement login = findElementByxpath("//input[@id='login']");
		click(login);

		String title = driver.getTitle();
		boolean contains = title.contains("Adactin.com - Search Hotel");
		System.out.println("Title of page:" + title);
		Assert.assertTrue("verify title", contains);

		WebElement location = findElementByxpath("//Select[@name='location']");
		selectOptionByIndex(location, 4);
		String locationAst = getAttributeText(location);
		Assert.assertEquals("Verify location", "Adelaide", locationAst);

		WebElement hotels = findElementByxpath("//select[@name='hotels']");
		selectOptionByIndex(hotels, 3);
		String hotel = getAttributeText(hotels);
		Assert.assertEquals("Verify hotels", "Hotel Hervey", hotel);

		WebElement roomtype = findElementByxpath("//select[@name='room_type']");
		selectOptionByIndex(roomtype, 2);
		String roomtypes = getAttributeText(roomtype);
		Assert.assertEquals("Verify roomtype", "Double", roomtypes);

		WebElement numberOfRooms = findElementByxpath("//select[@name='room_nos']");
		selectOptionByIndex(numberOfRooms, 3);
		String numberOfRoomsast = getAttributeText(numberOfRooms);
		Assert.assertEquals("Verify numberOfRooms", "3", numberOfRoomsast);

		WebElement chkInDate = findElementByxpath("//input[@name='datepick_in']");
		type(chkInDate, getData("Data", 1, 2));
		String chkInDateast = getAttributeText(chkInDate);
		Assert.assertEquals("Verify chkInDate", "21/02/2022", chkInDateast);

		WebElement chkoutDate = findElementByxpath("//input[@name='datepick_out']");
		type(chkoutDate, getData("Data", 1, 3));
		String chkoutDateast = getAttributeText(chkoutDate);
		Assert.assertEquals("Verify chkoutDate", "22/02/2022", chkoutDateast);

		WebElement audltperRoom = findElementByxpath("//select[@name='adult_room']");
		selectOptionByIndex(audltperRoom, 1);
		String audltroomAst = getAttributeText(audltperRoom);
		Assert.assertEquals("Verify numberOfRooms", "1", audltroomAst);

		WebElement childPerRoom = findElementByxpath("//select[@name='child_room']");
		selectOptionByIndex(childPerRoom, 1);
		String childPerRoomAst = getAttributeText(childPerRoom);
		Assert.assertEquals("Verify childPerRoom", "1", childPerRoomAst);

		WebElement search = findElementByxpath("//input[@type='submit']");
		click(search);

		WebElement page2 = findElementByxpath("//td[@class='welcome_menu'][1]");
		String text = getText(page2);
		boolean select = text.contains("Welcome to Adactin Group of Hotels");
		Assert.assertTrue("verify title", select);
		System.out.println("Welcome page:" + text);

		WebElement radio = findElementByxpath("//input[@name='radiobutton_0']");
		click(radio);

		WebElement contBtn = findElementByxpath("//input[@type='submit']");
		click(contBtn);

		WebElement firstName = findElementByxpath("//input[@name='first_name']");
		type(firstName, getData("Data", 1, 4));
		String astFirst = getAttributeText(firstName);
		Assert.assertEquals("Verify First Name", "karthik", astFirst);

		WebElement lastName = findElementByxpath("//input[@name='last_name']");
		type(lastName, getData("Data", 1, 5));
		String astlast = getAttributeText(lastName);
		Assert.assertEquals("Verify Last Name", "Raja", astlast);

		WebElement address = findElementByxpath("//textarea[@name='address']");
		type(address, getData("Data", 1, 6));
		String astAddress = getAttributeText(address);
		Assert.assertEquals("Verify Adress", "Ramanathapuram", astAddress);

		WebElement numOfCreditCard = findElementByxpath("//input[@name='cc_num']");
		type(numOfCreditCard, getData("Data", 1, 7));
		String astnumOfCreditCard = getAttributeText(numOfCreditCard);
		Assert.assertEquals("Verify CreditcardNumber", "6988123456780981", astnumOfCreditCard);

		WebElement CardType = findElementByxpath("//select[@name='cc_type']");
		selectOptionByIndex(CardType, 2);
		String astCardType = getAttributeText(CardType);
		Assert.assertEquals("Verify CardType", "VISA", astCardType);

		WebElement CardMonth = findElementByxpath("//select[@name='cc_exp_month']");
		selectOptionByIndex(CardMonth, 4);
		String astCardMonth = getAttributeText(CardMonth);
		Assert.assertEquals("Verify CardMonth", "4", astCardMonth);

		WebElement CardYear = findElementByxpath("//select[@name='cc_exp_year']");
		selectOptionByIndex(CardYear, 12);
		String astCardYear = getAttributeText(CardYear);
		Assert.assertEquals("Verify Adress", "2022", astCardYear);

		WebElement CvvNumber = findElementByxpath("//input[@name='cc_cvv']");
		type(CvvNumber, getData("Data", 1, 8));
		String astCvvNumber = getAttributeText(CvvNumber);
		Assert.assertEquals("Verify CvvNumber", "4560", astCvvNumber);

		WebElement book = findElementByxpath("(//input[@type=\"button\"])[1]");
		click(book);
		Thread.sleep(5000);

		WebElement boookingConfimed = findElementByxpath("//td[@class='login_title']");
		String page3 = getText(boookingConfimed);
		boolean Confirmation = page3.contains("Booking Confirmation");
		Assert.assertTrue("verify boookingConfimed", Confirmation);
		System.out.println("Confirmation page:" + page3);

		WebElement orderNo = findElementByxpath("//input[@name='order_no']");
		String orderNumber = getAttributeText(orderNo);
		System.out.println("Order number:" + orderNumber);

	}

}
