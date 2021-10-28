package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage {
	
     WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
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
			
//			 String enteredName;
//			public void insertFullName(String fullName ) {
//			        int genNum = randomGenerator(999);
//			        enteredName = fullName + genNum  ;
//					FULLNAME_FIELD_LOCATER.sendKeys(enteredName  );
//				}
			
			public void insertFullName(String fullname ) {
			        int genNum = randomGenerator(99);
					FULLNAME_FIELD_LOCATER.sendKeys(fullname + genNum  );
				}
			
				public void insertCompanyName(String companyName) {
					selectDropDown(COMPANY_FIELD_LOCATER, companyName);
				}

				public void insertEmailAddress(String email) {
					int genNum = randomGenerator(99);
					EMAIL_FIELD_LOCATER.sendKeys(genNum + email);
				}
				
					public void insertPhoneNumber(String phone) {
						int genNum = randomGenerator(99);
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
					   waitForElement(driver,10, SAVE_BUTTON_LOCATOR);  
				   }
				   public void clickOnAddCustomerButton() {
					   ADD_CUSTOMER_BUTTON_LOCATOR.click();
				   }

			       public void clickOnListCustomersButton() {
					   LIST_CUSTOMERS_BUTTON_LOCATOR.click();
					
				   }

			}


//Log4j=loging the activity
//listener





