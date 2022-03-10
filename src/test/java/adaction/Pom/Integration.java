package adaction.Pom;
//Page Object model

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Integration extends LibraryGlobal {

	@BeforeClass
	public static void beforeclass() {
		getdriver();
		loadUrl("https://adactinhotelapp.com/index.php");
		maximize();

	}

	@AfterClass

	public static void AfterClass() {
		// quit();

	}

	@Test

	public void LoginPage() throws IOException, Throwable {
		LoginPage Homepage = new LoginPage();
		Homepage.Login(getData("Data", 1, 0), getData("Data", 1, 1));

		SearchHotelpage search = new SearchHotelpage();
		search.searchHotel(4, 3, 2, 4, 2, 1);

		SelectHotelPage selectpage = new SelectHotelPage();
		selectpage.SelectHotel();

		BookhotelPage bookPage = new BookhotelPage();
		bookPage.bookHotel(getData("Data", 1, 4), getData("Data", 1, 5), getData("Data", 1, 6), getData("Data", 1, 7),
				getData("Data", 1, 8), 2, 3, 12);
		Thread.sleep(5000);

	
		confimationPage confim = new confimationPage();
		confim.PrintingorderId("Data", 1, 10, data);
		
		cancelPage cancel = new cancelPage();
		cancel.cancel(getData("Data", 1, 10));
		
		
		
		
	}
}
