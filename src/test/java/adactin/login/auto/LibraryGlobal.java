package adactin.login.auto;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LibraryGlobal {
	static WebDriver driver;

	String data;

	// 1.Insert the value using js
	public String setAttributewithjs(String attributevalue, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(attributevalue, element);
		return attributevalue;

	}

	// 2.Return Value with js
	public Object getAttributewithjs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object object = js.executeScript("returnarguments[0].getAttribute('value')", element);
		return object;
	}

	// 3.Click with js
	public void Clickusingjs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", element);
	}

	// 4.To select Dropdown by index
	public void selectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	// 5.To Select Dropdown by value
	public void selectOptionByvalue(WebElement element, String attributevalue) {
		Select select = new Select(element);
		select.selectByValue(attributevalue);
	}

	// 6. To Select Dropdown by Txt
	public void selectOptionByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	// 7. To get all options for Dropdown
	public List<WebElement> toGetAllOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	// 8.To get all Selected options in Dropdown
	public List<WebElement> toGetAllSelectedOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;
	}

	// 9.To get first selected option
	public WebElement getFirstSelectedOption(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}

	// 10. TO check whether it is a singlevalue in dropdown or Multiplevalue
	public boolean isDropDownMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	// 11.To delect options by value
	public void deSelectOptionsByValue(WebElement element, String attributevalue) {
		Select select = new Select(element);
		select.deselectByValue(attributevalue);
	}

	// 12. ToDeselect Dropdown by Index
	public void deSelectOptionsByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	// 13. To Deselect Dropdown Txt
	public void deSelectOptionsByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	// 14. TO Deselect All dropdown Option
	public void deSelectAllOPtions(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	// 15. moveto Elelmment
	public void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	// 16. drag and Drop
	public void dragAndDrop(WebElement element) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(element, element).perform();
	}

	// 17. RightClick
	public void rightClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	// 19. Robot
	public void Robot(String data) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_0);
		robot.keyRelease(KeyEvent.VK_0);
	}

	// 18. doubleClick
	public void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	// 20. Type
	public void typeAndEnter(WebElement element, String data) {
		element.sendKeys(data);
	}

	// 21. CapitalType
	public void CapitalType(WebElement element, String data) {
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys(element, data).keyUp(Keys.SHIFT);
	}

	// 22. SimpleAlert
	public void simpleAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	// 23. conformAlert
	public void confrimAlert() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

	// 24.PromtAlert
	public void promptAlert(String data) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(data);
		al.accept();
	}

	// 25. getTextfromAlert
	public String getTextfromAlert() {
		Alert al = driver.switchTo().alert();
		return al.getText();
	}

	// 26. NavigationtoNewUrl
	public void navigateToNewurl(String data) {
		driver.navigate().to(data);
	}

	// 27. NavigatetoBack
	public void navigateBack() {
		driver.navigate().back();
	}

	// 28.NavigateForward
	public void navigateForward() {
		driver.navigate().forward();
	}

	// 30.RefreshWindow
	public void refreshWindow() {
		driver.navigate().refresh();
	}

	// 31 . WindowHandle
	public String windowHandle() {
		String parentId = driver.getWindowHandle();
		return parentId;
	}

	// 32. WindowchildID
	public Set<String> windowHandles() {
		Set<String> allwindowId = driver.getWindowHandles();
		return allwindowId;
	}

	// 33. scrollDown
	public void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	// 34 .scrollUp
	public void scrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	// 35. TakeScreenShord
	public void getScreenShot(String path) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File des = new File(path);
		System.out.println(des);
		FileUtils.copyFile(source, des);
	}

	// 36. swithchFrame
	public void switchFrameid(String locator, String idname) {
		if (locator.equalsIgnoreCase("id")) {
			driver.switchTo().frame(idname);
		} else if (locator.equalsIgnoreCase("name")) {
			driver.switchTo().frame(idname);
		}
	}

	// 37. SwitchFrameindex
	public void switchFrameindex(int index) {
		driver.switchTo().frame(index);
	}

	// 40. SwitchFrameelement
	public void switchFrameelement(WebElement element) {
		driver.switchTo().frame(element);
	}

	// 40. defaultContent()
	public void defaultContent() {
		driver.switchTo().defaultContent();
	}

	// 41. parentFrame
	public void parentFrame() {
		driver.switchTo().parentFrame();
	}
	// 42.get Driver Launch

	public static void getdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	// .43 get current Url

	public String getcurent() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	// 44.To load Url

	public static void loadUrl(String url) {
		driver.get(url);
	}
	// 45.To text from Website

	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	// 46. To get Title

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	// 47.Inerst value in Textbox

	public void sendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}
	// 48. to click button

	public void click(WebElement element) {
		element.click();
	}
	// 49. Find locator using id

	public WebElement findElementById(String attributevalue) {
		WebElement element = driver.findElement(By.id(attributevalue));
		return element;
	}
	// 50.Find locator using name

	public WebElement findElementByName(String attributevalue) {
		WebElement element = driver.findElement(By.name(attributevalue));
		return element;
	}
	// 51. Find locator using className

	public WebElement findElementByClassName(String attributevalue) {
		WebElement element = driver.findElement(By.className(attributevalue));
		return element;
	}
	// 52. Find locator using xpath

	public WebElement findElementByxpath(String attributevalue) {
		WebElement element = driver.findElement(By.xpath(attributevalue));
		return element;
	}
	// 53. to clear the text box value

	public String getAttributeValue(WebElement element) {
		element.clear();
		return data;
	}
	// 54.to get Tagname

	public String getTagName(WebElement element) {
		String tagName = element.getTagName();
		return tagName;
	}

	// 55. EnterNewcSheet
	public void enterNewSheet(String Sheetvalue, int rownum, int cellnum, String data, String path) throws Throwable {
		File file = new File(path);
		Workbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.createSheet(Sheetvalue);
		Row row = sheet.createRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);
	}

	// 56. Maximize
	public static void maximize() {
		driver.manage().window().maximize();
	}

	// 57.Quit
	public static void quit() {
		driver.quit();
	}

	// 58. Close
	public void close() {
		driver.close();
	}

	// get Attribute value
	public String getAttributeText(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;

	}

	public String getData(String sheetName, int rowNum, int cellNum) throws IOException {

		File file = new File("C:\\Users\\Karthik Uchiha\\eclipse-workspace\\Adactin\\Excel\\Integration.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(stream);

		Sheet sheet = workbook.getSheet(sheetName);

		Row row = sheet.getRow(rowNum);

		Cell cell = row.getCell(cellNum);

		CellType type = cell.getCellType();

		switch (type) {
		case STRING:

			data = cell.getStringCellValue();
			break;

		case NUMERIC:

			if (DateUtil.isCellDateFormatted(cell)) {

				Date dateCellValue = cell.getDateCellValue();

				SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yy");

				data = dateformat.format(dateCellValue);
			}

			else {
				double numericCellValue = cell.getNumericCellValue();

				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);

				data = valueOf.toString();
			}

			break;
		default:
			break;
		}
		return data;
	}

	public void updateData(String sheetName, int rowNum, int cellNum, String olddata, String newdata)
			throws IOException {

		File file = new File("C:\\Users\\Karthik Uchiha\\eclipse-workspace\\Adactin\\Excel\\Integration.xlsx");
		FileInputStream stream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(stream);

		Sheet sheet = workbook.getSheet(sheetName);

		Row row = sheet.getRow(rowNum);

		Cell cell = row.getCell(cellNum);

		String text = cell.getStringCellValue();

		if (text.equals(olddata)) {

			cell.setCellValue(newdata);

			FileOutputStream out = new FileOutputStream(file);

			workbook.write(out);

		}
	}

//send keys
	public void type(WebElement element, String typedata) {

		element.sendKeys(typedata);

	}

//write data for excel
	public void writeData(String sheetName, int rowNum, int cellNum, String data) throws IOException {

		File file = new File("C:\\Users\\Karthik Uchiha\\eclipse-workspace\\Adactin\\Excel\\Integration.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(stream);

		Sheet sheet = workbook.getSheet(sheetName);

		Row row = sheet.getRow(rowNum);

		Cell cell = row.createCell(cellNum);

		cell.setCellValue(data);

		FileOutputStream out = new FileOutputStream(file);

		workbook.write(out);

	}
}
