package TestScenario_PropertyGuru;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PageObjectModel_PropertyGuru.Homepage_SearchObject;
import PageObjectModel_PropertyGuru.Automation_Helper;
import PageObjectModel_PropertyGuru.SearchResult;
import java.util.List;



public class TestCase_PropertyGuruTest
{
    public WebDriver driver;
    static int statusCode;

    @Test(priority =0, enabled = true)
    public void Image_Displayed_Correctly() throws Exception
    {
        Homepage_SearchObject.viewRentOption(driver).click();
        Homepage_SearchObject.selectRentOption(driver).click();
        Homepage_SearchObject.viewPriceLink(driver).click();
        Homepage_SearchObject.selectPriceMaximum(driver).click();
        Homepage_SearchObject.selectMaxPrice15000(driver).click();
        Homepage_SearchObject.selectMoreOptions(driver);
        Homepage_SearchObject.checkWithPhotos(driver).click();
        Homepage_SearchObject.searchButton(driver).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wrapper-inner")));
        SearchResult.clickFirstSearchResult(driver).click();
        WebElement allLink = driver.findElement(By.xpath(".//*[@id='carousel-photos']/ol"));
        List<WebElement> total_images = allLink.findElements(By.tagName("img"));
        for (int i=1;i< total_images.size();i++)
        {
            String url = total_images.get(i).getAttribute("src");
            statusCode = Automation_Helper.getResponseCode(url);
            Assert.assertEquals(200,statusCode);
        }

    }


    @BeforeMethod
    public void setUp() throws Exception
    {
        driver = new FirefoxDriver();
        driver.get("http://www.propertyguru.com.sg");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchbox-n1")));
    }

    @AfterMethod
    public void tearDown() throws Exception
    {
        driver.quit();

    }

}