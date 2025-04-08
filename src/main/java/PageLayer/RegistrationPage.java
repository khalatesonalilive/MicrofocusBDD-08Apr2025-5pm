package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.Wait;

public class RegistrationPage extends BaseClass{

	@FindBy(name="givenName")
	private WebElement fname ;
	
	@FindBy(name="sn")
	private WebElement lname ;
	
	@FindBy(name="title")
	private WebElement jobTitle ;
	
	@FindBy(name="webidUserEnteredCompany")
	private WebElement companyName ;
	
	@FindBy(name="l")
	private WebElement city ;
	
	@FindBy(name="postalCode")
	private WebElement  postalCode;
	
	@FindBy(name="webidCountryCode")
	private WebElement countryDropDown  ;
	
	@FindBy(name="st")
	private WebElement stateDropDown ;
	
	@FindBy(name="Language")
	private WebElement languageDropDown ;
	
	@FindBy(name="telephoneNumber")
	private WebElement  telephoneNo;
	
	@FindBy(name="mail")
	private WebElement emailAdd;
	
	public RegistrationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void entersFirstLastName(String fname1, String lname1) throws InterruptedException
	{
		Wait.sendKeys(fname, fname1);
		Thread.sleep(2000);
		Wait.sendKeys(lname, lname1);
		
	}
	
	public void entersjobRoleAndCompanyName(String job,String company) throws Exception
	{
		Thread.sleep(2000);
		Wait.sendKeys(jobTitle, job);
		Wait.sendKeys(companyName, company);
		System.out.println("TC 1 GitHub by Sonali");
		System.out.println("TC 2 GitHub by Nikhil");
		System.out.println("TC 3 GitHub by Sonali");
		System.out.println("TC 4 GitHub by Nikhil");
		System.out.println("TC 5 GitHub by Sonali");
		
		
	}
	
	
	public void address(String ccity, String ppcode, String ccountry) throws Exception
	{
		Thread.sleep(2000);
		Wait.sendKeys(city, ccity);
		Thread.sleep(2000);
		Wait.sendKeys(postalCode, ppcode);
		Thread.sleep(2000);
		HandleDropDown.selectByVisibleText(countryDropDown, ccountry);
	}
	
	public void stateLangTelEmaiInfo(String statee, String llang, String telePhn, String emmailId) throws Exception
	{
		Thread.sleep(2000);
		HandleDropDown.selectByVisibleText(stateDropDown, statee);
		Thread.sleep(2000);
		HandleDropDown.selectByVisibleText(languageDropDown, llang);
		Thread.sleep(2000);
		Wait.sendKeys(telephoneNo, telePhn);
		Thread.sleep(2000);
		Wait.sendKeys(emailAdd, emmailId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
