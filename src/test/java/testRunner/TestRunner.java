package testRunner;
import io.cucumber.junit.Cucumber;import org.junit.runner.RunWith;import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions
(features= {".//Features/"},
	//features= {".//Features/LogIn.feature"},
//features= {".//Features/LogInDDT.feature"},
//features= {".//Features/AddToCart.feature"},
//features={".//Features/Registration.feature"},
//features=@target/return.txt",
glue= "stepDefinitions",
plugin= {"pretty","html:reports/myreport.html","json:reports/myreport.json","rerun:target/rerun.txt",},


dryRun=false,monochrome=false,
//tags="@Regression"
tags="@Sanity and @Regression"
//tags="@Sanity or @Regression"
//tags="@Sanity and not @Regression"
//tags="@Regression and not @Sanity"	
)

public class TestRunner {

}
