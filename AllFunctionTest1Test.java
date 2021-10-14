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
public class AllFunctionTest1Test {
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
  public void allFunctionTest1() {
    driver.get("https://petclinicapp.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1936, 1056));
    driver.findElement(By.cssSelector("li:nth-child(2) span:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".glyphicon-triangle-right")).click();
    driver.findElement(By.linkText("Jeff Black")).click();
    driver.findElement(By.cssSelector(".btn:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.cssSelector(".btn:nth-child(4)")).click();
    driver.findElement(By.id("name")).click();
    driver.findElement(By.id("name")).sendKeys("Testpet");
    driver.findElement(By.id("birthDate")).sendKeys("2020-01-01");
    driver.findElement(By.cssSelector(".form-group:nth-child(4)")).click();
    driver.findElement(By.id("type")).click();
    {
      WebElement dropdown = driver.findElement(By.id("type"));
      dropdown.findElement(By.xpath("//option[. = 'cat']")).click();
    }
    driver.findElement(By.id("name")).click();
    driver.findElement(By.id("name")).click();
    {
      WebElement element = driver.findElement(By.id("name"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id("name")).click();
    driver.findElement(By.id("name")).sendKeys("Bobo");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.cssSelector("li:nth-child(3) > a")).click();
    driver.findElement(By.cssSelector(".glyphicon-triangle-right")).click();
    driver.findElement(By.cssSelector(".glyphicon-triangle-left")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) span")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) span")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(2) span"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector("tr:nth-child(2) span")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1)")).click();
    driver.findElement(By.cssSelector("li:nth-child(4) span:nth-child(2)")).click();
    driver.findElement(By.cssSelector("li:nth-child(1) > a")).click();
  }
}
