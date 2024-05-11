// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class BenutzerregistrierungTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void benutzerregistrierung() {
    driver.get("https://automationexercise.com/");
    driver.manage().window().setSize(new Dimension(1936, 1066));
    driver.findElement(By.linkText("Signup / Login")).click();
    assertThat(driver.findElement(By.cssSelector(".signup-form > h2")).getText(), is("New User Signup!"));
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("ramadbes");
    driver.findElement(By.cssSelector(".signup-form input:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".signup-form input:nth-child(3)")).sendKeys("ramadbes@students.zhaw.ch");
    driver.findElement(By.cssSelector(".btn:nth-child(5)")).click();
    assertThat(driver.findElement(By.cssSelector(".title:nth-child(1) > b")).getText(), is("ENTER ACCOUNT INFORMATION"));
    driver.findElement(By.id("id_gender1")).click();
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("1234567890");
    driver.findElement(By.id("days")).click();
    {
      WebElement dropdown = driver.findElement(By.id("days"));
      dropdown.findElement(By.xpath("//option[. = '1']")).click();
    }
    driver.findElement(By.id("months")).click();
    {
      WebElement dropdown = driver.findElement(By.id("months"));
      dropdown.findElement(By.xpath("//option[. = 'January']")).click();
    }
    driver.findElement(By.id("years")).click();
    {
      WebElement dropdown = driver.findElement(By.id("years"));
      dropdown.findElement(By.xpath("//option[. = '1998']")).click();
    }
    driver.findElement(By.id("newsletter")).click();
    driver.findElement(By.id("optin")).click();
    driver.findElement(By.id("first_name")).click();
    driver.findElement(By.id("first_name")).sendKeys("Besfort");
    driver.findElement(By.id("last_name")).sendKeys("Ramadani");
    driver.findElement(By.id("company")).sendKeys("ZHAW");
    driver.findElement(By.id("address1")).click();
    driver.findElement(By.id("address1")).sendKeys("Musterstrasse 1");
    driver.findElement(By.id("address2")).click();
    driver.findElement(By.id("address2")).sendKeys("Musterstrasse 2");
    driver.findElement(By.id("country")).click();
    {
      WebElement dropdown = driver.findElement(By.id("country"));
      dropdown.findElement(By.xpath("//option[. = 'Singapore']")).click();
    }
    driver.findElement(By.id("state")).click();
    driver.findElement(By.id("state")).sendKeys("Zurich");
    driver.findElement(By.id("city")).sendKeys("Zurich");
    driver.findElement(By.id("zipcode")).sendKeys("8400");
    driver.findElement(By.id("mobile_number")).click();
    driver.findElement(By.id("mobile_number")).sendKeys("123456789");
    driver.findElement(By.cssSelector(".btn:nth-child(22)")).click();
    assertThat(driver.findElement(By.cssSelector("b")).getText(), is("ACCOUNT CREATED!"));
    driver.findElement(By.linkText("Continue")).click();
    assertThat(driver.findElement(By.linkText("Logged in as ramadbes")).getText(), is("Logged in as ramadbes"));
  }
}
