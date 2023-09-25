package ExamSept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question01 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdeiver.chrome.deriver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		String url= "https://www.makemytrip.com/";
		dr.get(url);
		dr.manage().window().maximize();
		WebElement enable= dr.findElement(By.cssSelector("#search-widget > div > div.hsw_inputBox.tripTypeWrapper > ul > li:nth-child(1)"));
		//WebElement from =dr.findElement(By.cssSelector("#fromCity"));
		WebElement from =dr.findElement(By.name("//div[@class='fsw_inputBox searchCity inactiveWidget activeWidget']/div/div/div/div/input"));
		//WebElement to = dr.findElement(By.cssSelector("#toCity"));
		WebElement to = dr.findElement(By.id("To"));
		//WebElement Dept = dr.findElement(By.cssSelector("#departure"));
		WebElement Dept = dr.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/label/span/text()"));
		//WebElement Return = dr.findElement(By.cssSelector("#return"));
		WebElement submit = dr.findElement(By.cssSelector("search-buton"));
		
		
		from.sendKeys("Nagpur,India");
		to.sendKeys("Mumbai,India");
		Dept.sendKeys("26Sep'23");
		//Return.sendKeys("4Oct'23");
		submit.click();
		// Case testing --
		if(dr.getTitle().equals("MakeMyTrip USA - #1 Travel Website for Flight Booking, Airline Tickets"))
		{
			System.out.println("Test case pass");
		}
		else
			
		{
			System.out.println("Test case fail");
		}
		
		
		dr.close();
		dr.quit();
	}

}



//<input type="text" autocomplete="off" aria-autocomplete="list" aria-controls="react-autowhatever-1" 
//class="react-autosuggest__input react-autosuggest__input--open" placeholder="From" value="">
