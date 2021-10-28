package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class ListCustomersPage extends BasePage {
	
     WebDriver driver;
	
	public ListCustomersPage(WebDriver driver) {
	this.driver = driver;
	}
	
	//Element Lib
	
			
			@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") 
			WebElement FULLNAME_FIELD_LOCATER;
			@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") 
			WebElement COMPANY_FIELD_LOCATER;
			@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]") 
			WebElement EMAIL_FIELD_LOCATER;
			@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]") 
			WebElement PHONE_FIELD_LOCATER;
			@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]") 
			WebElement ADDRESS_FIELD_LOCATER;
			@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]") 
			WebElement CITY_FIELD_LOCATER;
			@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]") 
			WebElement STATE_FIELD_LOCATER;
			@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]") 
			WebElement ZIP_FIELD_LOCATER;
			@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]") 
			WebElement COUNTRY_FIELD_LOCATER;
		    @FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]") 
		    WebElement SAVE_BUTTON_LOCATOR;
			
			@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
			WebElement ADD_CUSTOMER_BUTTON_LOCATOR;
			@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a") 
			WebElement  LIST_CUSTOMERS_BUTTON_LOCATOR;
				
			//Interactive Methods
			
			
			 String enteredName;
			public void insertFullName(String fullName ) {
			        int genNum = randomGenerator(999);
			        enteredName = fullName + genNum  ;
					FULLNAME_FIELD_LOCATER.sendKeys(enteredName  );
				}
			
				public void insertCompanyName(String companyName) {
					selectDropDown(COMPANY_FIELD_LOCATER, companyName);
				}

				public void insertEmailAddress(String email) {
					int genNum = randomGenerator(999);
					EMAIL_FIELD_LOCATER.sendKeys(genNum + email);
				}
				
					public void insertPhoneNumber(String phone) {
						int genNum = randomGenerator(999);
						PHONE_FIELD_LOCATER.sendKeys(genNum + phone);
					}
					

					public void insertAddress(String address) {
						ADDRESS_FIELD_LOCATER.sendKeys(address);
					}
					
					public void insertCity(String city) {
						CITY_FIELD_LOCATER.sendKeys( city);
					}	
					
					public void insertState(String state) {
							STATE_FIELD_LOCATER.sendKeys(state);
					}
					
					 public void insertZip(String zip) {
						 ZIP_FIELD_LOCATER.sendKeys(zip);
				    }
					 
				   public void enterCountryName(String countryName) {
					selectDropDown(COUNTRY_FIELD_LOCATER, countryName);
				    }

				   public void clickSaveButton() {				  
					   SAVE_BUTTON_LOCATOR.click();
					  
				   }
				   public void clickOnAddCustomerButton() {
					   ADD_CUSTOMER_BUTTON_LOCATOR.click();
				   }

			       public void clickOnListCustomersButton() {
			    	   waitForElement(driver, 10, SAVE_BUTTON_LOCATOR);
					   LIST_CUSTOMERS_BUTTON_LOCATOR.click();
					  
				   }   
			      

//Log4j=loging the activity
//listener


//Log4j //listener

//tbody/tr[1]/td[3]
//tbody/tr[2]/td[3]
//tbody/tr[3]/td[3]
//tbody/tr[i]/td[3]
//tbody/tr[1]/td[3]/following-sibling::td[4]/a[2]

   public void verifyEnteredName() {
	String before_xpath = "//tbody/tr[";
	String after_xpath = "]/td[3]";

	for(int i = 1; i <= 10; i++) {
		String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
//		System.out.println(name);
//		Assert.assertEquals(name, enteredName, "Entered name doesnot exist!!");
//		break;

		if(name.contains(enteredName)) {
			System.out.println("entered name exist");
			driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]/following-sibling::td[4]/a[2]")).click();
		}
	}
   }

}
