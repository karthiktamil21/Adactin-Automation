package adactin.testNG;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class confimationPage extends LibraryGlobal {
	
	public confimationPage() {
		PageFactory.initElements(driver, this);

	}
	//OrderId
		@FindBy(xpath = "//input[@name='order_no']")
		private WebElement OrderID;

		public WebElement getOrderID() {
			return OrderID;
		}
		
		public void PrintingorderId(String sheetName, int row, int cell,String data) throws IOException  {
			String orderId = getAttributeText(getOrderID());
			writeData("Data", 1, 10, orderId);
			System.out.println("order id:"+orderId);
			
		}	
		

	}