package testcases;

import base.baseTestCase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class sampletestcase extends baseTestCase {

    @Test
    public static void navigate(){
        driver.findElement(By.xpath(test.getProperty("username"))).sendKeys("Akshay");
        driver.findElement(By.xpath(test.getProperty("useremail"))).sendKeys("Akshay@ankita.com");
    }

    @Test(dataProvider = "TestData")
    public static void dataprovider(String currAddress, String PermAddress){
        driver.findElement(By.xpath(currAddress)).sendKeys("123");
        driver.findElement(By.xpath(PermAddress)).sendKeys("456");
    }


    @DataProvider(name="TestData")
    public Object[][] testdata(){
        return new Object[][]{
                {
                        "//textarea[@id='currentAddress']","//textarea[@id='permanentAddress']"
                }
        };
    }


}


