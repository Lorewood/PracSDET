import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class case2 {
    public static WebDriver driver;

    @BeforeClass
    public static void setup() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        String URL = "https://google.com";
        String Node = "http://localhost:4444";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WIN10);
        driver = new RemoteWebDriver(new URL(Node), capabilities);
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void calculator() {
        driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("Калькулятор");
        driver.findElement(By.cssSelector(".gNO89b")).click();

        driver.findElement(By.cssSelector("div[jsname='abcgof']")).click();
        driver.findElement(By.cssSelector("div[jsname='WxTTNd']")).click();
        driver.findElement(By.cssSelector("div[jsname='bkEvMb']")).click();
        driver.findElement(By.cssSelector("div[jsname='Pt8tGc']")).click();
    }
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
