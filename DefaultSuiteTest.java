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
public class DefaultSuiteTest {
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
  public void formtest() {
    driver.get("https://airtable.com/appcKFdER5L8MJh6P/shrkrmPHMeuz4BcZy");
    driver.manage().window().setSize(new Dimension(1366, 728));
    driver.findElement(By.id("091aa6bc0f720ef0335991237bf93a21")).click();
    driver.findElement(By.id("eb89ff4f4da37545279ccf0471ea028a")).sendKeys("chaise");
    driver.findElement(By.cssSelector(".ml-half > .flex-none")).click();
    driver.findElement(By.id("30943f7580029427ccd0bb46fe4722d1-3")).click();
    driver.findElement(By.cssSelector(".sharedFormField:nth-child(3) .flex-inline > .ml1")).click();
    driver.findElement(By.cssSelector(".absolute > .flex-none")).click();
    driver.findElement(By.cssSelector(".baymax > .justify-center")).click();
    driver.findElement(By.id("c755f3d333310b17cb037afa60684b71")).click();
    driver.findElement(By.id("c755f3d333310b17cb037afa60684b71")).sendKeys("123");
    driver.findElement(By.id("7588dc10ebf73974a2e9a669cfc09771")).click();
    driver.findElement(By.id("7588dc10ebf73974a2e9a669cfc09771")).sendKeys("134");
    driver.findElement(By.cssSelector(".sharedFormField:nth-child(13) .contentEditableTextbox")).click();
    driver.findElement(By.cssSelector(".sharedFormField:nth-child(15) .contentEditableTextbox")).click();
    driver.findElement(By.cssSelector(".submitButton")).click();
    js.executeScript("window.scrollTo(0,0)");
  }
}
