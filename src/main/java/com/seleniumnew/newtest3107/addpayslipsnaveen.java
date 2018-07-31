package com.seleniumnew.newtest3107;


import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addpayslipsnaveen {

	private static WebDriver driver;
	private static final String PAYSLIPS_URL = "http://localhost:8080/employee-payslips/#!/login#employee";

	static HashMap<Object, Object> testresultdata = new HashMap<>();
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "usr/local/bin/chromedriver");

	addbankdetails();
    adddepartment();
    Generatepayslips();
    
	} 
	public static void addbankdetails() {
		try {
			
			System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
			WebDriver driver = new ChromeDriver();
			String baseUrl = "http://localhost:8080/employee-payslips/#!/login#employee";
			driver.get(baseUrl); 
			String login = driver.getTitle(); 
			System.out.println(login);
			String expectedTitle = "Employee Payslips"; 
			//assertEquals(expectedTitle,login);
		  
			WebElement username = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/fieldset/div[1]/input"));
			username.sendKeys("admin");
			username.submit(); 
			WebElement password = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/fieldset/div[2]/input"));
			password.sendKeys("admin");
			password.submit();
			          // click on the Sign in button 
			  
			WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/fieldset/div[4]/button")); 
			loginbutton.click();
			
			WebElement Bankbutton = driver.findElement(By.xpath("//*[@id=\"MainMenu\"]/div[1]/a[5]"));
			Bankbutton.click();
			
			WebElement AddBank = driver.findElement(By.xpath("//*[@id=\"bank\"]/a[1]"));
			AddBank.click();
			
			WebElement Bankname = driver.findElement(By.xpath("//*[@id=\"name\"]"));
			Bankname.sendKeys("INDUSIND");
			//Bankname.submit();
		
		    WebElement IFSCcode = driver.findElement(By.xpath("//*[@id=\"ifsc\"]"));
		    IFSCcode.sendKeys("IIND9997346833");
		    //IFSCcode.submit();
		    
		    WebElement Branchname = driver.findElement(By.xpath("//*[@id=\"branchName\"]"));
		    Branchname.sendKeys("Prakashnagar");
	        //Branchname.submit();	
	        
	        WebElement BankAddress = driver.findElement(By.xpath("//*[@id=\"address\"]"));
	        BankAddress.sendKeys("EasyWay Technologies PVT Ltd..,prakashnagar,sec'bad");
	        
	        
	        WebElement BankDescription = driver.findElement(By.xpath("//*[@id=\"Description\"]"));
	        BankDescription.sendKeys("This is IndudIND bank, Prakashnagar");
	        
	      //click on submit button
			
	      	WebElement Submitbutton = driver.findElement(By.xpath("//*[@id=\"addUserForm\"]/div[6]/div/button"));
	        Submitbutton.click();
	        System.out.println("Bank details added");
		}
	        catch (Exception ex) {
	    		System.out.println("Duplicate entries");
	    		    	}
	
	}
		public static void adddepartment() {
		try {	

			System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
			WebDriver driver = new ChromeDriver();
			String baseUrl = "http://localhost:8080/employee-payslips/#!/login#employee";
			driver.get(baseUrl); 
			String login = driver.getTitle(); 
			System.out.println(login);
			String expectedTitle = "Employee Payslips"; 
			//assertEquals(expectedTitle,login);
		  
			WebElement username = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/fieldset/div[1]/input"));
			username.sendKeys("admin");
			username.submit(); 
			WebElement password = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/fieldset/div[2]/input"));
			password.sendKeys("admin");
			password.submit();
			          // click on the Sign in button 
			  
			WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/fieldset/div[4]/button")); 
			loginbutton.click();
			
			WebElement Departmentbutton = driver.findElement(By.xpath("//*[@id=\"MainMenu\"]/div[2]/a[1]"));
			Departmentbutton.click();
			
			WebElement AddDepartment = driver.findElement(By.xpath("//*[@id=\"department\"]/a[1]"));
			AddDepartment.click();
			
			WebElement Departmentname = driver.findElement(By.xpath("//*[@id=\"name\"]"));
			Departmentname.sendKeys("QualityTestingDepartment");
			
			WebElement DepartmentDescription = driver.findElement(By.xpath("//*[@id=\"description\"]"));
			DepartmentDescription.sendKeys("This department is for QualityAnalizingteam");
			
			//click on submit button
			
			WebElement Submitbutton = driver.findElement(By.xpath("//*[@id=\"addUserForm\"]/div[3]/div/button"));
			Submitbutton.click();
			System.out.println("Department Added");
		}
		catch (Exception ex) {
			System.out.println("no department found");
		//testresultdata.put("2", new Object[] { 1d, "login with valid credentials", "login successful", "Fail" });
		}
		}
		
		public static void Generatepayslips() {
			try {	
				
				System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
				WebDriver driver = new ChromeDriver();
				String baseUrl = "http://localhost:8080/employee-payslips/#!/login#employee";
				driver.get(baseUrl); 
				String login = driver.getTitle(); 
				System.out.println(login);
				String expectedTitle = "Employee Payslips"; 
			//	assertEquals(expectedTitle,login);
			  
				WebElement username = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/fieldset/div[1]/input"));
				username.sendKeys("admin");
				username.submit(); 
				WebElement password = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/fieldset/div[2]/input"));
				password.sendKeys("admin");
				password.submit();
			   // click on the Sign in button 
				  
				WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/fieldset/div[4]/button")); 
				loginbutton.click();
				
		      //click on Generatepayslipsbutton
				
				WebElement Generatepayslipsbutton = driver.findElement(By.xpath("//*[@id=\"MainMenu\"]/div[1]/a[6]"));
				Generatepayslipsbutton.click();
			
				WebElement Addbutton = driver.findElement(By.xpath("//*[@id=\"generate_payslips\"]/a[1]"));
				Addbutton.click();
				
				WebElement Employeename = driver.findElement(By.xpath("//*[@id=\"empname\"]"));                                                      
				Employeename.sendKeys("bharath parshi");
				Employeename.submit();
				
				WebElement Month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
				Month.sendKeys("September");
				Month.submit();
				
				WebElement Year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
				Year.sendKeys("2017");
				Year.submit();
				
				WebElement GetDetailsbutton = driver.findElement(By.xpath("//*[@id=\"addUserForm\"]/div[4]/div/button"));
				GetDetailsbutton.click();
				System.out.println("Payslips generated successfully");
		      }
			catch (Exception ex) {
				System.out.println("Payslips not generated");
		
		
			}
}
}


