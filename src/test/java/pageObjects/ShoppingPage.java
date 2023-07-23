package pageObjects;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import java.util.List;
//import org.testng.annotations.DataProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ShoppingPage extends TestBasePage{
	public ShoppingPage(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath="//a[@title='Women']")
WebElement women;
@FindBy(xpath="//li[@class='sfHoverForce']//li[1]//ul[1]//li[1]")
WebElement Tshirt;
@FindBy(xpath="//a[normalize-space()='Faded Short Sleeve T-shirts']")
WebElement fadedshort;
@FindBy(xpath="//input[@id='search_query_top']")
WebElement search;
@FindBy(xpath="//button[@name='submit_search']")
WebElement go;
@FindBy(xpath="//a[@title='Faded Short Sleeve T-shirts'][normalize-space()='Faded Short Sleeve T-shirts']")
WebElement Tshirt1;
public void womenclick() {women.click();}
public void Tshirtclick() {JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", Tshirt);}
public String  faded() {return fadedshort.getText();}
public void search1(String text) {search.sendKeys(text);}
public void go1() {go.click();}
public String tshirtclick1() {return Tshirt1.getText();}



























}