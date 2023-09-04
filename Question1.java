package ExamSept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdeiver.chrome.deriver", "C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		String url = "http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";
		dr.get(url);
		//Test Case 1 Validate title of Page
		
		String ExceptedTitle = "WebDriver | Dropdown Menu(s) | Checkboxe(s) | Radio Button(s)";
		String ActualTitle = dr.getTitle();
		if(ExceptedTitle.equals(ActualTitle)) {
			System.out.println("Test case 1 passed");
		}
		else
		{
			System.out.println("Test case  1 failed");
		}
		
		//Test Case 2 select all the check boxes and asset whether it is checked
		dr.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		 
		 List<WebElement> check= dr.findElements(By.xpath("//input[@type='checkbox']"));
		 System.out.println("total :" + check.size());
		 for(int i =0; i < check.size(); i++)
		 {
			 System.out.println("Check boxes :"+check.get(i).getAttribute("value"));
		 }
		 WebElement isSelected = dr.findElement(By.cssSelector("#checkboxes > label:nth-child(5) > input[type=checkbox]"));
		 boolean e= isSelected.isSelected();
		 if(e) {
			 System.out.println("Test case 2 is passed");
		 }
		 else 
		 {
			 System.out.println("Test case 2 is failed");
		 }
		 // Test Case 3 Select orange a radio button and asset whether it is checked
		 
		 dr.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		 
			List<WebElement> linkes = dr.findElements(By.xpath("//input[@type='radio']"));
			System.out.println("Total :"+ linkes.size());
		 for(int j = 0; j <linkes.size(); j++) 
		 {
			 System.out.println("Radio Button: "+ linkes.get(j).getAttribute("value"));
		 }
			 
	 WebElement isSelected1 = dr.findElement(By.cssSelector("#radio-buttons > input[type=radio]:nth-child(7)"));
			 boolean x = isSelected1.isSelected();
			 if(x) 
			 {
				 System.out.println("Test case 3 is passed.");
			 }
			 else
			 {
				 System.out.println("Test case 3 is failed.");
			 }
			
			 // Test case 4 From first Drop down select python and assert
			 dr.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
			 WebElement select = dr.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]/option[3]"));
			
			 boolean y = select.isSelected();
			 if(y) {
				 System.out.println("Test case 4 is passed");
			 }
			 else 
			 {
				 System.out.println("Test case 4 is failed");
			 }
			 
			 //Test case 5 Validate the heading of the page
			 WebElement head = dr.findElement(By.cssSelector("h1"));
				boolean a= head.isDisplayed();
				if(a) {
					System.out.println("Test case 5 is passed and validate");
					System.out.println(a);
				}
				else 
				{
					System.out.println("Test case 5 is failed");
				}
	}
	
	
}