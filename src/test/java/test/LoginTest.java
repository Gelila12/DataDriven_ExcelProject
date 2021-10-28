package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTest {
 
	WebDriver driver;
	ExcelReader excelread = new ExcelReader("src\\main\\java\\data\\aug_2020data.xlsx");
	String userName = excelread.getCellData("LoginInfo", "UserName", 2);
	String password = excelread.getCellData("LoginInfo", "Password", 2);
	
	@Test
	public void validUserShouldBeAbelToLogin() {
		
		driver = BrowserFactory.init();
		          //loginPage=is object variable
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);//object
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickOnSigninButton();
		
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.validateDashboardHeader();
		
	    BrowserFactory.tearDown();
}
}