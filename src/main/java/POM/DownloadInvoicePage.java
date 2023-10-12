package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadInvoicePage {
//declaration
	@FindBy(xpath="//input[@name='downloadInvoice']")
	private WebElement downloadInvoice;
	
	//initialization
	public DownloadInvoicePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	 //utilization
	public void downloadInvoiceWebElement()
	{
		downloadInvoice.click();
	}
}
