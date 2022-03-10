package adactin.login.auto;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdactinAuto {

	public static void main(String[] args) throws IOException, InterruptedException {

		LibraryGlobal library = new LibraryGlobal();

		library.getdriver();

		library.loadUrl("http://adactinhotelapp.com/");

		library.maximize();

		WebElement userName = library.findElementByxpath("//input[@id='username']");
		String name = library.getData("Data", 1, 0);
		library.type(userName, name);

		WebElement password = library.findElementByxpath("//input[@id='password']");
		String pass = library.getData("Data", 1, 1);
		library.type(password, pass);

		WebElement loginbutton = library.findElementByxpath("//input[@id='login']");
		library.click(loginbutton);

		WebElement location = library.findElementByxpath("//Select[@name='location']");
		library.selectOptionByIndex(location, 4);

		WebElement hotels = library.findElementByxpath("//select[@name='hotels']");
		library.selectOptionByIndex(hotels, 3);

		WebElement roomtype = library.findElementByxpath("//select[@name='room_type']");
		library.selectOptionByIndex(roomtype, 2);

		WebElement numberOfRooms = library.findElementByxpath("//select[@name='room_nos']");
		library.selectOptionByVisibleText(numberOfRooms, "3 - Three");

		WebElement chkInDate = library.findElementByxpath("//input[@name='datepick_in']");
		String date = library.getData("Data", 1, 2);

		WebElement chkoutDate = library.findElementByxpath("//input[@name='datepick_out']");
		String date1 = library.getData("Data", 1, 3);

		WebElement adultsPerRoom = library.findElementByxpath("//select[@name='room_nos']");
		library.selectOptionByVisibleText(adultsPerRoom, "1 - One");

		WebElement childPerRoom = library.findElementByxpath("//select[@name='child_room']");
		library.selectOptionByVisibleText(childPerRoom, "2 - Two");

		WebElement search = library.findElementByxpath("//input[@type='submit']");
		library.click(search);

		WebElement radiobutton = library.findElementByxpath("//input[@name='radiobutton_0']");
		library.click(radiobutton);

		WebElement search1 = library.findElementByxpath("//input[@type='submit']");
		library.click(search1);

		WebElement txtFirstName = library.findElementByxpath("//input[@name='first_name']");
		String firstName = library.getData("Data", 1, 4);
		library.sendKeys(txtFirstName, firstName);

		WebElement txtLastName = library.findElementByxpath("//input[@name='last_name']");
		String lastName = library.getData("Data", 1, 5);
		library.sendKeys(txtLastName, lastName);

		WebElement txtAddress = library.findElementByxpath("//textarea[@name='address']");
		String address = library.getData("Data", 1, 6);
		library.sendKeys(txtAddress, address);

		WebElement numOfCreditCard = library.findElementByxpath("//input[@name='cc_num']");
		String numCC = library.getData("Data", 1, 7);
		library.sendKeys(numOfCreditCard, numCC);

		WebElement CardType = library.findElementByxpath("//select[@name='cc_type']");
		library.selectOptionByVisibleText(CardType, "VISA");

		WebElement CardMonth = library.findElementByxpath("//select[@name='cc_exp_month']");
		library.selectOptionByVisibleText(CardMonth, "March");

		WebElement CardYear = library.findElementByxpath("//select[@name='cc_exp_year']");
		library.selectOptionByVisibleText(CardYear, "2022");

		WebElement CvvNumber = library.findElementByxpath("//input[@name='cc_cvv']");
		String numCCV = library.getData("Data", 1, 8);
		library.sendKeys(CvvNumber, numCCV);

		WebElement BookNow = library.findElementByxpath("(//input[@type=\"button\"])[1]");
		library.click(BookNow);
		Thread.sleep(5000);

		WebElement orderNo = library.findElementByxpath("//input[@name='order_no']");
		String out = library.getAttributeText(orderNo);
		library.writeData("Data", 1, 10, out);
		System.out.println("Ordder ID:" + out);

		library.quit();

	}
}