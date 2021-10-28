package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.ListCustomersPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class ListCustomersTest {
	 
	
	
	  WebDriver driver;
		ExcelReader excelread = new ExcelReader("src\\main\\java\\data\\aug_2020data.xlsx");
		String userName = excelread.getCellData("LoginInfo", "UserName", 2);
		String password = excelread.getCellData("LoginInfo", "Password", 2);
		String fullName = excelread.getCellData("AddContactInfo", "FullName", 2);
		String companyName= excelread.getCellData("AddContactInfo", "CompanyName", 2);
		String 	email = excelread.getCellData("AddContactInfo", "Email", 2);
		String 	phone = excelread.getCellData("AddContactInfo", "Phone", 2);
		String 	address = excelread.getCellData("AddContactInfo", "Address", 2);
		String 	city = excelread.getCellData("AddContactInfo", "City", 2);
		String 	state = excelread.getCellData("AddContactInfo", "State", 2);
		String 	zip = excelread.getCellData("AddContactInfo", "Zip", 2);
		String 	country = excelread.getCellData("AddContactInfo", "Country", 2);
		
		
		
		@Test
		public void validUserShouldBeAbelToListCustomers()   {
			
			 driver = BrowserFactory.init();
			 
			 LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class); 
			 loginPage.insertUserName(userName );
			 loginPage.insertPassword(password);
			 loginPage.clickOnSigninButton();
			 
			 DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
			 dashboardPage.validateDashboardHeader();
			 dashboardPage.clickOnCustomerButton();
			 dashboardPage.clickOnAddCustomerButton();
			 dashboardPage.clickOnListCustomersButton();
		
			 AddCustomerPage addcustomerpage = PageFactory.initElements(driver, AddCustomerPage.class);
			 addcustomerpage.insertFullName (fullName);
			 addcustomerpage.insertCompanyName(companyName);
			 addcustomerpage.insertEmailAddress(email);
			 addcustomerpage.insertPhoneNumber(phone);
			 addcustomerpage.insertAddress(address);
			 addcustomerpage.insertCity(city);
			 addcustomerpage.insertState(state);
			 addcustomerpage.insertZip(zip);
			 addcustomerpage.enterCountryName(country);
			 addcustomerpage.clickSaveButton();
			
			 ListCustomersPage listcustomerspage = PageFactory.initElements(driver, ListCustomersPage.class);
			 listcustomerspage.clickOnListCustomersButton();
		     //listcustomerspage.verifyEnteredName();
		  
		}
		
		}
		
		