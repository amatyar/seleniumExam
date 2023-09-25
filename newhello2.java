package ExamSept;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newhello2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdeiver.chrome.deriver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();    
        
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
        //Testing for Title 
        String actualTitle=" ";
        actualTitle=driver.getTitle();
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String expectedTitle = actualTitle;
        if(actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test case for makemytrip pass");
        }
        else
        {
            System.out.println("Test  case for makemytrip fail");
        }
         Thread.sleep(500);      
        //Locator for form
        driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']/label")).click();       
        Thread.sleep(500);  
        //from Pune
        driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div > div.fsw.widgetOpen > div.fsw_inner.returnPersuasion > div.fsw_inputBox.searchCity.inactiveWidget.activeWidget > div:nth-child(2) > div > div > div > input")).sendKeys("Pune");        
        
        List<WebElement> Lists = driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));
        
        for(int i = 0; i < Lists.size(); i++) 
        {
            String text = Lists.get(i).getText();
            if(text.contains("Pune, India")) 
            {
                Lists.get(i).click();
                break;
            }
        }       
        
        Thread.sleep(500);  
        //Date
        driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div > div.fsw > div.fsw_inner.returnPersuasion > div:nth-child(4) > label > p.blackText.font20.code.lineHeight36")).click();
        Thread.sleep(500);      
        driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div > div.fsw.widgetOpen > div.fsw_inner.returnPersuasion > div.fsw_inputBox.dates.inactiveWidget.activeWidget > div.datePickerContainer > div > div > div > div.DayPicker > div > div.DayPicker-Months > div:nth-child(2) > div.DayPicker-Body > div:nth-child(2) > div:nth-child(6) > div > p:nth-child(1)")).click();       
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div > div.fsw > p > a")).click();
            
        driver.close();
        driver.quit();
	
	}

}
