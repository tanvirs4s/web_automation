package PageObjectModel_PropertyGuru;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Created by tanvir on 8/6/17.
 */
public class Automation_Helper
{
        public static int getResponseCode(String urlString) throws MalformedURLException, IOException
        {
                URL u = new URL(urlString);
                HttpURLConnection huc = (HttpURLConnection) u.openConnection();
                huc.setRequestMethod("GET");
                huc.connect();
                return huc.getResponseCode();
        }


}
