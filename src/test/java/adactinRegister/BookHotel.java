package adactinRegister;

//Using Normal Selenium webdriver
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookHotel {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Karthik Uchiha\\eclipse-workspace\\AdactinHotelpage\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();

		WebElement txtUseName = driver.findElement(By.xpath("//input[@name='username']"));
		txtUseName.sendKeys("Karthik2106");

		WebElement txtPassword = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		txtPassword.sendKeys("Moon@123.");

		WebElement btnLogin = driver.findElement(By.xpath("//input[@name=\"login\"]"));
		btnLogin.click();

		WebElement dDnLocation = driver.findElement(By.xpath("//Select[@name=\"location\"]"));

		Select select = new Select(dDnLocation);
		select.selectByIndex(4);

		WebElement dDnHotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select select1 = new Select(dDnHotel);
		select1.selectByIndex(3);

		WebElement dDnRoomType = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select select2 = new Select(dDnRoomType);
		select2.selectByIndex(3);

		WebElement dDnNoOfRoom = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select select3 = new Select(dDnNoOfRoom);
		select3.selectByVisibleText("3 - Three");

		WebElement txtCheckDate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		txtCheckDate.sendKeys("08/02/2022");

		WebElement dDnAdultRoom = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select select4 = new Select(dDnAdultRoom);
		select4.selectByVisibleText("2 - Two");

		WebElement dDnChildrenRoom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select select5 = new Select(dDnChildrenRoom);
		select5.selectByVisibleText("2 - Two");

		WebElement btnSearch = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		btnSearch.click();

		WebElement radioButton = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		radioButton.click();

		WebElement btnSearch1 = driver.findElement(By.xpath("//input[@type='submit']"));
		btnSearch1.click();

		WebElement txtFirstName = driver.findElement(By.xpath("//input[@name='first_name']"));
		txtFirstName.sendKeys("Ram");

		WebElement txtLastName = driver.findElement(By.xpath("//input[@name='last_name']"));
		txtLastName.sendKeys("Kumar");

		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@name='address']"));
		txtAddress.sendKeys("Manapparai,Trichy");

		WebElement txtCreditCard = driver.findElement(By.xpath("//input[@name='cc_num']"));
		txtCreditCard.sendKeys("9876543219876543");

		WebElement dDnCardType = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select select6 = new Select(dDnCardType);
		select6.selectByVisibleText("VISA");

		WebElement dDnCardMonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select select7 = new Select(dDnCardMonth);
		select7.selectByVisibleText("March");

		WebElement dDnCardYear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select select8 = new Select(dDnCardYear);
		select8.selectByVisibleText("2022");

		WebElement txtCvvNumber = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		txtCvvNumber.sendKeys("003");

		WebElement btnBookNow = driver.findElement(By.xpath("(//input[@type=\"button\"])[1]"));
		btnBookNow.click();

		Thread.sleep(8000);

		WebElement orderNo = driver.findElement(By.xpath("//input[@name='order_no']"));
		 String attribute = orderNo.getAttribute("value");
		 System.out.println(attribute);

	}

}
