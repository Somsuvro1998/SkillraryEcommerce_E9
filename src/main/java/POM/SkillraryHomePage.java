package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {
//Declaration
	//address of gears webelement
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	//address of skillrary demo app
	@FindBy(xpath="//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	//address of search text field
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchTf;
	//address of search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchicon;
	//address of coockies
	@FindBy(xpath="//a[@class='close_coockies']")
	private WebElement coockies;
	
	//initialization
	public SkillraryHomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	//Utilization
	public void gearsButton()
	{
		gearsbtn.click();
	}
	public void skillrarydemoappWebElement()
	{
		skillrarydemoapp.click();
	}
	public void searchiconWebElement()
	{
	searchicon.clear();	
	}
	public void coockieIcon()
	{
		coockies.click();
	}
}
