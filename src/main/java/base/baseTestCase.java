package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class baseTestCase {
    public static WebDriver driver;
    public static Properties test = new Properties(); // create new instance
    public static FileReader fr;

    @BeforeMethod
    public void setup() throws IOException {
        fr = new FileReader("C:\\Users\\argul\\IdeaProjects\\AnkitaFramework\\src\\main\\java\\testdata\\data.properties"); // Read file thorugh filereader
        test.load(fr); // load the file in properties instance
        System.out.println("The URL we are testing is " + test.getProperty("url"));
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(test.getProperty("url"));
    }

    @AfterMethod
    public void teardown(){
        //driver.close();
    }


}

