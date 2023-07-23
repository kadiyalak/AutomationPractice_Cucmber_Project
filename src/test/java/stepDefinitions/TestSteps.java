package stepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;import pageObjects.*;import org.apache.logging.log4j.LogManager;import java.util.List;
import java.time.Duration;
import java.util.HashMap;import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;import io.cucumber.java.Scenario;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.ResourceBundle;
public class TestSteps {
	WebDriver driver;
	ShoppingPage sp;String output1;String output2;
	Logger logger;ResourceBundle rb;String br;List<HashMap<String,String>> datamap;
	
	
	@Before
	public void setUp() {
		logger= LogManager.getLogger(this.getClass());
		rb=ResourceBundle.getBundle("config");
		br=rb.getString("browser");
	}
	@After
	public void tearDown(Scenario scenario) {
		
		System.out.println("Scenariro status:"+scenario.getStatus());
	if(scenario.isFailed()) {byte[] Screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES); 
	scenario.attach(Screenshot,"image/png",scenario.getName());}/*driver.quit();*/}
	@Given("User Launch Browser")
	public void user_launch_browser() {
		if(br.equals("chrome"))   {
			driver =new ChromeDriver();}
			 
			 else if(br.equals("edge"))
			 {
				 driver=new EdgeDriver();
			 }else 
			 {
				 
				 driver=new FirefoxDriver();
			 }
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	@Given("Opens URL {string}")
	public void opens_url(String url) {
		driver.get(url);
	    driver.manage().window().maximize();
	}
	@When("click on the women label")
	public void click_on_the_women_label() {
	    sp=new ShoppingPage(driver);sp.womenclick();
	}

	@When("click on the T-shirt")
	public void click_on_the_t_shirt() {
	    sp.Tshirtclick();
	}

	@When("check the T-shirt name")
	public void check_the_t_shirt_name() {
	   output1=  sp.faded();
	}

	@When("go to search-bar and send {string}")
	public void go_to_search_bar_and_send(String text){sp.search1(text);
	}

	@When("search the tshirt")
	public void search_the_tshirt() {
	    sp.go1();
	}@When("check_the_t_shirt_name1")
	public void check_the_t_shirt_name1() {
	 output2=    sp.tshirtclick1();
	}

	@Then("validate the both shirt names")
	public void validate_the_both_shirt_names() {
	    if(output1.equals(output2)) {System.out.println("both are equal");}else {System.out.println("both are not equal");}
	}




}
