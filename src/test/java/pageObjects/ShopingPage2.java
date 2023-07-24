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
public class ShopingPage2 extends TestBasePage{
	public ShopingPage2(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath="//a[@title='Women']")
WebElement women;
@FindBy(xpath="//li[@class='sfHoverForce']//li[1]//ul[1]//li[1]")
WebElement Tshirt;
@FindBy(xpath="//span[normalize-space()='More']")
WebElement more;
@FindBy(xpath="//a[@class='btn btn-default button-plus product_quantity_up']//span")
WebElement increase;
@FindBy(xpath="//select[@id='group_1']")
WebElement size;
@FindBy(xpath="//a[@id='color_14']")
WebElement color;
@FindBy(xpath="//span[normalize-space()='Add to cart']")
WebElement Addtocart;
@FindBy(xpath="//a[@title='Close']")
WebElement close;
@FindBy(xpath="//a[@title='View my shopping cart']")
WebElement shoppingcart;
@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
WebElement checkout;
/*@FindBy(xpath="")
WebElement more;*/













public void womenclick() {women.click();}
public void Tshirtclick() {JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", Tshirt);}
public void moreClick() {JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", more);}
public void increaseClick() {increase.click();};
public void sizeclick() {Select month1=new Select(size);

//month1.selectByVisibleText("Apr");
//use this if value attribute is present in option tag
//month1.selectByValue("6");
month1.selectByIndex(2);/*size.click();*/}
public void colorclick() {color.click();}
public void addtocartclick() {Addtocart.click();} 
public void closeclick() {close.click();}
public void shoppingclick() {shoppingcart.click();}
public void proceed() {checkout.click();}

















}





























