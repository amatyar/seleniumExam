package ExamSept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newhello {

	
		public static void main(String[] args) throws InterruptedException  {
			System.setProperty("webdeiver.chrome.deriver", 
					"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
          
            driver.get("https://www.makemytrip.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            String actualTitle=" ";
            actualTitle=driver.getTitle();
            String url=driver.getCurrentUrl();
            System.out.println(url);
            String expectedTitle=actualTitle;
            if(actualTitle.contentEquals(expectedTitle)){
                System.out.println("Test case pass");
            }
            else{
                System.out.println("Test  casefail");
            }
            WebElement roundtrip=driver.findElement(By.xpath(".//label[@class='label_text flight-trip-type']"));
            roundtrip.click();
            System.out.println("Select one way option");
            WebElement we = driver.findElement(By.xpath(".//div/section/div/div/input[@id='hp-widget__sfrom']"));
            we.clear();
            Thread.sleep(3000);
            we.sendKeys("hyde");
            Thread.sleep(3000);
            we.sendKeys(Keys.RETURN);

            }
	
	}


