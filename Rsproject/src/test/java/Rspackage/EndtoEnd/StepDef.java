package Rspackage.EndtoEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
WebDriver driver;
@Given("^User is on the Rs component website$")
public void Method1 (){
System.setProperty("webdriver.chrome.driver","C:\\Users\\simeo\\Downloads\\chromedriver_win32.exe" );
driver=new ChromeDriver();
driver.get("http://uk.rs-online.com/web");
}
@When("^ User clicks on our brand Tab$")
public void Method2(){
driver.findElement(By.xpath("/html/body/div[4]/div/ul/li[2]/a")).click();
driver.close();
}
@Then("user should access different brand types$")
public void Method3(){
driver.findElement(By.xpath("/html/body/div[4]/div/ul/li[2]/a")).isSelected();
}
@Given("^ User is on the Rs component website$")
public void Method4(){
driver.get("http://uk.rs-online.com/web");
}
@When("^User clicks on our new product Tab$")
public void Method5(){
driver.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]/a")).click();
}
@Then("^User should access different product types$")
public void Method6(){
driver.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]/a")).isSelected();
driver.close();
}
@Given("^User is on the Rs component website$")
public void Method7(){
driver.get("http://uk.rs-online.com/web");
}
@When("^User types search products in the search field$")
public void Method8(){
driver.findElement(By.id("searchTerm")).sendKeys("products");	
}
@Then("^User should be able to view results$")
public void Method9(){
driver.findElement(By.id("searchTerm")).isDisplayed();
driver.close();
}
@Given("^User is on the Rs component website$")
public void Method10(){
driver.get("http://uk.rs-online.com/web");
}
@When("^User types search connectors in the search field$")
public void Method11(){
driver.findElement(By.id("searchTerm")).sendKeys("connectors");
}
@Then(" User should be able to view results")
public void Method12(){
driver.findElement(By.id("searchTerm")).isDisplayed();
}
}
