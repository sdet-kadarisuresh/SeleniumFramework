package drivers;

import utils.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver initDriver() {

        String browser = ConfigReader.getProperty("browser");

        switch (browser.toLowerCase()) {

            case "chrome":

                WebDriverManager.chromedriver().setup();

                driver = new ChromeDriver();

                break;

            case "firefox":

                WebDriverManager.firefoxdriver().setup();

                driver = new FirefoxDriver();

                break;

            case "edge":

                WebDriverManager.edgedriver().setup();

                driver = new EdgeDriver();

                break;

            default:

                throw new RuntimeException("Unsupported Browser : " + browser);

        }

        driver.manage().window().maximize();

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(
                        Integer.parseInt(ConfigReader.getProperty("implicitWait"))));

        return driver;

    }
//added
    public static void quitDriver() {

        if (driver != null) {

            driver.quit();

            driver = null;

        }

    }

}